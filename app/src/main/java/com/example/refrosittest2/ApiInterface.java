package com.example.refrosittest2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/9887f953942122840ab5")
     Call<List<Movie>> getMovies();
}
