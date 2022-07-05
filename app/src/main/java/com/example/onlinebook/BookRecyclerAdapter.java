package com.example.onlinebook;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
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
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DescriptionActivity.class);

                //pass data to the description activity
                intent.putExtra("Title",contentsList.get(position).getTitle()); //string name ("Header") deko kina bhaney uta descriptionactivity maa yei string key name use garna parxa
                intent.putExtra("Author",contentsList.get(position).getAuthor());
                intent.putExtra("Description" , contentsList.get(position).getDescription());
                intent.putExtra("Image",contentsList.get(position).getImg());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contentsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageview;
        TextView author , title;
        CardView cardview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.author);
            imageview = itemView.findViewById(R.id.bookdetails);
            title = itemView.findViewById(R.id.title);
            cardview=itemView.findViewById(R.id.card_view);
        }
    }
}
