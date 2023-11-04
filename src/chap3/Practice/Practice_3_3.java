package chap3.Practice;

import java.util.Scanner;

public class Practice_3_3 {

    static int searchIdx(int[] a, int n, int key, int[] idx){

        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == key){
                idx[count] = i;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        System.out.print("探す値：");
        int key = stdIn.nextInt();

        int[] idx = new int[num];
        System.out.print(searchIdx(x, num, key, idx));
    }
}
