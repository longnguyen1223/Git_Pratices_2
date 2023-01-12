package LongN;

import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {
        int[] array= new int[]{1,1,1,1,1,2,2,2,2,2,23,3,3,3,3,34,4,4,4,4,5,6,6,7,7,7,7};
        System.out.println(Arrays.stream(array).max());

        double total=0;
        for (int i = 0; i < array.length; i++) {
            total+=array[i];
            
        }
        System.out.println(total);
        System.out.println(array.length);



    }
}
