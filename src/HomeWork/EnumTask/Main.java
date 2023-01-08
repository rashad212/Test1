package HomeWork.EnumTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ay daxil edin: ");
        String input = sc.nextLine();
        Months allMounth[] = Months.values();
        for (Months z : allMounth)


            switch (z) {
                case JANUARY -> {
                    System.out.println(Months.JANUARY.getA() + " " + Months.JANUARY.getT() + " " + Months.JANUARY.getR() + " " + Months.JANUARY.getX());
                }
                case FEBRUARY -> {
                    System.out.println(Months.FEBRUARY.getA() + " " + Months.FEBRUARY.getT() + " " + Months.FEBRUARY.getR() + " " + Months.FEBRUARY.getX());
                }
                case MARCH -> {
                    System.out.println(Months.MARCH.getA() + " " + Months.MARCH.getT() + " " + Months.MARCH.getR() + " " + Months.MARCH.getX());
                }
                case APRIL -> {
                    System.out.println(Months.APRIL.getA() + " " + Months.APRIL.getT() + " " + Months.APRIL.getR() + " " + Months.APRIL.getX());
                }
                case MAY -> {
                    System.out.println(Months.MAY.getA() + " " + Months.MAY.getT() + " " + Months.MAY.getR() + " " + Months.MAY.getX());
                }
                case JUNE -> {
                    System.out.println(Months.JUNE.getA() + " " + Months.JUNE.getT() + " " + Months.JUNE.getR() + " " + Months.JUNE.getX());
                }
                case JULY -> {
                    System.out.println(Months.JULY.getA() + " " + Months.JULY.getT() + " " + Months.JULY.getR() + " " + Months.JULY.getX());
                }
                case AUGUST -> {
                    System.out.println(Months.AUGUST.getA() + " " + Months.AUGUST.getT() + " " + Months.AUGUST.getR() + " " + Months.AUGUST.getX());
                }
                case SEPTEMBER -> {
                    System.out.println(Months.SEPTEMBER.getA() + " " + Months.SEPTEMBER.getT() + " " + Months.SEPTEMBER.getR() + " " + Months.SEPTEMBER.getX());
                }
                case OCTOBER -> {
                    System.out.println(Months.OCTOBER.getA() + " " + Months.OCTOBER.getT() + " " + Months.OCTOBER.getR() + " " + Months.OCTOBER.getX());
                }
                case NOVEMBER -> {
                    System.out.println(Months.NOVEMBER.getA() + " " + Months.NOVEMBER.getT() + " " + Months.NOVEMBER.getR() + " " + Months.NOVEMBER.getX());
                }
                case DECEMBER -> {
                    System.out.println(Months.DECEMBER.getA() + " " + Months.DECEMBER.getT() + " " + Months.DECEMBER.getR() + " " + Months.DECEMBER.getX());
                }

            }
        nese(Months.OCTOBER);
    }
    static void nese(Months ay){
        System.out.println(ay.getX());
    }


}
