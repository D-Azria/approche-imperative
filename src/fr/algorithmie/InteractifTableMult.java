package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;
        do{
            System.out.print("Entrer un nombre : ");
            nb = scanner.nextInt();
        }
        while ( nb < 1 || nb > 10);
        System.out.println("Table de " + nb + " :");
        for(int i = 1; i <= 10; i++){
            System.out.println(nb + " * " + i + " = " + nb * i);
        }

    }
}
