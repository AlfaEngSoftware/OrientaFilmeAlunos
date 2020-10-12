package br.com.unialfa.orienta.filme.aluno.controller;

import br.com.unialfa.orienta.filme.aluno.model.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeachersController {

    private static final List<Teacher> teachers = new ArrayList<>();

    public static List<Teacher> getTeachers() {
        return Collections.unmodifiableList(teachers);
    }

    public static void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public static void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

}
