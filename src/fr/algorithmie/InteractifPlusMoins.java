package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    static public void main(String[] args) {

        // Génère un nombre entre 1 et 100
        int random = (int) (Math.random() * 100) + 1;
        // System.out.println(random);


        int nb;
        int counter = 0;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Trouver le nombre entre 1 et 100 : ");
            nb = scanner.nextInt();
            counter ++;
            if(nb > random){
                System.out.println("Trop grand !");
            } else if (nb < random) {
                System.out.println("Trop petit !");
            }
        }
        while ( nb != random);

        System.out.println("Bravo, vous avez trouvé en " + counter + " coups !");

    }
}
