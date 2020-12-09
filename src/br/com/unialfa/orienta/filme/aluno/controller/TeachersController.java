package br.com.unialfa.orienta.filme.aluno.controller;

import br.com.unialfa.orienta.filme.aluno.model.Teacher;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
        try {
            FileOutputStream file = new FileOutputStream("data_teachers.dat", true);
            DataOutputStream data = new DataOutputStream(file);

            data.writeUTF(teacher.getName());

            data.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void update(Teacher teacher) {
    }

    public static void delete(Teacher teacher) {
        teachers.remove(teacher);
    }

}
