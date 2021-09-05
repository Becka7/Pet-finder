package com.moringaschool.petfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Dogtypes extends AppCompatActivity implements AdapterView.OnItemClickListener {
    @BindView(R.id.listView) ListView mListView;
    @BindView(R.id.nameTextView) TextView mNameTextView;
    private String[] dogs = new String[]{"Bulldog", "German shepherd", "poodle", "Labrador", "Golden retriver", "Chihuahua", "Rottweiler", "Siberian Husky", "Cavalier king", "Italian greyhound", "Papillon", "Bulldog", "German shepherd", "poodle", "Labrador", "Golden retriver", "Chihuahua", "Rottweiler", "Siberian Husky", "Cavalier king", "Italian greyhound", "Papillon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogtypes);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        mNameTextView.setText("Hey"+ name +"Here are some dogs for you");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dogs);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(this) ;

        }

        @Override
        public void onItemClick (AdapterView < ? > adapterView, View view,int i, long l){
            Intent intent = new Intent( Dogtypes.this, PetActivity.class);
            startActivity(intent);

        }
    }
