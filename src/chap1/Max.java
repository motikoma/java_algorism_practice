package chap1;

import java.util.Scanner;

class Max {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("3つの整数の最大値を求めます。");
        System.out.print("aの値：");
        int a = stdIn.nextInt();
        System.out.print("bの値：");
        int b = stdIn.nextInt();
        System.out.print("cの値：");
        int c = stdIn.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("最大値は" + max + "です。");
    }

//    public void maxThree() {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        System.out.println(Math.max(a, Math.max(b, c)));
//    }
//
//    public void maxFour() {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//        System.out.println(Math.max(a, Math.max(b, Math.max(c, d))));
//    }
//
//    public void minThree() {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        System.out.println(Math.min(a, Math.min(b, c)));
//    }
}
