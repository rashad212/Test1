package HomeWork.Task2;

import HomeWork.EnumTask.Months;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ay daxil edin: ");
        String input = sc.nextLine();
        order(Months.OCTOBER);
        rus(Months.JANUARY);

        }


    static void order(Months ay){
        System.out.println(ay.getX());
    }

    static void rus(Months ay){
        System.out.println(ay.getRu());
    }
    }
