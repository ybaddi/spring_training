package org.example.model;

public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

}