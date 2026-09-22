package com.mycode.vlestat.objects;

import java.util.Scanner;

public class Calculadora {

    public void menu() {

        Scanner input = new Scanner(System.in);

        System.out.print("""
                    
                    
                    ===== Calculadora ====
                    
                    (1) > Somar
                    (2) > Subtrair
                    (3) > Multiplicar
                    (4) > Dividir
                    (5) > Sair
                    """);

        int options;

        do {

            System.out.print("\nDigite aqui : ");
            options = input.nextInt();

            System.out.println();

            double A; double B;

            switch (options) {

                case 1 :

                    System.out.print("Digite o valor A : "); A = input.nextDouble();
                    System.out.print("Digite o valor B : "); B = input.nextDouble();

                    System.out.printf("\n%.2f + %.2f = %.2f\n", A, B, somar(A,B) ); break;

                case 2 :

                    System.out.print("Digite o valor A : "); A = input.nextDouble();
                    System.out.print("Digite o valor B : "); B = input.nextDouble();

                    System.out.printf("\n%.2f - %.2f = %.2f\n", A, B, subtrair(A,B) ); break;

                case 3 :

                    System.out.print("Digite o valor A : "); A = input.nextDouble();
                    System.out.print("Digite o valor B : "); B = input.nextDouble();

                    System.out.printf("\n%.2f * %.2f = %.2f\n", A, B, multiplicar(A,B) ); break;

                case 4 :

                    System.out.print("Digite o valor A : "); A = input.nextDouble();
                    System.out.print("Digite o valor B : "); B = input.nextDouble();

                    System.out.printf("\n%.2f : %.2f = %.2f\n", A, B, dividir(A,B) ); break;

            }

        } while (options != 5);

    }

    public double somar(double a, double b)       { return a + b; }
    public double subtrair(double a, double b)    { return a - b; }
    public double multiplicar(double a, double b) { return a * b; }
    public double dividir(double a, double b)     { return a / b; }

}