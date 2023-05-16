package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;
        do{
            System.out.print("Entrer un nombre :");
            nb = scanner.nextInt();
        }
        while ( nb < 1 || nb > 10);
        System.out.print("Vous avez entré :");
        System.out.print(nb);

    }

}
