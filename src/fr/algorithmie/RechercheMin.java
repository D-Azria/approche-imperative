package fr.algorithmie;

import java.util.Arrays;

public class RechercheMin {
    static public void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Rechercher le plus petit élément du tableau
        int min = array [0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // int min = Arrays.stream(array).min().getAsInt();
        System.out.println(min);
    }
}
