package fr.boucles;

public class ExerciceBoucleBase {
    static public void main(String[] args) {
        // Affichez tous les nombres de 1 à 10
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }
        // Affichez 20 fois votre nom et votre prénom
        String nomPrenom = "AZRIA David";
        for(int i = 0; i <20; i++){
            System.out.println(nomPrenom);
        }
        // Affichez les éléments pairs de 2 à 100
        for (int i = 2; i<101; i+=2){
            System.out.println(i);
        }

        // Affichez les éléments impairs de 1 à 99
        int i = 0;
        while (i<100){
            if (i % 2 != 0) {
                System.out.println(i);
                i++;
            } else {
                i++;
            }
        }
    }
}
