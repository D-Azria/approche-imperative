package fr.algorithmie;

public class SommeDeTableaux {
    static public void main(String[] args){
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        // Max length, inutile ici
        int maxLength = 0;
        if (array1.length >= array2.length) {
            maxLength = array1.length;
        } else {
            maxLength = array2.length;
        }

        // Créer un tableau qui contient la somme des 2 précédents tableaux
        int[] arraySummed = new int[maxLength];
        for (int i=0; i < maxLength; i++){
            arraySummed[i] = array1[i] + array2[i];
        }
        System.out.println("arraySummed :");
        for (int element: arraySummed){
            System.out.println(element);
        }

    }

}
