package br.com.unialfa.orienta.filme.aluno.controller;

import br.com.unialfa.orienta.filme.aluno.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsController {

    private static final List<Student> students = new ArrayList<>();

    public static List<Student> index() {
        return Collections.unmodifiableList(students);
    }

    public static void store(Student student) {
        students.add(student);
    }

    public static void update(Student student) {
    }

    public static void delete(Student student) {
        students.remove(student);
    }

}
