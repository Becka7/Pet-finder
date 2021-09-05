package com.moringaschool.petfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PetformActivity extends AppCompatActivity implements View.OnClickListener {

//    public static final String TAG = PetformActivity.class.getSimpleName();
    @BindView(R.id.checkout) Button mCheckout;
//    @BindView(R.id.nameEditText) Button mNameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petform);
        ButterKnife.bind(this);

        mCheckout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        Toast.makeText(PetformActivity.this, "becka", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent( PetformActivity.this, PetActivity.class);
        startActivity(intent);


    }
}