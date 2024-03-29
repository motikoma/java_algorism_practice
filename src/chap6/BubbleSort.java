package chap6;

public class BubbleSort {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n){
        for (int i = 0; i < n - 1; i++){
            int exchange = 0;
            for (int j = n - 1; j > i; j--){
                if(a[j - 1] > a[j]){
                    swap(a, j - 1, j);
                    exchange++;
                }
            }
            if(exchange == 0) break;
        }
    }

    static void bubbleSort2(int[] a, int n){
        int k = 0;
        while(k < n - 1){
            int last = n - 1;
            for(int j = n - 1; j > k; j--){
                if(a[j - 1] > a[j]){
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            k = last;
        }
    }
}
