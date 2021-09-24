package com.moringaschool.petfinder.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

import com.moringaschool.petfinder.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    @BindView(R.id.petsbutton) Button mPetsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mSharedPreferences.edit();

        mPetsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        Toast.makeText(MainActivity.this, "Becka", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, DogActivity.class);
        startActivity(intent);

    }


}

