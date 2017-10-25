package baway.com.mvp_test.mode;

import java.io.IOException;

import baway.com.mvp_test.mode.bean.LoginBean;

/**
 * Created by admin on 2017/10/24/024.
 */

public interface LoginListener {
    public void onSuccess(LoginBean bean);

    public void onError(IOException e);
}
