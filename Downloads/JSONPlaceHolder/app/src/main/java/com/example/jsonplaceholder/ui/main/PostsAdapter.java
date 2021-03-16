package com.example.jsonplaceholder.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jsonplaceholder.R;
import com.example.jsonplaceholder.pojo.Post;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {

    List<Post> Posts = new ArrayList<>();


    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.titleTV.setText(Posts.get(position).getTitle());
        holder.bodyTV.setText(Posts.get(position).getBody());
        holder.userTV.setText(Posts.get(position).getUserId()+"");
    }

    @Override
    public int getItemCount() {
        return Posts.size();
    }

    public  void setList(List<Post> posts){
        this.Posts = posts;
        notifyDataSetChanged();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        TextView titleTV,userTV,bodyTV;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTV = itemView.findViewById(R.id.title_tv);

            userTV = itemView.findViewById(R.id.id_tv);
            bodyTV = itemView.findViewById(R.id.body_tv);

        }
    }
}
