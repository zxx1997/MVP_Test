package baway.com.mvp_test.mode;

import android.content.Context;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

import baway.com.mvp_test.mode.bean.LoginBean;
import baway.com.mvp_test.net.Api;
import baway.com.mvp_test.net.OkHttpUtils;

/**
 * Created by admin on 2017/10/24/024.
 */

public class LoginModel {
    private Context context;
    public LoginModel(Context context){
        this.context=context;
    }

    public void login(String account, String pwd, final LoginListener listener){
        Map<String,String> map=new HashMap<>();
        map.put("username",account);
        map.put("password",pwd);
        map.put("client","android");

        OkHttpUtils.getInstance(context).sendDataForClicent(Api.LOGIN, map, new OkHttpUtils.FuncJsonString() {
            @Override
            public void onResponse(String result) {
                LoginBean bean=new Gson().fromJson(result,LoginBean.class);
                listener.onSuccess(bean);
            }
        });
    }
}

