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
                    System.out.println(Months.JANUARY.getAz() + " " + Months.JANUARY.getTr() + " " + Months.JANUARY.getRu() + " " + Months.JANUARY.getX());
                }
                case FEBRUARY -> {
                    System.out.println(Months.FEBRUARY.getAz() + " " + Months.FEBRUARY.getTr() + " " + Months.FEBRUARY.getRu() + " " + Months.FEBRUARY.getX());
                }
                case MARCH -> {
                    System.out.println(Months.MARCH.getAz() + " " + Months.MARCH.getTr() + " " + Months.MARCH.getRu() + " " + Months.MARCH.getX());
                }
                case APRIL -> {
                    System.out.println(Months.APRIL.getAz() + " " + Months.APRIL.getTr() + " " + Months.APRIL.getRu() + " " + Months.APRIL.getX());
                }
                case MAY -> {
                    System.out.println(Months.MAY.getAz() + " " + Months.MAY.getTr() + " " + Months.MAY.getRu() + " " + Months.MAY.getX());
                }
                case JUNE -> {
                    System.out.println(Months.JUNE.getAz() + " " + Months.JUNE.getTr() + " " + Months.JUNE.getRu() + " " + Months.JUNE.getX());
                }
                case JULY -> {
                    System.out.println(Months.JULY.getAz() + " " + Months.JULY.getTr() + " " + Months.JULY.getRu() + " " + Months.JULY.getX());
                }
                case AUGUST -> {
                    System.out.println(Months.AUGUST.getAz() + " " + Months.AUGUST.getTr() + " " + Months.AUGUST.getRu() + " " + Months.AUGUST.getX());
                }
                case SEPTEMBER -> {
                    System.out.println(Months.SEPTEMBER.getAz() + " " + Months.SEPTEMBER.getTr() + " " + Months.SEPTEMBER.getRu() + " " + Months.SEPTEMBER.getX());
                }
                case OCTOBER -> {
                    System.out.println(Months.OCTOBER.getAz() + " " + Months.OCTOBER.getTr() + " " + Months.OCTOBER.getRu() + " " + Months.OCTOBER.getX());
                }
                case NOVEMBER -> {
                    System.out.println(Months.NOVEMBER.getAz() + " " + Months.NOVEMBER.getTr() + " " + Months.NOVEMBER.getRu() + " " + Months.NOVEMBER.getX());
                }
                case DECEMBER -> {
                    System.out.println(Months.DECEMBER.getAz() + " " + Months.DECEMBER.getTr() + " " + Months.DECEMBER.getRu() + " " + Months.DECEMBER.getX());
                }

            }
        nese(Months.OCTOBER);
    }
    static void nese(Months ay){
        System.out.println(ay.getX());
    }


}
