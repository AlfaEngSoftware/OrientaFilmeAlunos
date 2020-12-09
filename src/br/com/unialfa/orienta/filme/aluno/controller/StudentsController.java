package br.com.unialfa.orienta.filme.aluno.controller;

import br.com.unialfa.orienta.filme.aluno.model.Student;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
        try {
            FileOutputStream file = new FileOutputStream("data_students.dat", true);
            DataOutputStream data = new DataOutputStream(file);

            data.writeUTF(student.getName());

            data.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void update(Student student) {
    }

    public static void delete(Student student) {
        students.remove(student);
    }

}
