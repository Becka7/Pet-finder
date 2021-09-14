package com.moringaschool.petfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Dogtypes extends AppCompatActivity  {
//    @BindView(R.id.listView) ListView mListView;
    @BindView(R.id.nameTextView) TextView mNameTextView;
//    private String[] dogs = new String[]{"Bulldog", "German shepherd", "poodle", "Labrador", "Golden retriver", "Chihuahua", "Rottweiler", "Siberian Husky", "Cavalier king", "Italian greyhound", "Papillon", "Bulldog", "German shepherd", "poodle", "Labrador", "Golden retriver", "Chihuahua", "Rottweiler", "Siberian Husky", "Cavalier king", "Italian greyhound", "Papillon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogtypes);
//        ButterKnife.bind(this);
        ListView listView = (ListView) findViewById(R.id.listView);


//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dogs);
//        mListView.setAdapter(adapter);

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

                String[] petNames = new String[petSearchResponses.size()];

                for(int i=0;i<petSearchResponses.size();i++){
                    petNames[i] = petSearchResponses.get(i).getBreedName();
                }

                listView.setAdapter(
                        new ArrayAdapter<String>(
                                getApplicationContext(),
                                android.R.layout.simple_list_item_1,
                                petNames
                        )
                );
            }

            @Override
            public void onFailure(Call<List<PetSearchResponse>> call, Throwable t) {
                Toast.makeText(Dogtypes.this, "An Error Occurred", Toast.LENGTH_SHORT).show();

            }
        });




//        Intent intent = getIntent();
//        String name = intent.getStringExtra("name");
//        mNameTextView.setText("Hey"+ name +"Here are some dogs for you");

//        listView.setOnItemClickListener(this) ;

        }

//        @Override
//        public void onItemClick (AdapterView < ? > adapterView, View view,int i, long l){
//            Intent intent = new Intent( Dogtypes.this, PetActivity.class);
//            startActivity(intent);
//
//        }
    }
