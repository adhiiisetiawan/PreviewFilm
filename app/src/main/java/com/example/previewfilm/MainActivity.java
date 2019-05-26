package com.example.previewfilm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Film> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(FilmData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListFilmAdapter listFilmAdapter = new ListFilmAdapter(this);
        listFilmAdapter.setListFilm(list);
        rvCategory.setAdapter(listFilmAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void OnItemClicked(RecyclerView mRecyclerView, int adapterPosition) {
                showSelectedFilm(list.get(adapterPosition));
            }

        });
    }

    private void showSelectedFilm(Film film){
        Intent moveWithDataIntent = new Intent(MainActivity.this, MoveActivity.class);
        moveWithDataIntent.putExtra(MoveActivity.EXTRA_PHOTO, film.getPhoto());
        moveWithDataIntent.putExtra(MoveActivity.EXTRA_TITLE, film.getJudul());
        moveWithDataIntent.putExtra(MoveActivity.EXTRA_GENRE, film.getGenre());
        moveWithDataIntent.putExtra(MoveActivity.DIRECTED_BY, film.getDirectedBy());
        moveWithDataIntent.putExtra(MoveActivity.PRODUCED_BY, film.getProducedBy());
        moveWithDataIntent.putExtra(MoveActivity.MUSIC_BY, film.getMusicBy());
        moveWithDataIntent.putExtra(MoveActivity.CINEMATOGRAPHY, film.getCinematography());
        moveWithDataIntent.putExtra(MoveActivity.EDITED_BY,film.getEditedBy());
        moveWithDataIntent.putExtra(MoveActivity.PRODUCTION_COMPANY,film.getProductionCompany());
        moveWithDataIntent.putExtra(MoveActivity.DISTRIBUTED_BY,film.getDistributedBy());
        moveWithDataIntent.putExtra(MoveActivity.RELEASE_DATE,film.getRelaseDate());
        moveWithDataIntent.putExtra(MoveActivity.RUNNING_TIME,film.getRunningTime());
        moveWithDataIntent.putExtra(MoveActivity.COUNTRY,film.getCountry());
        moveWithDataIntent.putExtra(MoveActivity.SYNOPSIS,film.getSynopsis());
        startActivity(moveWithDataIntent);

    }
}
