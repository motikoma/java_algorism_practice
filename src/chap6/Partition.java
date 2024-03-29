package chap6;

public class Partition {

    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void partition(int[] a, int n){
        int pl = 0;
        int pr = n - 1;
        int x = a[n/2];

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if(pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);
    }
}
