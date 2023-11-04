package chap3.Practice;

import java.util.Scanner;

public class Practice_3_5 {

    static int binSearchX(int[] a, int n, int key){
        int pl = 0;
        int pr = n - 1;

        while(pl <= pr){
            int pc = (pl + pr) / 2;
            if(a[pc] == key){
                while(pc > 0 && a[pc - 1] == key) pc--;
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pl = pc - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("昇順に入力してください");

        System.out.println("x[0]:");
        x[0] = stdIn.nextInt();

        for(int i = 1; i < num; i++){
            while(x[i] < x[i-1]) {
                System.out.println("x[" + i + "]:");
                x[i] = stdIn.nextInt();
            }
        }

        System.out.println("探す値：");
        int ky = stdIn.nextInt();

        int idx = binSearchX(x, num, ky);

        if(idx == -1) System.out.println("その値の要素は存在しません。");
        else System.out.println("その値はx[" + idx + "]にあります。");
    }
}
