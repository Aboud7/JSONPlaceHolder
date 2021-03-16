package com.example.jsonplaceholder.data;

import com.example.jsonplaceholder.pojo.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {

    @GET("posts")
    public Call<List<Post>> getPost();

}
