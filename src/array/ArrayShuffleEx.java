package array;

import java.util.Arrays;

public class ArrayShuffleEx {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        for(int i = 0 ; i <numArr.length ; i++){
            numArr[i] = i;
        }
        System.out.println(Arrays.toString(numArr));

        for(int i = 0 ; i <100 ; i ++){
            int  n = (int)(Math.random()*10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
