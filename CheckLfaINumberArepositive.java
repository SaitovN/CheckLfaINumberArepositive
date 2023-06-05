package academy.devonline.java.basic.section01_setup.section06_setup;

import java.lang.reflect.Array;
import java.util.Arrays;



public class CheckLfaINumberArepositive {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,5,3,3,3,3};
        
        
        var allp = true;
        var pol = 3;
        var con = 0;
        for (int value : array) {

            if (value<0){
                allp= false;
            }if (value == pol){
                con++;
            }

        }
        for (int i = 0; i < array.length/2; i++) {
            var temp = array[i];
            array[i]= array[array.length -i -1];
            array[array.length -i -1] = temp;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(allp?"Положително":"НЕ положително");
        System.out.println(con);

    }
}
