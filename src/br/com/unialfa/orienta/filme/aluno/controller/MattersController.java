package br.com.unialfa.orienta.filme.aluno.controller;

import br.com.unialfa.orienta.filme.aluno.model.Matter;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
        try {
            FileOutputStream file = new FileOutputStream("data_matters.dat", true);
            DataOutputStream data = new DataOutputStream(file);

            data.writeUTF(matter.getName());

            data.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void update(Matter matter) {

    }

    public static void delete(Matter matter) {
        movies.remove(matter);
    }

}
