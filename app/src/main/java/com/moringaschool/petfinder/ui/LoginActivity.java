package com.moringaschool.petfinder.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.moringaschool.petfinder.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.registerTextView)
    TextView mRegisterTextView;
    @BindView(R.id.passwordLoginButton)
    Button mPasswordLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
        mRegisterTextView.setOnClickListener(this);
        mPasswordLoginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == mRegisterTextView){
            Intent intent = new Intent(LoginActivity.this ,CreateAccount.class);
            startActivity(intent);
            finish();
        }
        if(view == mPasswordLoginButton){
            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }

    }
}