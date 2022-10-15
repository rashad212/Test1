package Tasks;

import static java.util.Arrays.binarySearch;

public class Matrix2D {
    public static void main(String[] args) {

        int[] arr = {12, 22, 34, 56, 63, 67, 90,};
        int target =45;
        int index = binarySearch(arr, 0, arr.length-1, target);

            if (target <= arr.length - 1) {
            System.out.println(index);
        }
        else System.out.println((-1 * index) - 1);

    }
}
