package br.com.unialfa.orienta.filme.aluno.controller;

import br.com.unialfa.orienta.filme.aluno.model.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoviesController {

    private static final List<Movie> movies = new ArrayList<>();

    public static List<Movie> getMovies() {
        return Collections.unmodifiableList(movies);
    }

    public static void addMovie(Movie movide) {
        movies.add(movide);
    }

    public static void removeMovie(Movie movide) {
        movies.remove(movide);
    }

}
