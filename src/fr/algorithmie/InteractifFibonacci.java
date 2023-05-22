package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    static public void main(String[] args) {

        int rang;
        do {
        Scanner scannerMenu = new Scanner(System.in);
        System.out.print("Choisir un rang supérieur à 2 : ");
        rang = scannerMenu.nextInt();
        } while (rang <=2);

        int[] fibo = new int[rang];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2 ; i < fibo.length ; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        System.out.println("La valeur du nombre de rang " + rang + " dans la suite de Fibonacci est de : " + fibo[rang-1]);

    }

}
