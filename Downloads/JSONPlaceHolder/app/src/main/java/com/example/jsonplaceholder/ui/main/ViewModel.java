package com.example.jsonplaceholder.ui.main;


import com.example.jsonplaceholder.data.PostsClient;
import com.example.jsonplaceholder.pojo.Post;

import java.util.List;

import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ViewModel extends androidx.lifecycle.ViewModel {
    MutableLiveData<List<Post>> postsMutableLiveData = new MutableLiveData<>();

    public void getPosts(){
        PostsClient.getINSTANCE().getPost().enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                postsMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {

            }
        });
    }
}
