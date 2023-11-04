package chap3.Practice;

import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData>{
            public int compare(PhyscData d1, PhyscData d2){
                return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("赤坂忠雄", 162, 0.3),
                new PhyscData("長浜良一", 168, 0.4),
                new PhyscData("加藤富明", 173, 0.7),
                new PhyscData("松富明雄", 169, 0.8),
        };
        System.out.print("何cmの人を探しますか：");
        int height = stdIn.nextInt();
        int idx = java.util.Arrays.binarySearch(
                x,
                new PhyscData("", height, 0.0),
                PhyscData.HEIGHT_ORDER
        );
        if(idx < 0) System.out.print("その値の要素は存在しません。");
        else System.out.print("その値はx[" + idx + "]にあります。");
    }
}
