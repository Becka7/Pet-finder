package com.moringaschool.petfinder;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PetAPI {
    String BASE_URL = "https://api.thedogapi.com/v1/";

    @GET("breeds/1")
    Call<List<PetSearchResponse>> getPets();

}
