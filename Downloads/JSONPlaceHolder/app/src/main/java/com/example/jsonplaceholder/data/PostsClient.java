package com.example.jsonplaceholder.data;

import com.example.jsonplaceholder.pojo.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostsClient {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

    private API api ;

    private static com.example.jsonplaceholder.data.PostsClient INSTANCE;

    public PostsClient() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(API.class);

    }

    public static com.example.jsonplaceholder.data.PostsClient getINSTANCE() {
        if (INSTANCE == null){
            INSTANCE = new com.example.jsonplaceholder.data.PostsClient();
        }
        return INSTANCE;
    }

    public Call<List<Post>> getPost(){
        return api.getPost();
    }
}
