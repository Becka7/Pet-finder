package com.moringaschool.petfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.petsbutton) Button mPetsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mPetsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        Toast.makeText(MainActivity.this, "Becka", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, DogActivity.class);
        startActivity(intent);

    }
}

