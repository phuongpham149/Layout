package com.example.phuong.layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.phuong.layout.model.Account;

/**
 * Created by phuong on 08/11/2016.
 */

public class ShowDataRegister extends AppCompatActivity {
    private TextView mTvUsername;
    private TextView mTvPassword;
    private TextView mTvGender;
    private TextView mTvEmail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_register);

        mTvEmail = (TextView) findViewById(R.id.tvDataEmail);
        mTvGender = (TextView) findViewById(R.id.tvDataGender);
        mTvPassword = (TextView) findViewById(R.id.tvDataPassword);
        mTvUsername = (TextView) findViewById(R.id.tvDataUsername);

        Bundle bundle = getIntent().getExtras();
        Account account = bundle.getParcelable(RegisterActivity.REGISTER_SEND);
        mTvUsername.setText(account.getUsername());
        mTvPassword.setText(account.getPassword());
        mTvGender.setText(account.getGender());
        mTvEmail.setText(account.getEmail());
    }
}
