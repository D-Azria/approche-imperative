package fr.algorithmie;

import java.util.Scanner;

//
//// A FINIR
//

public class InteractifStockageNombre {
    static public void main(String[] args) {
        int menu;
        int[] array = new int[10];
        array[0] = 11;
        // Menu

            System.out.println("Menu :");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants.");
            Scanner scannerMenu = new Scanner(System.in);
            System.out.print("Choisir une option : ");
            menu = scannerMenu.nextInt();



            if (menu == 1){
                Scanner scannerAdd = new Scanner(System.in);
                System.out.print("Entrez un nombre : ");
                int number = scannerAdd.nextInt();
                array[1] = number;
            } else if (menu == 2) {
                Scanner scannerSee = new Scanner(System.in);
                System.out.println("Voici le contenu du tableau : ");
                for (int element : array) {
                    System.out.println(element);
                }

            }
    }
    }
