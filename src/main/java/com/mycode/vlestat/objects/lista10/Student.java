package com.mycode.vlestat.objects.lista10;

public class Student {

    public int matricula;
    public String nome;
    public float nota1;
    public float nota2;
    public float nota3;

    public double notaMedia() {

        return ((nota1 * 2.5)+ (nota2 * 2.5)+ (nota3 * 2)) / ((2.5 * 2) + 2);

    }

    public double notaFinal() {

        int notaMIN   = 60;
        int notaFinal = 30;

        double notaMedia = notaMedia();

        if ((notaMedia >= notaMIN) || (notaMedia < notaFinal)) { return 0; } else { return 60 - notaFinal; }

    }

}
