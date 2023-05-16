package fr.boucles;

public class ExerciceBouclesEtTests {
    static public void main(String[] args){
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        // Afficher l’ensemble des éléments du tableau grâce à une boucle
        System.out.println("array :");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("array (enhanced loop) :");
        for (int j : array) {
            System.out.println(j);
        }

        // Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        System.out.println("array reverse :");
        for (int i = array.length -1 ; i >= 0; i--) {
            System.out.println(array[i]);
        }

        // Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
        System.out.println("array (int > 3) :");
        for (int i = 0; i < array.length; i++){
            if(array[i]> 3){
                System.out.println(array[i]);
            }
        }

        // Combiner une boucle et un test de manière à n’afficher que les entiers pairs
        System.out.println("array (int pairs) :");
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }

        // Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs
        System.out.println("array (index pairs) :");
        for(int i = 0; i <array.length; i++){
            if(i % 2 == 0){
                System.out.println(array[i]);
            }
        }

        // Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        System.out.println("array (int impairs) :");
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                System.out.println(array[i]);
            }
        }
    }
}
