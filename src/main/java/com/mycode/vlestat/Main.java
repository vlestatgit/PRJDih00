package com.mycode.vlestat;

// @author vlestat

import com.mycode.vlestat.objects.Retangulo;

public class Main {
    public static void main(String[] args) {

        Retangulo re1 = new Retangulo();

        re1.cor = "azul";
        re1.altura = 10;
        re1.base = 10;

        System.out.print(re1.toString());

    }
}
