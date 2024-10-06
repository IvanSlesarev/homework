package com.vanya.homework1.cinema;

public class CinemaRunner {

    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        Film film1 = new Film(1, 2022, 5, "Экшн", 8.5);
        Film film2 = new Film(2, 2022, 6, "Драмма", 7.5);
        Film film3 = new Film(3, 2021, 7, "Экшн", 9.0);
        Film film4 = new Film(4, 2022, 5, "Комедии", 8.0);
        Film film5 = new Film(5, 2020, 11, "Драмма", 6.5);

        cinema.addFilm(film1);
        cinema.addFilm(film2);
        cinema.addFilm(film3);
        cinema.addFilm(film4);

        cinema.addFilm(film1);

        System.out.println("Фильмы 2022 года: " + cinema.getFilmsByYear(2022));
        System.out.println("Фильмы мая 2022 года: " + cinema.getFilmsByMonthAndYear(2022, 5));
        System.out.println("Фильмы жанра Драмма: " + cinema.getFilmsByGenre("Drama"));

        cinema.addFilm(film5);
        System.out.println("ТОП-10 фильмов по рейтингу: " + cinema.getTop10FilmsByRating());
    }

}
