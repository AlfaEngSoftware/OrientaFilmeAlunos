package br.com.unialfa.orienta.filme.aluno;

import br.com.unialfa.orienta.filme.aluno.builder.StudentBuilder;
import br.com.unialfa.orienta.filme.aluno.builder.TeacherBuilder;
import br.com.unialfa.orienta.filme.aluno.controller.MattersController;
import br.com.unialfa.orienta.filme.aluno.controller.MoviesController;
import br.com.unialfa.orienta.filme.aluno.controller.StudentsController;
import br.com.unialfa.orienta.filme.aluno.controller.TeachersController;
import br.com.unialfa.orienta.filme.aluno.model.Matter;
import br.com.unialfa.orienta.filme.aluno.model.Movie;

public class Main {

    public static void main(String[] args) {
        System.out.println("------ Matters ------");
        MattersController.store(new Matter("Arquitetura de Computadores"));
        MattersController.store(new Matter("Algoritmos"));
        MattersController.store(new Matter("Orientação a Objetos"));
        MattersController.index().forEach(matter -> System.out.println(matter.getName()));

        System.out.println();
        System.out.println("------ Movies ------");
        MoviesController.store(new Movie("Perdido em Marte"));
        MoviesController.store(new Movie("A teoria de tudo"));
        MoviesController.store(new Movie("A rede social"));
        MoviesController.store(new Movie("Privacidade Hackeada"));
        MoviesController.index().forEach(movie -> System.out.println(movie.getName()));

        System.out.println();
        System.out.println("------ Students ------");
        StudentsController.store(
                new StudentBuilder("Robson")
                        .addMatter(MattersController.index())
                        .build());
        StudentsController.store(
                new StudentBuilder("Lemuel")
                        .addMatter(MattersController.index())
                        .build());
        StudentsController.store(
                new StudentBuilder("Olivar")
                        .addMatter(MattersController.index())
                        .build());
        StudentsController.index().forEach(student -> {
            System.out.println(student.getName());
            System.out.println(" Matters of " + student.getName());
            student.getMatters().forEach(matter ->
                    System.out.println("  - " + matter.getName())
            );
        });

        System.out.println();
        System.out.println("------ Teachers ------");
        TeachersController.store(
                new TeacherBuilder("Murilo")
                        .addMatter(MattersController.index())
                        .build());
        TeachersController.index().forEach(teacher -> {
            System.out.println(teacher.getName());
            System.out.println(" Matters of " + teacher.getName());
            teacher.getMatters().forEach(matter ->
                    System.out.println("  - " + matter.getName())
            );
        });
    }

}
