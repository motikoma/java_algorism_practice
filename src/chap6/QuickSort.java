package chap6;

public class QuickSort {

    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void quickSort(int[] a, int left, int right){
        int pl = left;
        int pr = right;
        int x = a[(pl + pr) / 2];

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if(pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if(left < pr) quickSort(a, left, pr);
        if(pl < right) quickSort(a, pl, right);
    }

    static int sort3elem(int[] x, int a, int b, int c){
        if(x[b] < x[a]) swap(x, a, b);
        if(x[c] < x[b]) swap(x, b, c);
        if(x[b] < x[a]) swap(x, a, b);
        return b;
    }

    static void quickSort3(int[] a, int left, int right){
        int pl = left;
        int pr = right;
        int m = sort3elem(a, pl, (pl + pr) / 2, pr);
        int x = a[m];

        swap(a, m, right - 1);
        pl++;
        pr -= 2;

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if(pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if(left < pr) quickSort(a, left, pr);
        if(pl < right) quickSort(a, pl, right);
    }
}
