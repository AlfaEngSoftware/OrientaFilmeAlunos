package br.com.unialfa.orienta.filme.aluno.builder;

import br.com.unialfa.orienta.filme.aluno.model.Matter;
import br.com.unialfa.orienta.filme.aluno.model.Student;

import java.util.Arrays;
import java.util.List;

public class StudentBuilder {

    private final Student student;

    public StudentBuilder(String name) {
        this.student = new Student(name);
    }

    public StudentBuilder addMatter(Matter matter) {
        this.student.getMatters().add(matter);
        return this;
    }

    public StudentBuilder addMatter(Matter... matters) {
        this.student.getMatters().addAll(Arrays.asList(matters));
        return this;
    }

    public StudentBuilder addMatter(List<Matter> matters) {
        this.student.getMatters().addAll(matters);
        return this;
    }

    public Student build() {
        return this.student;
    }

}
