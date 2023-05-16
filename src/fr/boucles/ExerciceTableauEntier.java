package fr.boucles;

public class ExerciceTableauEntier {
    static public void main(String[] args){
        // Déclarez un tableau d’entiers contenant tous les entiers de 1 à 10
        int [] table = new int [10];
        for (int i = 0; i < table.length; i++){
            table[i] = i+1;
        }
        System.out.println("Table :");
        // Affichez le premier élément du tableau
        System.out.println(table[0]);
        // Affichez la longueur du tableau en utilisant la propriété length
        System.out.println(table.length);
        // Affichez le dernier élément du tableau en utilisant la propriété length
        System.out.println(table[table.length - 1]);
        // Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8.
        table[4] = 8;
        System.out.println(table[4]);




        System.out.println("Table 2 :");
        // Déclarez un tableau d’entiers contenant tous les entiers de 1 à 10
        int [] table2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Affichez le premier élément du tableau
        System.out.println(table2[0]);
        // Affichez la longueur du tableau en utilisant la propriété length
        System.out.println(table2.length);
        // Affichez le dernier élément du tableau en utilisant la propriété length
        System.out.println(table2[table2.length-1]);
        // Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8.
        System.out.println(table2[4]);
        table2[4] = 8;
        System.out.println(table2[4]);
    }
}
