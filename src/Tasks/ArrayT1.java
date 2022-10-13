package Tasks;

import java.util.Scanner;

public class ArrayT1 {
    public static int main(int[] args) {

//        Scanner sc= new Scanner (System.in);
//        int [] a = {8,5,7,9};
//        for (int i=0; i<a.length; i++){
// //           System.out.println(i);
//        }
//        Arrays.sort(a);
//        for (int i1 : a) {
//            System.out.println("-   " + a[sc.nextInt()]);
//        }

            Scanner sc = new Scanner(System.in);
            sc.nextInt();
            int[] eded = new int[5];

            eded[0] = 3;
            eded[1] = 6;
            eded[2] = 7;
            eded[3] = 8;

            int l = 0;
            int r = eded.length - 1;

        int target ;
            int midIndex;
            while (l <= r) {
                midIndex = l + (r - l) / 2;
                if (eded[midIndex] < target) l = midIndex + 1;
                else if (eded[midIndex] > target) r = midIndex - 1;
                else return midIndex;
            }
            return l;
        }
    }
}