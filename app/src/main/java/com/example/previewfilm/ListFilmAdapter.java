package com.example.previewfilm;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFilmAdapter extends RecyclerView.Adapter<ListFilmAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Film> listFilm;

    public ArrayList<Film> getListFilm() {
        return listFilm;
    }

    public void setListFilm(ArrayList<Film> listFilm) {
        this.listFilm = listFilm;
    }

    public ListFilmAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_film,viewGroup,false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.judul.setText(getListFilm().get(position).getJudul());
        categoryViewHolder.genre.setText(getListFilm().get(position).getGenre());
        Glide.with(context)
                .load(getListFilm().get(position).getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(categoryViewHolder.imgPhoto);
//        categoryViewHolder.directed.setText(getListFilm().get(position).getDirectedBy());
    }

    @Override
    public int getItemCount() {
        return getListFilm().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView judul, genre, directed;
        ImageView imgPhoto;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.tv_item_judul);
            genre = itemView.findViewById(R.id.tv_item_genre);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
//            directed = itemView.findViewById(R.id.tv_item_directed);
        }
    }
}
