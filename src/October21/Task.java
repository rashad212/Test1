package October21;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.println(returnWinner());
    }

    static int returnWinner() {
        int adam, input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Adam sayi daxil edin:");
        adam = sc.nextInt();
        System.out.println("iteration daxil edin:");
        input = sc.nextInt();

        int[] members = new int[adam];
        for (int i = 0; i < members.length; i++) {
            members[i] = i + 1;
        }
        for (int a = 0; a < members.length; a++) {
            System.out.println(members[a]++);

        }

        return 0;
    }
}
