package com.example.previewfilm;

import android.os.Parcelable;

public class Film {
    public String judul, genre,photo,directedBy, producedBy, musicBy, cinematography,editedBy,productionCompany,distributedBy,
    RelaseDate,RunningTime,Country,synopsis;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDirectedBy() {
        return directedBy;
    }

    public void setDirectedBy(String directedBy) {
        this.directedBy = directedBy;
    }

    public String getProducedBy() {
        return producedBy;
    }

    public void setProducedBy(String producedBy) {
        this.producedBy = producedBy;
    }

    public String getMusicBy() {
        return musicBy;
    }

    public void setMusicBy(String musicBy) {
        this.musicBy = musicBy;
    }

    public String getCinematography() {
        return cinematography;
    }

    public void setCinematography(String cinematography) {
        this.cinematography = cinematography;
    }

    public String getEditedBy() {
        return editedBy;
    }

    public void setEditedBy(String editedBy) {
        this.editedBy = editedBy;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public String getDistributedBy() {
        return distributedBy;
    }

    public void setDistributedBy(String distributedBy) {
        this.distributedBy = distributedBy;
    }

    public String getRelaseDate() {
        return RelaseDate;
    }

    public void setRelaseDate(String relaseDate) {
        RelaseDate = relaseDate;
    }

    public String getRunningTime() {
        return RunningTime;
    }

    public void setRunningTime(String runningTime) {
        RunningTime = runningTime;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
