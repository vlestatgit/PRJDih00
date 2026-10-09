package com.mycode.vlestat.objects.simulado;

public class Student {

    private String id;
    private String name;
    private float  grade;

    public Student(String registry, String name, float grade) {

        this.id    = registry;
        this.name  = name;
        this.grade = grade;

    }

    public String getId()    { return id; }
    public String getName()  { return name; }
    public float  getGrade() { return grade; }

    public void setId(String id)      { this.id = id; }
    public void setName(String name)  { this.name = name; }
    public void setGrade(float grade) { this.grade = grade; }

    public boolean aproved() { return grade >= 60; }

    public String toString() {

        return  "\nMatrícula : " +id+
                "\nNome      : " +name+
                "\nNota      : " +grade;

    }
}
