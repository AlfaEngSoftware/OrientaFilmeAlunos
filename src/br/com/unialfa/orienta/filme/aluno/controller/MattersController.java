package br.com.unialfa.orienta.filme.aluno.controller;

import br.com.unialfa.orienta.filme.aluno.model.Matter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MattersController {

    private static final List<Matter> movies = new ArrayList<>();

    public static List<Matter> getMatters() {
        return Collections.unmodifiableList(movies);
    }

    public static void addMatter(Matter matter) {
        movies.add(matter);
    }

    public static void removeMatter(Matter matter) {
        movies.remove(matter);
    }

}
