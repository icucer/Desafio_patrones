package patrones;

import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int unidadesParaImprimir = 0;
        int opcion = 0;

        System.out.println("\nBienvenido al desafio Patrones!");
        System.out.println("Escoje una opcion en el siguente menu.");
        do {
            System.out.println("\n+-----------" + "\u001B[32;1m" + "MENU" + "\u001B[0m" + "-----------+");
            System.out.println("|  1. Patron         " + "\u001B[31m" + "*." + "\u001B[0m" + "    |");
            System.out.println("|  2. Patron        " + "\u001B[31m" + "1234" + "\u001B[0m" + "   |");
            System.out.println("|  3. Patron         " + "\u001B[31m" + "||*" + "\u001B[0m" + "   |");
            System.out.println("|  4. "+"\u001B[35;1m"+"SALIR"+"\u001B[0m"+"                |");
            System.out.println("+--------------------------+");
            System.out.print("\nIngrese su opcion aca: ");
            opcion = sc.nextInt();
            if (opcion != 4) {
                System.out.println("\nIngrese cuantas veces queres que se repita el patron: ");
                unidadesParaImprimir = sc.nextInt();
            }
            switch (opcion) {
                case 1:
                    for (int i = 0; i < unidadesParaImprimir; i++) {
                        if (i % 2 == 0) {
                            System.out.print("\u001B[31m" + "*." + "\u001B[0m");
                        } else {
                            System.out.print("\u001B[33m" + "*." + "\u001B[0m");
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < unidadesParaImprimir; i++) {
                        if (i % 2 == 0) {
                            System.out.print("\u001B[31m" + "1234" + "\u001B[0m");
                        } else {
                            System.out.print("\u001B[34m" + "1234" + "\u001B[0m");
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < unidadesParaImprimir; i++) {
                        if (i % 2 == 0) {
                            System.out.print("\u001B[31m" + "||*" + "\u001B[0m");
                        } else {
                            System.out.print("\u001B[33m" + "||*" + "\u001B[0m");
                        }
                    }
                    break;
            }
        } while (opcion != 4);
    }
}
