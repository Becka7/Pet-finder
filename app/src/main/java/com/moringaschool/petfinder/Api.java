package com.moringaschool.petfinder;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://api-dog-breeds.herokuapp.com/api/";

    @GET("dogs/working")
    Call<List<PetSearchResponse>> getPets();
}
