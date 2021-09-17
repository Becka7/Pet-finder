package com.moringaschool.petfinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DogActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;


    private Adapter adapter;
    private List<PetSearchResponse> images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);
        ButterKnife.bind(this);

        mRecyclerView.setOnClickListener(this);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<PetSearchResponse>> call = api.getPets();

        call.enqueue(new Callback<List<PetSearchResponse>>() {
            @Override
            public void onResponse(Call<List<PetSearchResponse>> call, Response<List<PetSearchResponse>> response) {
                List<PetSearchResponse> petSearchResponses = response.body();
                images = response.body();
                RecyclerView recyclerView = findViewById(R.id.recyclerView);
                Adapter adapter = new Adapter(DogActivity.this, images);
                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
                mRecyclerView.setLayoutManager(staggeredGridLayoutManager);
                mRecyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<List<PetSearchResponse>> call, Throwable t) {
                Toast.makeText(DogActivity.this, "Error Occurred", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(DogActivity.this,    PetActivity.class);
        startActivity(intent);
    }
}