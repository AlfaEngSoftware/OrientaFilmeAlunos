package br.com.unialfa.orienta.filme.aluno.tests;

import br.com.unialfa.orienta.filme.aluno.builder.StudentBuilder;
import br.com.unialfa.orienta.filme.aluno.controller.StudentsController;
import br.com.unialfa.orienta.filme.aluno.model.Matter;
import br.com.unialfa.orienta.filme.aluno.model.Student;

public class TestRegisterStudent {

    public static void register(String name, Matter... matters) {
        Student student = new StudentBuilder(name)
                .addMatter(matters)
                .build();

        StudentsController.store(student);
    }

}
