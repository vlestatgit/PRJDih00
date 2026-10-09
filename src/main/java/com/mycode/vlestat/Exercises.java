package com.mycode.vlestat;

// @author vlestat

import com.mycode.vlestat.objects.lista10.Student;
import com.mycode.vlestat.objects.lista10.Calculator;
import com.mycode.vlestat.objects.lista10.Mathematics;
import com.mycode.vlestat.objects.simulado.Registry;

import java.util.Random;
import java.util.Scanner;

public class Exercises {

    public static void lista10() {

        // Questão 01

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        Mathematics Math = new Mathematics();

        System.out.println();

        // Questão 1

        System.out.print("Digite um número : ");
        float num = input.nextFloat();

        System.out.printf("\nPositivo : %b\nZero : %b\n\n", Math.isPositive(num), Math.isZero(num));

        // Questão 2

        Student student = new Student();

        System.out.print("Digite a Matrícula do aluno : ");
        student.matricula = input.nextInt();

        System.out.print("Digite o Nome do aluno : ");
        student.nome = input.next();

        System.out.print("\nDigite as notas do aluno :\n\n");

        System.out.print("Nota 1 : "); student.nota1 = input.nextFloat();
        System.out.print("Nota 2 : "); student.nota2 = input.nextFloat();
        System.out.print("Nota 3 : "); student.nota3 = input.nextFloat();

        System.out.printf("\nNota Media : %.2f\nNota Final : %.2f", student.notaMedia(), student.notaFinal());

        // Questão 3

        Calculator calculator = new Calculator();

        calculator.menu();

    }

    public static void Simulado() {

        Registry registry = new Registry();
        registry.menu();

    }
}
