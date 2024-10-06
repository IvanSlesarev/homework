package com.vanya.homework1.cinema;

public class Film {

    private int id;
    private int releaseYear;
    private int releaseMonth;
    private String genre;
    private double rating;

    public Film(int id, int releaseYear, int releaseMonth, String genre, double rating) {
        this.id = id;
        this.releaseYear = releaseYear;
        this.releaseMonth = releaseMonth;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", releaseYear=" + releaseYear +
                ", releaseMonth=" + releaseMonth +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
