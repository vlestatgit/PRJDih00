package com.mycode.vlestat;

// @author vlestat

import java.util.Scanner;
import java.util.Random;

public class Exercises {

    public static void lista04() throws InterruptedException {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Questão 1

        System.out.print("Digite seu nome : ");
        String name = input.next();

        System.out.print("Digite um número : ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i += 1) {System.out.print("\n" + name);}

        // Questão 2

        System.out.print("\n\nDigite um número : ");
        num = input.nextInt();

        int som = 0;

        for (int i = 1; i <= num; i ++) {som += i;}

        System.out.println("Somatório : " + som);

        // Questão 3

        System.out.print("\nDigite um número : ");
        num = input.nextInt();

        float fac = 1;

        for (int i = 1; i <= num; i ++) {fac *= i;}

        System.out.println("Fatorial : " + fac);

        // Questão 4

        System.out.println("\nDigite 10 valores reais : \n");

        float soma = 0;
        float vals;

        for (int i = 1; i <= 10; i ++) {

            System.out.print("Valor " +i+ " : ");
            vals = input.nextFloat();
            soma += vals;

        }

        float arit = soma / 10;

        System.out.println("\nAritmetica : " + arit);

        //Questão 5

        System.out.print("\nDigite um número inteiro : ");
        num = input.nextInt();

        soma = 0;

        System.out.println("\nDigite " +num+ " valores reais :\n");

        for (int i = 1; i <= num; i ++) {

            System.out.print("Valor " +i+ " : ");
            vals = input.nextFloat();
            soma += vals;

        }

        arit = soma / num;

        System.out.println("\nAritmetica : " + arit);

        // Questão 6

        System.out.print("\nDigite um número inteiro : ");
        num = input.nextInt();

        for (int i = num; i >= 1; i --) {

            Thread.sleep(1000);
            System.out.print(i + " ");

        }

        // Questão 7

        System.out.print("\n\nDigite um número inteiro : ");
        num = input.nextInt();

        for (int i = 1; i <= num; i ++) {

            if (i % 2 == 0) {

                Thread.sleep(1000);
                System.out.print(i + " ");

            }

        }

        // Questão 8

        System.out.print("""

                  ,-.       _,---._ __  / \\
                 /  )    .-'       `./ /   \\
                (  (   ,'            `/    /|
                 \\  `-"             \\'\\   / |
                  `.              ,  \\ \\ /  |
                   /`.          ,'-`----Y   |
                  (            ;  caixa |   '
                  |  ,-.    ,-'      da |  /
                  |  | (   |   preguiça | /
                  )  |  \\  `.___________|/
                  `--'   `--'

                """);



        // Questão 9

        String options = "";

        do {

            System.out.print("""
                    ===== Opções =====

                    == raiz
                    == elevar
                    == terminar

                    """);

            System.out.print("Digite aqui : ");
            options = input.next().toLowerCase();

            switch (options) {

                case "raiz" :

                    System.out.print("\nDigite um número : ");
                    num = input.nextInt();

                    double root = Math.sqrt(num);
                    System.out.println("Raiz : " +root+ "\n");

                    break;

                case "elevar":

                    System.out.print("\nDigite um número : ");
                    num = input.nextInt();

                    System.out.print("Digite um Expoente : ");
                    int exp =  input.nextInt();

                    double power = Math.pow(num, exp);
                    System.out.println("Raiz : " +power+ "\n");

                    break;

            }

        } while (!options.equals("terminar"));



        // Questão 10

        System.out.print("\nDigite um número : ");
        num = input.nextInt();

        fac = 1;
        float E = 1;

        for (int i = 1; i <= num; i ++) {

            fac *= i;
            E += (float)(1 / fac);

        }

        System.out.println("E : " + E);

        // Questão 11

        System.out.println("\nDigite 10 números :\n");

        int vet[] = new int[10];

        for (int i = 0; i <= 9; i++) {vet[i] = input.nextInt();}

        for (int i = 0; i <= 8; i++) {

            int vetPosition0 = vet[i];
            int vetPosition1 = vet[i+1];

            if (vetPosition0 < vetPosition1) {

                vet[i] = vetPosition1;
                vet[i+1] = vetPosition0;

            }

        }

        System.out.println("\nMenor núrmero : " + vet[9]);

        // Questão 12

        System.out.println("\nDigite 10 números :\n");

        for (int i = 0; i <= 9; i++) {vet[i] = input.nextInt();}

        for (int i = 0; i <= 8; i++) {

            int vetPosition0 = vet[i];
            int vetPosition1 = vet[i+1];

            if (vetPosition0 > vetPosition1) {

                vet[i] = vetPosition1;
                vet[i+1] = vetPosition0;

            }

        }

        System.out.println("\nMaior núrmero : " + vet[9]);

        // Questão 13

        System.out.print("""

                ===== Registro do Operário =====

                === Turnos ===      === Categorias ===

                == Matinal    (M)   == Gerente  (G)
                == Vespertino (V)   == Operário (O)
                == Noturno    (N)

                Solicitaremos algumas informações para o registro

                """);

        char shift; char category;

        boolean valid = false;

        do {

            System.out.print("Categoria         : ");
            category = input.next().charAt(0);

            System.out.print("Turno             : ");
            shift = input.next().charAt(0);

            boolean S = false;
            boolean C = false;

            if (shift == 'M' || shift == 'V' || shift == 'N') {S = true;}
            if (category == 'G' || category == 'O')           {C = true;}

            if (S && C) {valid = true;}

            if (!valid) {System.out.println("\nInvalido\n");}

        } while (!valid);

        float salMIN = 450;
        float salPHW = 0;

        if (category == 'G' && shift == 'N')                   {salPHW = (salMIN * 18) / 100;} else
        if (category == 'G' && (shift == 'M' || shift == 'V')) {salPHW = (salMIN * 15) / 100;} else
        if (category == 'O' && shift == 'N')                   {salPHW = (salMIN * 13) / 100;} else
        if (category == 'O' && (shift == 'M' || shift == 'V')) {salPHW = (salMIN * 10) / 100;}

        System.out.print("Horas Trabalhadas : ");
        int HW = input.nextInt();

        float salINI = salPHW * HW;
        float aux    = 0;

        if (salINI <= 300)                 {aux = (salINI * 20) / 100;}
        if (salINI >  300 && salINI < 600) {aux = (salINI * 15) / 100;}
        if (salINI >= 600)                 {aux = (salINI *  5) / 100;}

        float salary = salMIN + salINI + aux;

        String categoryINFO = "";
        String shiftINFO    = "";

        if (category == 'G') {categoryINFO = "Gerente";}
        if (category == 'O') {categoryINFO = "Operário";}

        if (shift == 'M') {shiftINFO = "Matinal";}
        if (shift == 'V') {shiftINFO = "Vespertino";}
        if (shift == 'N') {shiftINFO = "Noturno";}

        System.out.printf("""

                ===== Informações do Funcionário =====

                Categoria         : %s
                Turno             : %s

                H's Trabalhadas   : %dh
                Valor das H's T   : R$%.2f

                Auxilio           : R$%.2f
                Salário Inicial   : R$%.2f
                Salário Final     : R$%.2f

                """, categoryINFO, shiftINFO, HW, salPHW, aux, salINI, salary);


    }

    public static void lista04A() {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Questão 1

        int[] ages = new int[10];

        System.out.println("Digite a idade de 10 pessoas\n");

        for (int i = 0; i < 10; i++) {

            System.out.print("Pessoa " + (i + 1) + " : ");
            ages[i] = input.nextInt();

        }

        int major = 0;

        for (int i = 0; i < 10; i++) { if (ages[i] >= 18) {major++;} }

        System.out.print("\nMaiores de Idade : " + major);

        // Questão 2



        // Questão 3

        System.out.print("\n\nDigite um número : ");
        float num = input.nextFloat();

    }

    public static void lista05() {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Questão 1

        int[] nums = new int[9];

        for (int i = 0; i < 9; i++) {

            nums[i] = random.nextInt(2,22);

        }

        for (int i = 0; i < 9; i++) {

            System.out.print(nums[i] + " ");

        }

        System.out.println("\n");

        for (int i = 0; i < 9; i++) {

            for (int j = 2; j*j <= nums[i]; j++) {

                if (nums[i] % j == 0) {

                    System.out.println("Número : " +nums[i]+ " Posição : " + i);

                }

            }

        }

    }

    public static void lista06() {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Questão 1

        System.out.println("Preencha a lista de idades :\n");
        int ages[] = new int[10];

        for (int i = 1; i <= 9; i++) {
            System.out.print("Pessoa " +i+ " : ");
            ages[i] = input.nextInt();
        }

        System.out.print("\nPesquise uma idade : ");
        int searchAge = input.nextInt();

        int sFound = 0;

        for (int i = 1; i <= 9; i++) {
            if (ages[i] == searchAge) {sFound += 1;}

        }

        if (sFound == 0) {
            System.out.println("\nNão há ninguém com a idade informada");
        } else {
            System.out.println("\nHá " + sFound + " pessoas com a idade informada");
        }

        // Questão 2


        System.out.println("\nPreencha as listas :");

        System.out.println("\nNomes :\n");
        String names[] = new String[6];

        for (int i = 1; i <= 5; i++) {
            System.out.print("Pessoa " +i+ " : ");
            names[i] = input.next().toLowerCase();
        }

        System.out.println("\nCidades :\n");
        String cities[] = new String[6];

        for (int i = 1; i <= 5; i++) {
            System.out.print("Pessoa " +i+ " : ");
            cities[i] = input.next();
        }

        System.out.println("\nSexos (M/F) :\n");
        char sex[] = new char[6];

        for (int i = 1; i <= 5; i++) {
            System.out.print("Pessoa " +i+ " : ");
            sex[i] = input.next().toUpperCase().charAt(0);
        }

        String search = "";

        do {

            System.out.println("\n\"Digite \"fim\" se quiser finalizar a pesquisa\"");

            System.out.print("\nPesquisar por nome : ");
            search = input.next().toLowerCase();

            for (int i = 1; i <= 5; i++) {

                if (search.equals(names[i])) {
                    System.out.printf("\nNome   : %s\nCidade : %s\nSexo   : %c\n", names[i], cities[i], sex[i]);
                    break;
                }

            }


        } while (!search.equals("fim"));

        System.out.println("");

        // Questão 3

        String dogs[] = {"null","Dih","Nih","Fih","Lih","Pih"};
        String race[] = {"null","dog","cat","alien","idk","black"};

        int id = 0;
        String options = "";

        do {

            System.out.print("""

                    ===== Registro do Canil =====

                    ==== Opções

                    == Imprimir  == Pesquisar
                    == Editar    == Trocar
                    == Executar  == Sair

                    """);

            System.out.print("Digite aqui : ");
            options = input.next().toLowerCase();

            switch (options) {

                case "imprimir" :

                    for (int i = 1; i <= 5; i++) {

                        System.out.printf("""

                                ===== Registro %d =====

                                Nome : %s
                                Raça : %s
                                """, i, dogs[i], race[i]);

                    }

                    break;

                case "editar" :

                    System.out.print("\nEscolha o id correspondente (1 a 5) : ");
                    id = input.nextInt();

                    System.out.print("\nNome : ");
                    dogs[id] = input.next();

                    System.out.print("Raça : ");
                    race[id] = input.next();

                    break;

                case "executar" :

                    System.out.print("\nEscolha o id correspondente (1 a 5) : ");
                    id = input.nextInt();

                    dogs[id] = "xxxx";
                    race[id] = "xxxx";

                    System.out.println("\n... Executado ...");

                    break;

                case "pesquisar" :

                    System.out.print("\nPesquisar por nome : ");
                    String searchName = input.next();

                    int e404 = 0;

                    for (int i = 1; i <= 5; i++) {
                        if (searchName.equals(dogs[i])) {

                            System.out.printf("""

                                    ===== Registro %d =====

                                    Nome : %s
                                    Raça : %s
                                    """, i, dogs[i], race[i]);

                        } else {e404++;}

                    }

                    if (e404 == 5) {System.out.println("\nnão encontrado");}

                    break;

                case "trocar" :

                    System.out.print("\nEscolha o id para fazer a troca (1 a 5) : ");
                    id = input.nextInt();

                    String nameId = dogs[id];
                    String raceId = race[id];

                    System.out.print("Escolha a posição correspondente (1 a 5) : ");
                    int swap = input.nextInt();

                    String nameSwap = dogs[swap];
                    String raceSwap = race[swap];

                    dogs[id] = nameSwap;
                    dogs[swap] = nameId;
                    race[id] = raceSwap;
                    race[swap] = raceId;

                    break;

            }

        } while (!options.equals("sair"));

    }

    public static void lista09() {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Questão 1

        mediaPonderada();

        // Questão 2

        int option;

        do { menu(); option = input.nextInt(); } while (option != 3);

        // Questão 3

    }
    public static void mediaPonderada() {

        Scanner input = new Scanner(System.in);

        System.out.print("Media Ponderada :\n\n");

        System.out.print("Valor 1 : "); double val1 = input.nextDouble();
        System.out.print("Valor 2 : "); double val2 = input.nextDouble();
        System.out.print("Valor 3 : "); double val3 = input.nextDouble();
        System.out.print("Peso  1 : "); double pon1 = input.nextDouble();
        System.out.print("Peso  2 : "); double pon2 = input.nextDouble();
        System.out.print("Peso  3 : "); double pon3 = input.nextDouble();

        double mediaPonderada = ((val1*pon1) + (val2*pon2) + (val3*pon3)) / (pon1+pon2+pon3);

        System.out.print("\nResultssss : " + mediaPonderada);

    } // ( Lista 9 )
    public static void menu() {

        System.out.print("""
                
                =====
                Menu
                =====
                
                1) Inserir cliente
                2) Remover cliente
                3) Encerrar programa
                
                Digite a opção:
                =====
                
                """);

    } // ( Lista 9 )

    public static void simulado() {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Questão 1

        System.out.print("""

                ========== MENU ==========
                A - Novo Cadastro
                B - Excluir Cadastro
                C - Imprimir Cadastros
                D - Contar quantas pessoas chamadas Maria foram cadastradas
                E - Sair
                """);

        String[] names = new String[10];
        String[] addresses  = new String[10];

        int namesLength = -1;
        int addressesLength = -1;

        char option;

        do {

            System.out.print("\nEscolha uma opção : ");
            option = input.next().charAt(0);

            option = Character.toLowerCase(option);

            int register;

            switch (option) {

                case 'a' :

                    namesLength ++ ;
                    addressesLength ++ ;

                    if (namesLength >= 10) {

                        namesLength -- ;
                        addressesLength -- ;

                        System.out.println("\nNão é possivel realizar o cadastro. Limite atingido.");
                        break;

                    }

                    System.out.print("\nDigite seu nome : ");
                    names[namesLength] = input.next();

                    System.out.print("Digite seu endereço : ");
                    addresses[addressesLength] = input.next();

                    System.out.println("\nCadastro concluido com sucesso!");

                    break;

                case 'b' :

                    System.out.print("\nDigite o nome desejado : ");
                    String delete =  input.next();

                    int fail = -1;
                    register = 0;

                    String nullName;
                    String nullAddress;

                    for (int i = 0; i <= 9; i++) {

                        if (names[i] != null) {

                            if (names[i].equals(delete)) {

                                names[i] = names[9]; names[9] = null;
                                addresses[i] = addresses[9]; addresses[9] = null;

                                namesLength -- ;
                                addressesLength -- ;

                                System.out.println("\nCadastro excluido com sucesso !\n");

                                break;

                            } else fail ++ ;

                        } else register ++ ;

                        if (register == 9) {

                            System.out.println("\nNenhum cadastro encontrado");
                            break;

                        }

                        if (fail == 9) {

                            System.out.println("\nNão encontrado");
                            break;

                        }

                    }

                    break;

                case 'c' :

                    register = 0;

                    for (int i = 0; i <= 9; i++) {

                        if (names[i] != null) {

                            System.out.printf("\nNome : %s\nEndereço : %s\n", names[i], addresses[i]);
                            register ++ ;

                        }
                    }

                    if (register == 0) {System.out.println("\nNenhum cadastro encontrado");}

                    break;

                case 'd' :

                    int marias = 0;

                    for  (int i = 0; i <= 9; i++) {

                        if (names[i] != null) {

                            if (names[i].toLowerCase().equals("maria")) {marias ++ ;}

                        }

                    }

                    System.out.println("\nForam cadastradas " +marias+ " pessoas chamadas Maria.");

                    break;

                case 'e' : break;

                default : System.out.println("\nComando Inválido"); break;

            }

        } while (option != 'e');

        // Questão 2

        int[] vRandom = new int[100];
        float[] vResult = new float[100];

        for (int i = 0; i < vRandom.length; i++) {

            vRandom[i] = random.nextInt(1,101);

        }

        for (int i = 0; i < vResult.length; i++) {

            vResult[i] = (float) (500 * vRandom[i]) / 100;

        }

        for (int i = 0; i < vResult.length; i++) {

            System.out.printf("\n%03d     R$%.2f", vRandom[i], vResult[i]);

        }

    }

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println();

    }

}
