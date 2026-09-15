package com.mycode.vlestat.main;

// @author vlestat

import com.mycode.vlestat.objects.Matematica;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        Matematica Math = new Matematica();

        System.out.println();

        System.out.print("Digite um número : ");
        float num = input.nextFloat();

        System.out.printf("\nPositivo : %b\nZero : %b\n", Math.isPositive(num), Math.isZero(num));

    }
}
