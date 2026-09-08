package com.mycode.vlestat.objects;

public class Retangulo {

    public String cor;
    public float base;
    public float altura;

    public float area() {

        return base*altura;

    }

    public String toString() {

        return "\nCor : " + cor + "\nArea : " + area();

    }
}
