package com.mycode.vlestat.main;

// @author vlestat

import com.mycode.vlestat.objects.Aluno;
import com.mycode.vlestat.objects.Calculadora;
import com.mycode.vlestat.objects.Matematica;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        Matematica Math = new Matematica();

        System.out.println();

        // Questão 1

        System.out.print("Digite um número : ");
        float num = input.nextFloat();

        System.out.printf("\nPositivo : %b\nZero : %b\n\n", Math.isPositive(num), Math.isZero(num));

        // Questão 2

        Aluno aluno = new Aluno();

        System.out.print("Digite a Matrícula do aluno : ");
        aluno.matricula = input.nextInt();

        System.out.print("Digite o Nome do aluno : ");
        aluno.nome = input.next();

        System.out.print("\nDigite as notas do aluno :\n\n");

        System.out.print("Nota 1 : "); aluno.nota1 = input.nextFloat();
        System.out.print("Nota 2 : "); aluno.nota2 = input.nextFloat();
        System.out.print("Nota 3 : "); aluno.nota3 = input.nextFloat();

        System.out.printf("\nNota Media : %.2f\nNota Final : %.2f", aluno.notaMedia(), aluno.notaFinal());

        // Questão 3

        Calculadora calculadora = new Calculadora();

        calculadora.menu();



    }
}
