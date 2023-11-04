package chap3;

import java.util.Scanner;

// 線形探索：番兵法
public class SeqSearchSen {

    // 配列aの先頭n個の要素からkeyと一致する要素を線形探索
    static int seqSearchSen (int[] a, int n, int key) {
        a[n] = key; // 最後に番兵を追加

        for(int i = 0; i < n; i++){
            if(a[i] == key) return n;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++){
            System.out.println("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        System.out.print("探す値：");
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if(idx == -1){
            System.out.println("その値の要素は存在しません。");
        } else {
            System.out.println("その値はx[" + idx + "]にあります。");
        }
    }
}
