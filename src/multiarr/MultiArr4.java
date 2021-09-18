package multiarr;

import java.util.Scanner;

public class MultiArr4 {
    public static void main(String[] args) {
        String[][] words = {
                {"DREAM", "꿈"},
                {"LOVE" , "사랑"},
                {"BRAVE" , "용기"}
        };
        Scanner scanner = new Scanner(System.in);

        for(int i =0;i<words.length;i++){
            System.out.printf("Q%d. %s의 뜻은 무엇일까요? ", i ,words[i][0]);
            String tmp = scanner.nextLine();
            if(tmp.equals(words[i][1])){
                System.out.println("정답입니다.");
            }else{
                System.out.printf("오답입니다. 정답은 %s",words[i][1] );
            }
            System.out.println();
        }

    }
}
