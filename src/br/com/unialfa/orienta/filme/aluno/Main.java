package br.com.unialfa.orienta.filme.aluno;

import br.com.unialfa.orienta.filme.aluno.builder.StudentBuilder;
import br.com.unialfa.orienta.filme.aluno.controller.MattersController;
import br.com.unialfa.orienta.filme.aluno.controller.StudentsController;
import br.com.unialfa.orienta.filme.aluno.model.Matter;

public class Main {

    public static void main(String[] args) {
        System.out.println("------ Matters");
        MattersController.addMatter(new Matter("Geografia"));
        MattersController.addMatter(new Matter("Algoritmos"));
        MattersController.addMatter(new Matter("Aula de como chupar o pau do Robson"));

        MattersController.getMatters().forEach(matter -> System.out.println(matter.getName()));

        System.out.println("------ Students");
        StudentsController.addStudent(
                new StudentBuilder("Lemuel")
                        .addMatter(MattersController.getMatters())
            .build());

        StudentsController.getStudents().forEach(student -> {
            System.out.println(student.getName());
            student.getMatters().forEach(matter ->
                    System.out.println(matter.getName())
            );
        });
    }

}
