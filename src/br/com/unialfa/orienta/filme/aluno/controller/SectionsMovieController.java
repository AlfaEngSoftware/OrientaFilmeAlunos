package br.com.unialfa.orienta.filme.aluno.controller;

import br.com.unialfa.orienta.filme.aluno.model.Matter;
import br.com.unialfa.orienta.filme.aluno.model.Movie;

import java.util.HashMap;
import java.util.Map;

public class SectionsMovieController {

    private static final Map<Movie, Matter> sections = new HashMap<>();

    public Matter getMatterFromMovie(Movie movie) {
        return sections.get(movie);
    }

    public static Map<Movie, Matter> getSections() {
        return sections;
    }
}
