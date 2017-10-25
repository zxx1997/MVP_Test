package baway.com.mvp_test.presenter;

import android.content.Context;

import java.io.IOException;

import baway.com.mvp_test.mode.LoginListener;
import baway.com.mvp_test.mode.LoginModel;
import baway.com.mvp_test.mode.bean.LoginBean;
import baway.com.mvp_test.view.IMainListener;

/**
 * Created by admin on 2017/10/24/024.
 */

public class MainPresenter {
    private IMainListener iMainListener;

    private Context context;

    private final LoginModel loginModel;

    public MainPresenter(IMainListener iMainListener) {
        this.context= (Context) iMainListener;
        this.iMainListener=iMainListener;
        loginModel=new LoginModel(context);
    }
    public  void login(){
        String acount=iMainListener.getAccount();
        String pwd=iMainListener.getPwd();
        loginModel.login(acount, pwd, new LoginListener() {
            @Override
            public void onSuccess(LoginBean bean) {
                StringBuilder sb=new StringBuilder();
                sb.append("  "+bean.getDatas().getUserid());
                sb.append(" "+bean.getDatas().getKey());
                iMainListener.setResult(sb.toString());
            }

            @Override
            public void onError(IOException e) {

            }
        });
    }
}
