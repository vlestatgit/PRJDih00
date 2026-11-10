package com.mycode.vlestat.objects.simulado02.modelo;

public class Contact {

    private String name;
    private String number;

    public void displayData() {

        System.out.printf("Name : %s Number : %s", this.name, this.number);

    }

    public Contact(String name, String number) {

        this.name   = name;
        this.number = number;

    }

    public String getName()   { return this.name;   }
    public String getNumber() { return this.number; }

}
