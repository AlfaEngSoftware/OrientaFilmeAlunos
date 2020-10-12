package br.com.unialfa.orienta.filme.aluno.controller;

import br.com.unialfa.orienta.filme.aluno.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsController {

    private static final List<Student> students = new ArrayList<>();

    public static List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void removeStudent(Student student) {
        students.remove(student);
    }

}
