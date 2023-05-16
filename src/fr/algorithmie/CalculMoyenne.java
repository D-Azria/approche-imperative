package fr.algorithmie;

import java.util.Arrays;

public class CalculMoyenne {
    static public void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Quelle est la moyenne des éléments du tableau ?
        double average = Arrays.stream(array).average().getAsDouble();
        System.out.println("Moyenne via méthode :");
        System.out.println(average);

        // Moyenne à partir d'une somme
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        double mean = (double) sum / array.length;
        System.out.println("Moyenne via somme :");
        System.out.println(mean);
    }
}
