package array;

import java.util.Arrays;

public class ArrayMaker {
    public static void main(String[] args) {
        int[] code = {1, 4, 6, -2, -3};
        int[] arr = new int[10];
        for(int i = 0; i<arr.length ; i++){
            int tmp = (int) (Math.random()* code.length);
            arr[i]=code[tmp];
        }
        System.out.println(Arrays.toString(arr));
    }
}
