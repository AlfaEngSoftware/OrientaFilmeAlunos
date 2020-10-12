package br.com.unialfa.orienta.filme.aluno.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends People {

    private final List<Matter> matters;

    public Student(String name, List<Matter> matters) {
        super(name);
        this.matters = matters;
    }

    public Student(String name) {
        this(name, new ArrayList<>());
    }

    public List<Matter> getMatters() {
        return matters;
    }
}
