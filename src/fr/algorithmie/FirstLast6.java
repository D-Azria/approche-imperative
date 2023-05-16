package fr.algorithmie;

public class FirstLast6 {
    static public void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, 6};

        //    boolean control = array.length>0 && array[0]==6 || array[array.length-1]==6;
/*
        if(array.length>0 && array[0]==6 || array[array.length-1]==6){
            control = true;
        } else {
            control = false;
        }
 */
        // Check :
        System.out.println(firstLast6(array));
    }


    static boolean firstLast6(int[] array){
        return array.length>0 && array[0]==6 || array[array.length-1]==6;
    }

}
