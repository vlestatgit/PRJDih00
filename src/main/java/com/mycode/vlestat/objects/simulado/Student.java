package com.mycode.vlestat.objects.simulado;

public class Student {

    private String registry;
    private String name;
    private float grade;

    public void constructor(String R, String N, float G) {

        registry = R;
        name = N;
        grade = G;

    }

    public String getRegistry() { return registry; }
    public String getName()     { return name; }
    public float getGrade()     { return grade; }

    public void setRegistry(String R) { registry = R; }
    public void setName(String N)     { name = N; }
    public void setGrade(float G)     { grade = G; }

    public boolean aproved() { return grade >= 60; }

    public String string() {

        return  " Matrícula : " +registry+
                " Nome : "      +name+
                " Nota : "      +grade;

    }


}
