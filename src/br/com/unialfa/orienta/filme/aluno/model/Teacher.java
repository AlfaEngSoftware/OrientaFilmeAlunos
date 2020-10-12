package br.com.unialfa.orienta.filme.aluno.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends People {

    private List<Matter> matters;

    public Teacher(String name, List<Matter> matters) {
        super(name);
        this.matters = matters;
    }

    public Teacher(String name) {
        this(name, new ArrayList<>());
    }

}
