package fr.algorithmie;

public class FirstLast {
    static public void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, 1};

        // boolean control = array.length>0 && array[0]==array[array.length-1];
        /*
        if(array.length>0 && array[0]==array[array.length-1]){
            control = true;
        } else {
            control = false;
        }
        */

        // Check :
        System.out.println(firstlast(array));
    }

    static boolean firstlast(int[] array){
        return array.length>0 && array[0]==array[array.length-1];
    }
}