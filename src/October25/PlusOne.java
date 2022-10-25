package October25;

import java.util.Random;

public class PlusOne {
    public static void main(String[] args) {
//        int cem =0;
//    Random a = new Random();
//    int i = a.nextInt(1,9);
//        int j = a.nextInt(1,9);
//            int k = a.nextInt(1,9);
//    int[] t = {i,j,k};
//        System.out.print(i);
//        System.out.print(j);
//        System.out.print(k);
//        System.out.println(" ");
//        cem += 100 * i + 10 * j + k +1;
//        System.out.println(cem);
//        int[] y = {i, j, k + 1};
//        int z;
//        for (z = 0; z < y.length; z++) {
//            System.out.print(y[z]);
//            System.out.print(" ,");
//        }
// TEST ...................................................................
//        int [] arr = {3,4,1};
//
//        for (int i= arr.length-1; i<9;i++){
//
//            String s1 = String.valueOf(arr[0]);
//            String s2 = String.valueOf(arr[1]);
//            String s3 = String.valueOf(arr[2]);
//            int b = Integer.parseInt((s1+s2+s3));
//            System.out.println(b+1);  }

        //.............................................................................

        int[] num= {1,2,3};
            int n = num.length;
            for(int i =n-1;i>=0;i--){
                if(num[i]<=9){
                    num[i]++;
                    System.out.println(num.length);
                }

                num[i]=0;

            }
            int[] arr = new int[n+1];
            arr[0]=1;
        System.out.println(arr.length);


     }
    }
