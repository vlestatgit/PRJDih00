package com.mycode.vlestat.objects.simulado02.controle;

import com.mycode.vlestat.objects.simulado02.modelo.Contact;

public class Agenda {

    private Contact[] contacts;

    private int quantityAgenda;
    private static int quantityTotal;

    public boolean insertContact(Contact contact) {

        if (quantityAgenda == 10) { return false; }

        for (int i = 0; i < 10; i++) {

            if (contacts[i] == null) {

                contacts[i] = contact;
                quantityAgenda++;
                quantityTotal++;
                return true;

            }
        }

        return false;

    }

    public Contact[] getContacts(String name) {

        for (int i = 0; i < contacts.length; i++) {

            if ((contacts[i] != null) && (contacts[i].getName().equals(name))) {

                return contacts;

            }
        }

        return null;

    }
}
