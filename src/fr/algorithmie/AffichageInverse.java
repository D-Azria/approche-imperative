package fr.algorithmie;

public class AffichageInverse {
    static public void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Afficher l’ensemble des éléments du tableau grâce à une boucle
        System.out.println("array (enhanced loop) :");
        for (int j : array) {
            System.out.println(j);
        }

        // Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        System.out.println("array reverse :");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
        int[] arrayCopy = new int[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);
    }
}
