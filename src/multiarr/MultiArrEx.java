package multiarr;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrEx {
    public static void main(String[] args) {
        final int SIZE = 10;
        int x= 0 , y =0;
        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = {
                {0,0,0,0,0,0,1,0,0},
                {1,1,1,1,0,0,1,0,0},
                {0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,0,0},
                {1,1,0,1,0,0,0,0,0},
                {0,0,0,1,0,0,0,0,0},
                {0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,0}
        };
        for(int i =1;i<SIZE;i++){
            board[0][i] = board[i][0] = (char)(i+'0');
        }
        for(char[] b : board){
            for(char c : b){
                System.out.print(c+ " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("좌표를 입력하세요. 종료는 00 입니다. >");
            String input = scanner.nextLine();

            if(input.length()==2){
                x = input.charAt(0) - '0';
                y = input.charAt(1) - '0';

                if(x==0 && y==0){
                    break;
                }
            }
            if(input.length()!=2||x<=0||x>=SIZE||y<=0||y>=SIZE){
                System.out.println("잘못된 입력입니다. 다시 입력하십시오 > ");
                continue;
            }
            board[x][y] = shipBoard[x-1][y-1]==1? 'O':'X';
            for(int i = 0; i <SIZE ;i ++){
                System.out.println(board[i]);
            }
            System.out.println();
        }
    }
}
