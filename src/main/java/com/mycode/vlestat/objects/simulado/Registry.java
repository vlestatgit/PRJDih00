package com.mycode.vlestat.objects.simulado;

import java.util.Scanner;

public class Registry {

    String[] id    = new String[50];
    String[] name  = new String[50];
    float[]  grade = new float[50];

    public void menu() {

        Registry registry = new Registry();
        Scanner input     = new Scanner(System.in);

        System.out.print("""
                ===== CADASTRO DE ALUNOS =====
                
                1 - Cadastrar aluno
                2 - Listar alunos
                3 - Buscar aluno por matrícula
                4 - Alterar nota
                5 - Remover aluno
                0 - Sair
                """);

        int option;

        do {

            System.out.print("\nDigite aqui : ");
            option = input.nextInt();

            String id;
            String name;
            float  grade;

            switch (option) {

                case 1 :

                    System.out.print("\nMatricula : ");
                    id = input.next();

                    System.out.print("Nome : ");
                    name = input.next();

                    System.out.print("Nota : ");
                    grade = input.nextFloat();

                    Student student = new Student(id, name, grade);

                    registry.registerStudent(student);

                    break;

                case 2 : System.out.println(registry.listStudents()); break;

                case 3 :

                    System.out.print("\nPesquisar : ");
                    id = input.next();

                    System.out.println(registry.searchStudent(id));

                    break;

                case 4 :

                    System.out.print("Matricula : ");
                    id = input.next();

                    System.out.print("Nova nota : ");
                    grade = input.nextFloat();

                    registry.editGrade(id, grade);

                    break;

                case 5 :

                    System.out.print("Matricula : ");
                    id = input.next();

                    registry.removeStudent(id);

                    break;

                default : System.out.println("Invalido"); break;

            }

        } while (option != 0);

    }

    public void registerStudent(Student student) {

        for (int i = 0; i < id.length; i++) {

            if (id[i] == null) {

                id[i] = student.getId();
                name[i] = student.getName();
                grade[i] = student.getGrade();

                break;

            }
        }
    }

    public String listStudents() {

        String list = "";

        for (int i = 0; i < id.length; i++) {

            if (id[i] != null) {

                list += "\n\n===== Aluno " +(i+1)+ " =====" +
                        "\nMatrícula : " +id[i]+
                        "\nNome      : " +name[i]+
                        "\nNota      : " +grade[i];

            }
        }

        return list;

    }

    public String searchStudent(String id) {

        String search = "";

        for (int i = 0; i < this.id.length; i++) {

            if (this.id[i].equals(id)) {

                search = "\n===== " +name[i]+ " =====" +
                         "\nMatrícula : " +this.id[i]+
                         "\nNome      : " +name[i]+
                         "\nNota      : " +grade[i];

                break;

            }
        }

        return search;

    }

    public void editGrade(String id, float newGrade) {

        for (int i = 0; i < this.id.length; i++) {

            if (this.id[i].equals(id)) {

                grade[i] = newGrade;
                break;

            }
        }
    }

    public void removeStudent(String id) {

        for (int i = 0; i < this.id.length; i++) {

            if (this.id[i].equals(id)) {

                this.id[i] = null;
                name[i]    = null;
                grade[i]   = 0;
                break;

            }
        }
    }
}
