package com.vanya.homework1.cinema;

import java.util.*;

public class Cinema {

    private Map<Integer, List<Film>> filmsByYear = new TreeMap<>();

    public void addFilm(Film film) {
        filmsByYear.putIfAbsent(film.getReleaseYear(), new ArrayList<>());
        List<Film> films = filmsByYear.get(film.getReleaseYear());

        for (Film f : films) {
            if (f.getId() == film.getId()) {
                System.out.println("Фильм с ID " + film.getId() + " уже существует.");
                return;
            }
        }

        films.add(film);
    }

    public List<Film> getFilmsByYear(int year) {
        return filmsByYear.getOrDefault(year, Collections.emptyList());
    }

    public List<Film> getFilmsByMonthAndYear(int year, int month) {
        List<Film> result = new ArrayList<>();
        List<Film> films = filmsByYear.get(year);
        if (films != null) {
            for (Film film : films) {
                if (film.getReleaseMonth() == month) {
                    result.add(film);
                }
            }
        }
        return result;
    }

    public List<Film> getFilmsByGenre(String genre) {
        List<Film> result = new ArrayList<>();
        for (List<Film> films : filmsByYear.values()) {
            for (Film film : films) {
                if (film.getGenre().equalsIgnoreCase(genre)) {
                    result.add(film);
                }
            }
        }
        return result;
    }

    public List<Film> getTop10FilmsByRating() {
        List<Film> allFilms = new ArrayList<>();
        for (List<Film> films : filmsByYear.values()) {
            allFilms.addAll(films);
        }

        allFilms.sort(Comparator.comparingDouble(Film::getRating).reversed());

        return allFilms.size() > 10 ? allFilms.subList(0, 10) : allFilms;
    }
}
