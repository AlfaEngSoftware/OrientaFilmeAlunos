package br.com.unialfa.orienta.filme.aluno.controller;

import br.com.unialfa.orienta.filme.aluno.model.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoviesController {

    private static final List<Movie> movies = new ArrayList<>();

    public static List<Movie> index() {
        return Collections.unmodifiableList(movies);
    }

    public static void store(Movie movie) {
        movies.add(movie);
    }

    public static void update(Movie movie) {
    }

    public static void delete(Movie movie) {
        movies.remove(movie);
    }

}
