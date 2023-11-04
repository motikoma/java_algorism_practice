package chap3;

public class BinSearch {
    static int binSearch(int[] a, int n, int key){
        int pl = 0;
        int pr = n - 1;

        while(pl <= pr){
            int pc = (pl + pr) / 2;
            if(a[pc] == key) return pc;
            else if(a[pc] < key) pl = pc + 1;
            else pr = pc - 1;
        };

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 10};
        int idx = binSearch(a, a.length, 11);
        if (idx == -1) System.out.println("その値の要素は存在しません。");
        else System.out.println("その値はx[" + idx + "]にあります。");
    }
}
