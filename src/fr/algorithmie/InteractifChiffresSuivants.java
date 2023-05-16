package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        int nb = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.print(nb + i + ", ");
        }
    }

}
