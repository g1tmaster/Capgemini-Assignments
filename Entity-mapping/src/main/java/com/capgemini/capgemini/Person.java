package com.capgemini.capgemini;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private String name;
    private LocalDate dib;
    @OneToOne
    private Dl dl;

    public Person(String name, LocalDate dib) {
        this.name = name;
        this.dib = dib;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDib() {
        return dib;
    }

    public void setDib(LocalDate dib) {
        this.dib = dib;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dl getDl() {
        return dl;
    }

    public void setDl(Dl dl) {
        this.dl = dl;
    }

    public Person( int id, LocalDate dib, String name, Dl dl) {
        this.dib = dib;
        this.dl = dl;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dib=" + dib +
                ", dl=" + dl +
                '}';
    }
}
