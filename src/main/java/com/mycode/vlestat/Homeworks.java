package com.mycode.vlestat;

// @author vlestat

import java.util.Scanner;
import java.util.Random;

public class Homeworks {

    public static void homework01() throws InterruptedException {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor inteiro : ");
        int num = input.nextInt();

        System.out.println();

        for (int i = 1; i <= num; i += 1) {
            Thread.sleep(250);
            System.out.println("IFMG");
        }

        System.out.print("\nDigite os segundos para uma contagem regressiva : ");
        num = input.nextInt();

        System.out.println("");

        for (int i = num; i >= 1; i -= 1) {
            Thread.sleep(1000);
            System.out.print(i + " ");
        }

    }

    public static void homework02() {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Questão 1

        System.out.print("Digite sua senha : ");

        for (String i = input.next(); !i.equals("1234bb"); i = input.next()) {
            System.out.println("Senha incorreta\n");
            System.out.print("Tente novamente : ");
        }

        System.out.println("\nSeja bem vindo !");

        // Questão 2

        System.out.print("\nDigite sua senha : ");

        int fails = 1;

        for (String i = input.next(); !i.equals("1234bb"); i = input.next()) {
            System.out.println("Senha incorreta\n");
            System.out.print("Tente novamente : ");
            fails += 1;
        }

        System.out.println("\nSeja bem vindo ! ");
        System.out.println("Tentativa : " + fails);

    }

    public static void homework03() {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Questão 1

        System.out.print("Digite uma palavra : ");
        String word = input.next();

        int total = word.length();
        char wordLast = '\0';

        for (int i = 0; i < total; i += 1) {
            wordLast = word.charAt(i);
        }

        if (wordLast == 's') {
            System.out.println("\nEssa palavra está no plural");
        } else {
            System.out.println("\nEssa palavra está no singular");
        }

        // Questão 2

        System.out.println("\n===== Jogo de Adivinhação =====");

        int randNum = random.nextInt(1, 11);

        System.out.println("\nSorteamos um número entre 1 e 10\nTente acertar !");

        System.out.print("\nDigite seu palpite : ");
        int pal = input.nextInt();

        if (pal == randNum) {
            System.out.println("\nParabéns, você acertou !");
        } else {
            System.out.println("\nQue pena, você errou !");
        }

        System.out.println("O número era : " + randNum);

    }

    public static void homework04() {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Questão 1

        System.out.print("Digite um número : ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i += 1) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }

        // Questão 2

        System.out.print("\nDigite um número : ");
        num = input.nextInt();

        String bin = "\n";

        for (; num != 0; num /= 2) {
            int rest = num % 2;
            bin += rest;
        }

        System.out.println(new StringBuilder(bin).reverse().toString());

    }

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println();

    }

}
