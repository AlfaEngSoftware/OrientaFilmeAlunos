package br.com.unialfa.orienta.filme.aluno.builder;

import br.com.unialfa.orienta.filme.aluno.model.Matter;
import br.com.unialfa.orienta.filme.aluno.model.Teacher;

import java.util.Arrays;
import java.util.List;

public class TeacherBuilder {

    private final Teacher teacher;

    public TeacherBuilder(String name) {
        this.teacher = new Teacher(name);
    }

    public TeacherBuilder addMatter(Matter matter) {
        this.teacher.getMatters().add(matter);
        return this;
    }

    public TeacherBuilder addMatter(Matter... matters) {
        this.teacher.getMatters().addAll(Arrays.asList(matters));
        return this;
    }

    public TeacherBuilder addMatter(List<Matter> matters) {
        this.teacher.getMatters().addAll(matters);
        return this;
    }

    public Teacher build() {
        return this.teacher;
    }

}
