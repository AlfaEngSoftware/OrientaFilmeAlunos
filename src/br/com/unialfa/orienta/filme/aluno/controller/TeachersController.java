package br.com.unialfa.orienta.filme.aluno.controller;

import br.com.unialfa.orienta.filme.aluno.model.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeachersController {

    private static final List<Teacher> teachers = new ArrayList<>();

    public static List<Teacher> index() {
        return Collections.unmodifiableList(teachers);
    }

    public static void store(Teacher teacher) {
        teachers.add(teacher);
    }

    public static void update(Teacher teacher) {
    }

    public static void delete(Teacher teacher) {
        teachers.remove(teacher);
    }

}
