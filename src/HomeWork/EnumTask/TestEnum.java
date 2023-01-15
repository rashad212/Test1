package HomeWork.EnumTask;

import java.util.Scanner;

public class TestEnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cevirmek istediyiniz ayi secin: ");
        String input = sc.nextLine();
        System.out.println(Months.values().length);

    }
    static void ayRus(Months ay) {
        System.out.println(ay + " " + Months.JANUARY.getRu());

    }
}
