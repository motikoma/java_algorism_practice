package chap1;

import java.util.Scanner;

public class Practice_1_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // BAD: for文による繰り返しのたびにif文が実行される。i奇数判定が全部でn回実行される。
//        for (int i = 0; i < n; i++) {
//            if(i % 2 == 0)
//                System.out.print("+");
//            else
//                System.out.print("-");
//        }

        for (int i =  0; i < n / 2; i++){
            System.out.print("+-");
        }

        if(n % 2 != 0)
            System.out.print("+");
    }
}
