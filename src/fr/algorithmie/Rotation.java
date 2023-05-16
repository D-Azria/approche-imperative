package fr.algorithmie;

public class Rotation {
    static public void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("array :");
        for (int element: array){
            System.out.println(element);
        }

        // Stockage de la valeur max avant écrasement
        int arrayMax = array[array.length -1];
        // Réécriture des données sur l'index actuel avec celle de l'index inférieur
        for (int i = array.length -1 ; i >= 0; i--){
            if (i != 0) {
                array[i] = array[i - 1];
            } else if (i == 0){
                // La donnée de l'index max initial a été écrasée, récupération via arrayMax
                array[i] = arrayMax;
            }
        }

        System.out.println("array rotation :");
        for (int element: array){
            System.out.println(element);
        }

    }
}
