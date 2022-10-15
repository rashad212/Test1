package Tasks;

import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {12, 22, 34, 56, 63, 67, 90,};
        int target =65;
        int index = binarySearch(arr, 0, arr.length-1, target);

              System.out.println(index);

            if (target < arr.length - 1) {
            System.out.println(index);
        }
        else System.out.println((-1 * index) - 1);
    }
}
