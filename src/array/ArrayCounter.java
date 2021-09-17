package array;

import java.util.Arrays;

public class ArrayCounter {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] counter = new int[10];

        for(int i =0; i<arr.length ; i++){
            arr[i] = (int)(Math.random()*10);
        }

        for(int i = 0 ; i <arr.length ; i++){
            counter[arr[i]]++;
        }
        System.out.println(Arrays.toString(counter));
        System.out.println(Arrays.toString(arr));
    }
}
