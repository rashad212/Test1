package October21;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array's lenght: ");
        int n = sc.nextInt();
        int m = n;
        int[][] array = new int[n][m];
        int a1 = 0;
        System.out.println("Enter array's elements: ");
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                array[x][y] = sc.nextInt();
                System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
                ;
                for (int a = array.length - 1, b = 0; a >= 0 && b < array.length; a--, b++) {
                    a1 += array[a][b];
                }
                if (n % 2 != 0) {
                    a1 -= array[n / 2][n / 2];
                }
                System.out.println("The sum of the diagonals: ");
                System.out.println(a1);}
        }
    }
}

