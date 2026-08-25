package com.mycode.vlestat;

// @author vlestat

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.lang.Integer;

public class Exercises {

    public static void lista04() throws InterruptedException {

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

        System.out.print("Somatório : " + som);
        System.out.println();

        // Questão 3

        System.out.print("\nDigite um número : ");
        num = input.nextInt();

        float fac = 1;

        for (int i = 1; i <= num; i ++) {fac *= i;}

        System.out.print("Fatorial : " + fac);
        System.out.println();

        // Questão 4

        System.out.print("\nDigite 10 valores reais : \n\n");

        float soma = 0;
        float vals;

        for (int i = 1; i <= 10; i ++) {

            System.out.print("Valor " +i+ " : ");
            vals = input.nextFloat();
            soma += vals;

        }

        float arit = soma / 10;

        System.out.print("\nAritmetica : " + arit);
        System.out.println();

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

        System.out.print("\nAritmetica : " + arit);
        System.out.println();

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
                    System.out.print("Raiz : " +root+ "\n\n");

                    break;

                case "elevar":

                    System.out.print("\nDigite um número : ");
                    num = input.nextInt();

                    System.out.print("Digite um Expoente : ");
                    int exp =  input.nextInt();

                    double power = Math.pow(num, exp);
                    System.out.print("Raiz : " +power+ "\n\n");

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

        System.out.print("E : " + E);
        System.out.println();

        // Questão 11

        System.out.print("\nDigite 10 números :\n\n");

        int[] vet = new int[10];

        for (int i = 0; i <= 9; i++) {vet[i] = input.nextInt();}

        for (int i = 0; i <= 8; i++) {

            int vetPosition0 = vet[i];
            int vetPosition1 = vet[i+1];

            if (vetPosition0 < vetPosition1) {

                vet[i] = vetPosition1;
                vet[i+1] = vetPosition0;

            }

        }

        System.out.print("\nMenor núrmero : " + vet[9]);
        System.out.println();

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

        System.out.print("\nMaior núrmero : " + vet[9]);
        System.out.println();

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
    public static void lista05()  {

        Random random = new Random();

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
    public static void lista06()  {

        Scanner input = new Scanner(System.in);

        // Questão 1

        System.out.print("Preencha a lista de idades :\n\n");
        int[] ages = new int[10];

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


        System.out.print("\nPreencha as listas :\n");

        System.out.print("\nNomes :\n\n");
        String[] names = new String[6];

        for (int i = 1; i <= 5; i++) {
            System.out.print("Pessoa " +i+ " : ");
            names[i] = input.next().toLowerCase();
        }

        System.out.print("\nCidades :\n\n");
        String[] cities = new String[6];

        for (int i = 1; i <= 5; i++) {
            System.out.print("Pessoa " +i+ " : ");
            cities[i] = input.next();
        }

        System.out.print("\nSexos (M/F) :\n\n");
        char[] sex = new char[6];

        for (int i = 1; i <= 5; i++) {
            System.out.print("Pessoa " +i+ " : ");
            sex[i] = input.next().toUpperCase().charAt(0);
        }

        String search = "";

        do {

            System.out.print("\n\"Digite \"fim\" se quiser finalizar a pesquisa\"\n");

            System.out.print("\nPesquisar por nome : ");
            search = input.next().toLowerCase();

            for (int i = 1; i <= 5; i++) {

                if (search.equals(names[i])) {
                    System.out.printf("\nNome   : %s\nCidade : %s\nSexo   : %c\n", names[i], cities[i], sex[i]);
                    break;
                }

            }


        } while (!search.equals("fim"));

        System.out.println();

        // Questão 3

        String[] dogs = {"null","Dih","Nih","Fih","Lih","Pih"};
        String[] race = {"null","dog","cat","alien","idk","black"};

        int id = 0;
        String options = "";

        do {

            System.out.print("""

                    ===== Registro do Canil =====

                    ==== Opções

                    == Imprimir  == Pesquisar
                    == Editar    == Trocar
                    == Excluir  == Sair

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

                case "excluir" :

                    System.out.print("\nEscolha o id correspondente (1 a 5) : ");
                    id = input.nextInt();

                    dogs[id] = "xxxx";
                    race[id] = "xxxx";

                    System.out.print("\nExcluido\n");

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
    public static void lista07()  {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println();

        // Questão 1

        int[] vRandom = new int[10];

        for (int i = 0; i < vRandom.length; i++) {

            vRandom[i] = random.nextInt(101);

        }

        int val;

        do {

            System.out.print("\nDigite um valor : ");
            val = input.nextInt();

            boolean valIn = false;

            for (int i : vRandom) {

                if (i == val) {

                    valIn = true;
                    break;

                }

            }

            if (valIn) {System.out.printf("\nO Número %d está no vetor\n", val);}
            else {System.out.printf("\nO Número %d não está no vetor\n", val);}

        } while (val >= 0);

        // Questão 2

        String [] products = new String [10];
        int    [] codes    = new int    [10];
        double [] price    = new double [10];

        int newProduct = 0;
        int option;

        do {

            System.out.print("""
                
                ===== Menu =====
                
                1 -> Inserir Produto
                2 -> Verificar Produtos acima de R$100,00
                3 -> Sair
                
                Digite aqui :""" + " ");

            option = input.nextInt();

            switch (option) {

                case 1 :

                    if (newProduct > products.length) {

                        System.out.print("\nLimite Atingido\n");
                        break;

                    }

                    System.out.print("\nProduto (nome) : ");
                    products[newProduct] = input.next();

                    System.out.print("Código (xxx) : ");
                    codes[newProduct] = input.nextInt();

                    System.out.print("Preço (x.xx) : ");
                    price[newProduct] = input.nextDouble();

                    newProduct++;

                    break;

                case 2 :

                    System.out.println("\n============================\nProdutos acima de R$100,00 :");

                    for (int i = 0; i < price.length; i++) {

                        if (price[i] >= 100) {

                            System.out.printf("""
                                    ============================
                                    Produto : %s
                                    Código : %d
                                    Preço : R$%.2f
                                    """,  products[i], codes[i], price[i]);

                        }
                    }

                    break;

                default :

                    if (option != 3) {System.out.print("\nInválido\n");}

                    break;

            }

        } while (option != 3);

        // Questão 3

        boolean[] bool = new boolean[10];

        System.out.println("\nPreencha o vetor (true/false) : \n");

        for (int i = 0; i < bool.length; i++) {

            System.out.printf("Posição %d : ", i);
            bool[i] = input.nextBoolean();

        }

        System.out.println();

        for (int i = (bool.length) - 1; i > 0; i--) {

            System.out.println(bool[i]);

        }

    }
    public static void lista08()  {

        Random random = new Random();

        System.out.println();

        // Questão 1

        int[] randomNumbers = new int[20];

        for (int i = 0; i < randomNumbers.length; i++) {randomNumbers[i] = random.nextInt(-256, 256);}

        for (int randomNumber : randomNumbers) {System.out.print(randomNumber + " ");}

        int smallNumber1 = Integer.MAX_VALUE;
        int smallNumber2 = Integer.MAX_VALUE;

        for (int randomNumber : randomNumbers) {

            if (smallNumber1 > randomNumber) {

                smallNumber2 = smallNumber1;
                smallNumber1 = randomNumber;

            } else if (smallNumber2 > randomNumber) {

                smallNumber2 = randomNumber;

            }

        }

        System.out.print("\n\n");

        System.out.printf("1° Menor Número : %d\n2° Menor Número : %d\n\n", smallNumber1, smallNumber2);

        // Questão 2

        String[] names   = {"Lestat","Saulo","Albani","Bruh","Yes","No","A","B","C","D"};
        String[] names5L = new String[names.length];

        int newPosition = 0;

        for (String i : names) {

            if (i.length() >= 5) {

                names5L[newPosition] = i;
                newPosition++;

            }
        }

        for (String i : names5L) {

            if (i != null) {

                System.out.println(i);

            }
        }

        System.out.println();

        // Questão 3

        randomNumbers = new int[10];

        for (int i = 0; i < randomNumbers.length; i++) {

            int num = random.nextInt(-256, 256);
            boolean repeated = false;

            for (int j = 0; j < i; j++) {

                if (randomNumbers[j] == num) {

                    repeated = true;
                    break;

                }
            }

            if (repeated) {

                i--;

            } else {

                randomNumbers[i] = num;

            }
        }

        for (int randomNumber : randomNumbers) {

            System.out.print(randomNumber + " ");

        }

    }
    public static void lista09()  {

        Scanner input = new Scanner(System.in);

        System.out.println();

        // Questão 1

        avgWeighted();

        // Questão 2

        int option;

        do { menu(); option = input.nextInt(); } while (option != 3);

        // Questão 3

        int age = ageCalculation(2026, 2010);

        System.out.printf("\nIdade : %d\n", age);

        // Questão 4

        double[] root = bhaskara(1, -5, 6);

        if (root == null) {

            System.out.print("\nNão há raízes\n");

        } else {

            for (int i = 0; i < root.length; i++) {

                System.out.printf("\nX%d : %.2f", i+1, root[i]);

            }
        }

        // Questão 5

        double idealWeight = idealWeight('M', 1.72);

        System.out.printf("\n\nPeso Ideal : %.2fKg\n\n", idealWeight);

        // Questão 6

        int[] vet = {10, 20, 30, 40, 50};

        printVet(vet);

        // Questão 7

        System.out.println();

        String[] names = {"Lestat","Saulo","Albani","Bruh","Yes"};
        String[] names5L = names5L(names);

        for (String i : names5L) {

            if (i != null) {

                System.out.println(i);

            }
        }

        // Questão 8

        int randomNumber = limitRandom(100);
        System.out.print("\n" + randomNumber);

    }

        public static void menu()                                       {

        System.out.print("""
                
                =====
                Menu
                =====
                
                1) Inserir cliente
                2) Remover cliente
                3) Encerrar programa
                
                Digite a opção :""" + " ");

    } // Lista 09
        public static void avgWeighted()                                {

        Scanner input = new Scanner(System.in);

        System.out.print("Media Ponderada :\n\n");

        System.out.print("Valor 1 : "); double val1 = input.nextDouble();
        System.out.print("Valor 2 : "); double val2 = input.nextDouble();
        System.out.print("Valor 3 : "); double val3 = input.nextDouble();
        System.out.print("Peso  1 : "); double wei1 = input.nextDouble();
        System.out.print("Peso  2 : "); double wei2 = input.nextDouble();
        System.out.print("Peso  3 : "); double wei3 = input.nextDouble();

        double mediaPonderada = ((val1*wei1) + (val2*wei2) + (val3*wei3)) / (wei1+wei2+wei3);

        System.out.printf("\nResultssss : %f\n", mediaPonderada);

    } // *
        public static int ageCalculation(int yearCurrect, int yearBorn) {

        return(yearCurrect-yearBorn);

    } // *
        public static double[] bhaskara(double A, double B, double C)   {

        double delta = (B*B) - 4 * A * C ;

        if (delta < 0) {return null;}

        double X1 = (-B + Math.sqrt(delta)) / (2 * A) ;
        double X2 = (-B - Math.sqrt(delta)) / (2 * A) ;

        if (delta > 0)  {return new double[] {X1, X2};}

        return new double[] {X1};

    } // *
        public static double idealWeight(char sex, double hight)        {

        double idealMW  = (72.7 * hight) - 58.0;
        double idealFW  = (62.1 * hight) - 44.7;

        if (sex == 'M') {return idealMW;}
        if (sex == 'F') {return idealFW;}

        return 0;

    } // *
        public static void printVet(int[] vet)                          {

        for (int i : vet) {
            System.out.println(i);
        }

    } // *
        public static String[] names5L(String[] names)                  {

        String[] names5L = new String[names.length];

        int newPosition = 0;

        for (String i : names) {

            if (i.length() >= 5) {

                names5L[newPosition] = i;
                newPosition++;

            }
        }

        return names5L;

    } // *
        public static int limitRandom(int max)                          {

        Random random = new Random();
        return random.nextInt(1, max+1);

    } // *

    public static void simulado01() {

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

                        System.out.print("\nNão é possivel realizar o cadastro. Limite atingido.\n");
                        break;

                    }

                    System.out.print("\nDigite seu nome : ");
                    names[namesLength] = input.next();

                    System.out.print("Digite seu endereço : ");
                    addresses[addressesLength] = input.next();

                    System.out.print("\nCadastro concluido com sucesso!\n");

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

                                System.out.print("\nCadastro excluido com sucesso !\n\n");

                                break;

                            } else fail ++ ;

                        } else register ++ ;

                        if (register == 9) {

                            System.out.print("\nNenhum cadastro encontrado\n");
                            break;

                        }

                        if (fail == 9) {

                            System.out.print("\nNão encontrado\n");
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

                            if (names[i].equalsIgnoreCase("maria")) {marias ++ ;}

                        }

                    }

                    System.out.print("\nForam cadastradas " +marias+ " pessoas chamadas Maria.\n");

                    break;

                case 'e' : break;

                default : System.out.print("\nComando Inválido\n"); break;

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
    public static void simulado02() {

        Random random = new Random();

        // Questão 1

        newSalary(6767.67, 67);

        // Questão 2

        int[] vetorInt = new int[10];

        for (int i = 0; i < vetorInt.length; i++) {

            vetorInt[i] = random.nextInt(-256, 256);

        }

        int majorVal = majorVal(vetorInt);

        for (int i : vetorInt) {

            System.out.print(i + " ");

        }

        System.out.printf("\n\nMaior Número : %d\n\n", majorVal);

        // Questão 3

        String[] vetorString = {"Albani", "Zulu", "Leslat", "Yes", "No"};

        vetCleaner(vetorString);

        for (String i : vetorString) {

            System.out.println(i);

        }

        // Questão 4

        System.out.println();

        int[] randomVals = randomVals(256);

        for (int i : randomVals) {

            System.out.print(i + " ");

        }

    }

        public static void newSalary(double salary, double increasePercent) {

        double newSalary = salary + ((salary * increasePercent) / 100);
        System.out.printf("\nNovo Salário : %.2f\n\n", newSalary);

    } // Simulado 02
        public static int majorVal(int[] vetor)                             {

        int majorVal = Integer.MIN_VALUE;

        for (int i : vetor) {

            if (i > majorVal) {majorVal = i;}

        }

        return majorVal;

    } // *
        public static void vetCleaner(String[] vetor)                       {

        Arrays.fill(vetor, null);

    } // *
        public static int[] randomVals(int bound)                           {

        Random random = new Random();

        int[] vetInt = new int[10];

        for (int i = 0; i < vetInt.length; i++) {

            vetInt[i] = random.nextInt(1, bound);

        }

        return vetInt;

    } // *

    public static void main(String[] args) throws InterruptedException {



    }
}
