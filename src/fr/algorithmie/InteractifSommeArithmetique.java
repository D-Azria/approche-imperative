package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        int nb = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= nb; i++){
            sum +=i;
        }
        System.out.print(sum);
    }
}
