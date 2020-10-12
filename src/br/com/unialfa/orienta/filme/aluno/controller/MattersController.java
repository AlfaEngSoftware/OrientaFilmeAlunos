package br.com.unialfa.orienta.filme.aluno.controller;

import br.com.unialfa.orienta.filme.aluno.model.Matter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MattersController {

    private static final List<Matter> movies = new ArrayList<>();

    public static List<Matter> index() {
        return Collections.unmodifiableList(movies);
    }

    public static void store(Matter matter) {
        movies.add(matter);
    }

    public static void update(Matter matter) {
    }

    public static void delete(Matter matter) {
        movies.remove(matter);
    }

}
