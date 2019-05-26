package com.example.previewfilm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MoveActivity extends AppCompatActivity {
    public static final String EXTRA_TITLE = "extra_title";
    public static final String EXTRA_GENRE = "extra_genre";
    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String DIRECTED_BY = "directed_by";
    public static final String PRODUCED_BY = "produced_by";
    public static final String MUSIC_BY = "music_by";
    public static final String CINEMATOGRAPHY = "cinema";
    public static final String EDITED_BY = "edited_by";
    public static final String PRODUCTION_COMPANY = "production_company";
    public static final String DISTRIBUTED_BY = "distributed_by";
    public static final String RELEASE_DATE = "release_date";
    public static final String RUNNING_TIME = "running_time";
    public static final String COUNTRY = "country";
    public static final String SYNOPSIS = "sinopsis";


    ImageView photoReceived;
    TextView judulReceived,genreReceived, directedByReceived,producedByReceived,musicByReceived,cinemaReceived,editedByReceived,
    productionCompanyReceived,distributedByReceived,releaseDateReceived,runningTimeReceived,countryReceived,synopsisReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        photoReceived = findViewById(R.id.data_photo_received);
        judulReceived = findViewById(R.id.data_judul_received);
        genreReceived = findViewById(R.id.data_genre_received);
        directedByReceived = findViewById(R.id.data_directedBy_received);
        producedByReceived = findViewById(R.id.data_producedBy_received);
        musicByReceived = findViewById(R.id.data_musicBy_received);
        cinemaReceived = findViewById(R.id.data_cinematography_received);
        editedByReceived = findViewById(R.id.data_editedBy_received);
        productionCompanyReceived = findViewById(R.id.data_proc_company_received);
        distributedByReceived = findViewById(R.id.data_distributedBy_received);
        releaseDateReceived = findViewById(R.id.data_release_received);
        runningTimeReceived = findViewById(R.id.data_running_time_received);
        countryReceived = findViewById(R.id.data_country_received);
        synopsisReceived = findViewById(R.id.data_synopsis_received);

        String judul = getIntent().getStringExtra(EXTRA_TITLE);
        String genre = getIntent().getStringExtra(EXTRA_GENRE);
        String foto = getIntent().getStringExtra(EXTRA_PHOTO);
        String directed = getIntent().getStringExtra(DIRECTED_BY);
        String produced = getIntent().getStringExtra(PRODUCED_BY);
        String music = getIntent().getStringExtra(MUSIC_BY);
        String cinema = getIntent().getStringExtra(CINEMATOGRAPHY);
        String edited = getIntent().getStringExtra(EDITED_BY);
        String production = getIntent().getStringExtra(PRODUCTION_COMPANY);
        String distributed = getIntent().getStringExtra(DISTRIBUTED_BY);
        String release = getIntent().getStringExtra(RELEASE_DATE);
        String running_time = getIntent().getStringExtra(RUNNING_TIME);
        String country = getIntent().getStringExtra(COUNTRY);
        String synopsis = getIntent().getStringExtra(SYNOPSIS);

        String textJudul =  judul;
        String textGenre = genre;
        String textDirected = directed;
        String textProduced = produced;
        String textMusic = music;
        String textCinema = cinema;
        String textEdited = edited;
        String textProduction = production;
        String textDistributed = distributed;
        String textRelease = release;
        String textRunningTime = running_time;
        String textCountry = country;
        String textSynopsis = synopsis;

        Glide.with(this).load(foto).into(photoReceived);
        judulReceived.setText(textJudul);
        genreReceived.setText(textGenre);
        directedByReceived.setText(textDirected);
        producedByReceived.setText(textProduced);
        musicByReceived.setText(textMusic);
        cinemaReceived.setText(textCinema);
        editedByReceived.setText(textEdited);
        productionCompanyReceived.setText(textProduction);
        distributedByReceived.setText(textDistributed);
        releaseDateReceived.setText(textRelease);
        runningTimeReceived.setText(textRunningTime);
        countryReceived.setText(textCountry);
        synopsisReceived.setText(textSynopsis);
    }
}
