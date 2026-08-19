package com.mycode.vlestat;

// @author vlestat

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void menu() {

        System.out.print("""
                
                =====
                Menu
                =====
                
                1) Inserir cliente
                2) Remover cliente
                3) Encerrar programa
                
                Digite a opção :""" + " ");

    }

    public static void avgWeighted() {

        Scanner input = new Scanner(System.in);

        System.out.print("Media Ponderada :\n\n");

        System.out.print("Valor 1 : "); double val1 = input.nextDouble();
        System.out.print("Valor 2 : "); double val2 = input.nextDouble();
        System.out.print("Valor 3 : "); double val3 = input.nextDouble();
        System.out.print("Peso  1 : "); double wei1 = input.nextDouble();
        System.out.print("Peso  2 : "); double wei2 = input.nextDouble();
        System.out.print("Peso  3 : "); double wei3 = input.nextDouble();

        double mediaPonderada = ((val1*wei1) + (val2*wei2) + (val3*wei3)) / (wei1+wei2+wei3);

        System.out.println("\nResultssss : " + mediaPonderada);

    }

    public static int ageCalculation(int yearCurrect, int yearBorn) {

        return(yearCurrect-yearBorn);

    }


    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println();

        // Questão 1

        avgWeighted();

        // Questão 2

        int option;

        do { menu(); option = input.nextInt(); } while (option != 3);

        // Questão 3

        int x = ageCalculation(2026, 2010);
        double y = Math.pow(12,2);

        System.out.println(x);
        System.out.println(y);



        // Questão 4








    }

}
