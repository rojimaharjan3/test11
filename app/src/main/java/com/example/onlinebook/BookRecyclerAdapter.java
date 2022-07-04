package com.example.onlinebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookRecyclerAdapter extends RecyclerView.Adapter<BookRecyclerAdapter.ViewHolder> {

    Context context;
    ArrayList<Model> contentsList = new ArrayList<>();
    BookRecyclerAdapter(Context context ,ArrayList<Model> contents) {
        this.context = context;
        contentsList = contents;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_recycler , parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(contentsList.get(position).getTitle());
        holder.author.setText(contentsList.get(position).getAuthor());
        holder.imageview.setImageResource(contentsList.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return contentsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageview;
        TextView author , title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.author);
            imageview = itemView.findViewById(R.id.bookdetails);
            title = itemView.findViewById(R.id.title);
        }
    }
}
