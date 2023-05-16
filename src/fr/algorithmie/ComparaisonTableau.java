package fr.algorithmie;

public class ComparaisonTableau {
    static public void main(String[] args){
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;

        // Ecrire le code permettant de compter le nombre d’éléments en commun dans ces 2 tableaux
        int commonValues = 0;
        for (int i = 0; i < array2.length; i++){
            for(int j = 0; j < array1.length; j++){
                if (array2[i] == array1[j]){
                    commonValues ++;
                }
            }
        }
        System.out.println("Nombre de valeurs en commun :");
        System.out.println(commonValues);
    }
}
