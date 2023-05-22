package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    static public void main(String[] args) {
        int[] plusGrand = new int[10];
        for(int i = 0; i < 10; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrer un nombre : ");
            int nb = scanner.nextInt();
            plusGrand[i] = nb;
        }

        // Rechercher le plus grand élément du tableau
        int max = plusGrand [0];
        for (int i = 1; i < plusGrand.length; i++) {
            if (plusGrand[i] > max) {
                max = plusGrand[i];
            }
        }
        System.out.print("Le plus grand nombre est : " + max);


    }
}
