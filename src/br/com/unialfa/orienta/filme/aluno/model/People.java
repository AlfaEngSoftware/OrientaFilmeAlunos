package br.com.unialfa.orienta.filme.aluno.model;

import java.util.ArrayList;

public abstract class People {

    private String name;

    public People(String name) {
        this.name = name;
    }

    public <E> People(String name, ArrayList<E> es) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
