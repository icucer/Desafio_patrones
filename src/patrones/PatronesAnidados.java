package patrones;

import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int variantePatron = 0;
        int opcion = 0;

        System.out.println("\nBienvenido al desafio 'Patrones anidados'!");
        System.out.println("Escoje una opcion en el siguente menu.");
        do {
            System.out.println("\n+-----------" + "\u001B[32;1m" + "MENU" + "\u001B[0m" + "-----------+");
            System.out.println("|  1. Patron       'O'     |");
            System.out.println("|  2. Patron       'Z'     |");
            System.out.println("|  3. Patron       'X'     |");
            System.out.println("|  4. Patron       'TL'    |");
            System.out.println("|  5. "+"\u001B[35;1m"+"SALIR"+"\u001B[0m"+"                |");
            System.out.println("+--------------------------+");
            System.out.print("\nIngrese su opcion aca: ");
            opcion = sc.nextInt();
            if (opcion != 5) {
                System.out.println("\nSeleccionar tamaño del patron: ");
                variantePatron = sc.nextInt();
            }
            switch (opcion) {
                case 1:
                    for (int i = 0; i < variantePatron; i++) {
                        for (int j = 0; j < variantePatron; j++) {
                            if (i == 0 || i == variantePatron - 1 || j == 0 || j == variantePatron - 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < variantePatron; i++) {
                        for (int j = 0; j < variantePatron; j++) {
                            if (i == 0 || i == variantePatron - 1 || i + j == variantePatron - 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < variantePatron; i++) {
                        for (int j = 0; j < variantePatron; j++) {
                            if (i == j || i + j == variantePatron - 1) {
                                System.out.print("x");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i < variantePatron; i++) {
                        for (int j = 0; j < variantePatron; j++) {
                            if (i == 0 && j < variantePatron - 1 || j > 0 && j < variantePatron - 1 || i == variantePatron - 1 && j == variantePatron - 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;

            }
        } while (opcion != 5);
    }
}
