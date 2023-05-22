package fr.algorithmie;

import java.util.Scanner;

//
//// A FINIR
//

public class Interfactif21Batons {
    static public void main(String[] args) {
        int baton = 21;
        int random;
        int nb;
        System.out.println("Il y a "+ baton + " bâtons.");
do {
    do {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choisissez de retirer 1 à 3 bâtons : ");
        nb = scanner.nextInt();
    } while (nb > 3);

    baton = baton - nb;
    System.out.println("Il reste "+ baton + " bâtons.");

    if (baton > 1) {
        do {
            random = (int) (Math.random() * 3) + 1;
        } while (random > baton);
        baton = baton - random;
        System.out.println("L'ordinateur en retire " + random + ", il reste donc " + baton + " bâtons.");

    } else if (baton == 1) {
        System.out.println("Vous avez gagné !!!");
        break;
    }
} while (baton > 0);
    }
}
