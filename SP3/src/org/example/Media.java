package org.example;

public abstract class Media {

    String title;

    String category;

    String release;

    int rating;

    public Media(String title, String category, String release, int rating){
        this.title = title;
        this.category = category;
        this.release = release;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getRelease() {
        return release;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Media: " +
                "title: " + title +
                ", category: " + category +
                ", release: " + release +
                ", rating: " + rating;
    }
}
