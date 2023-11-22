package org.example;

public class Serie extends Media {

    public String season;


    public Serie(String title, String category, String release, int rating, String season) {
        super(title, category, release, rating);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return super.toString() + ", season: " + season;
    }
}
