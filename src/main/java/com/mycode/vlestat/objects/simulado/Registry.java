package com.mycode.vlestat.objects.simulado;

public class Registry {

    String[] registry = new String[50];
    String[] name     = new String[50];
    float[]  grade    = new float[50];

    public void menu() {

        System.out.print("""
                ===== CADASTRO DE ALUNOS =====
                
                1 - Cadastrar aluno
                2 - Listar alunos
                3 - Buscar aluno por matrícula
                4 - Alterar nota
                5 - Remover aluno
                0 - Sair
                
                """);

    }

    public void registerStudent(Student student) {

        for (int i = 0; i < registry.length; i++) {

            if (registry[i] == null) {

                registry[i] = student.getRegistry();
                name[i] = student.getName();
                grade[i] = student.getGrade();

            }

        }

    }

    public String listStudents() {

        String list = "";

        for (int i = 0; i < registry.length; i++) {

            if (registry[i] != null) {

                list += "\n===== Aluno " +(i+1)+ "=====\n" +
                        "\nMatrícula : " +registry[i]+
                        "\nNome : "      +name[i]+
                        "\nGrade : "     +grade[i];

            }

        }

        return list;

    }

    public String searchStudent(Student student) {

        String search = "";

        for (int i = 0; i < registry.length; i++) {

            if (registry[i].equals(student.getRegistry())) {

                search = "===== " +student.getName()+ " =====\n" +
                         "Matrícula : " +student.getName();

            }

        }

        return search;

    }

    public void editGrade() {}

    public void removeStudent() {}



}
