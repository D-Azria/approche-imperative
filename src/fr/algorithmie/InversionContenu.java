package fr.algorithmie;

import java.util.Arrays;
import java.util.Collections;

public class InversionContenu {
    static public void main(String[] args){
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length -1 -i];
        }

        // Afficher l’ensemble des éléments des 2 tableaux
        System.out.println("array :");
        for (int element: array){
            System.out.println(element);
        }
        System.out.println("arrayCopy :");
        for (int element: arrayCopy){
            System.out.println(element);
        }
    }

}
