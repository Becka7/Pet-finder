package com.moringaschool.petfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PetActivity extends AppCompatActivity implements View.OnClickListener {
//    @BindView(R.id.NameTextView) Button mNameTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet);
//        ButterKnife.bind(this);


    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(PetActivity.this, AdoptionActivity.class);
        startActivity(intent);

    }
}