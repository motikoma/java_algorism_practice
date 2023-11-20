package chap5;

public class Hanoi {
    static void move(int no, int x, int y){
        if(no > 1) move(no - 1, x, 6 - x - y);
        System.out.printf("円盤「%d」を％d軸から%d軸へ移動\n", no, x, y);
        if(no > 1) move(no - 1, 6 - x - y, y);
    }
}
