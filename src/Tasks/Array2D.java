package Tasks;

public class Array2D {
       public static void main(String[] args) {

        int[][] arr = new int[][]{
                {7, 3, 5},
                {2, 4, 6},
                {7, 8, 9} };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int dioqonal = arr[0][0] + arr[1][1] + arr[2][2] + arr[0][2] + arr[2][0];
        System.out.println("2D massivin diogonallarinin cemi buna beraberdir: ");
        System.out.println(" " + dioqonal);

//    public int dioganalSum(int[][] matris) {
//
//        int sum = 0;
//        int n = matris.length;
//
//        for (int i = 0; i < n; i++) {
//            sum += matris[i][i];
//            sum += matris[i][n - i - 1];
//        }
//        if (n%2 == 1){
//            sum-= matris[n/2][n/2];
//        }
//        return sum;
    }
}
