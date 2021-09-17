package array;

import java.util.Arrays;

public class SortArrayEx2 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i <arr.length-1 ; i++){
            boolean changed = false;
            for(int j=0; j<arr.length-1-i ;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    changed = true;
                }
            }
            if(!changed) break;
        }
        System.out.println(Arrays.toString(arr));
    }

}
