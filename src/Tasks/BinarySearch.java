package Tasks;


import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
//
//        int[] num = {12, 22, 34, 56, 63, 67, 90,};
//        int target =65;
//
//        int index = binarySearch(num, 0, num.length-1, target);
//
//              System.out.println(index);
//
//            if (target < num.length - 1) {
//            System.out.println(index);
//        }
//        else System.out.println((-1 * index) - 1);

        int [] numbers = new int[] {3,6,7,1,23,56,43,67,49};
        int target = 23;

        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            if(a == target) {
                System.out.println(i);
            }
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int position = Arrays.binarySearch(numbers, target);

        System.out.println(position);

        if (target < numbers.length) {
            System.out.println((-1 * position) - 1);
        }
    }
}
