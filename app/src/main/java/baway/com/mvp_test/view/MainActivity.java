package baway.com.mvp_test.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import baway.com.mvp_test.R;
import baway.com.mvp_test.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,IMainListener{

    private EditText etAccount;
    private EditText etPwd;
    private Button btLogin;
    private Button btExit;
    private TextView tv;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter=new MainPresenter(this);

        initView();
    }

    private void initView() {
        etAccount = (EditText) findViewById(R.id.etAccount);
        etPwd = (EditText) findViewById(R.id.etPwd);
        btLogin = (Button) findViewById(R.id.btLogin);
        btExit = (Button) findViewById(R.id.btExit);
        tv = (TextView) findViewById(R.id.tv);
        btLogin.setOnClickListener(this);
        btExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btLogin:
                presenter.login();
                break;
            case R.id.btExit:

                break;
        }
    }

    @Override
    public String getAccount() {
        return etAccount.getText().toString().trim();
    }

    @Override
    public String getPwd() {
        return etPwd.getText().toString().trim();
    }

    @Override
    public void setResult(String str) {
        tv.setText(str);
    }
}
