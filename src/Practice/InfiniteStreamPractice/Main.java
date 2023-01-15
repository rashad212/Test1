package Practice.InfiniteStreamPractice;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        List<People> list = List.of(
//                new People("Rashad", "Abuzarli",123),
//                new People("Ali","Aliyev",432),
//                new People("Veli", "Veliyev", 987));

//        list.stream().filter(x -> x.getId().equals(123)).forEach(System.out::println);

//        list.stream().map(x -> x.getId()<200).forEach(System.out::println);

        List<Student> someStudent = getSomeStudent();

        IntStream mapToInt = someStudent.stream().mapToInt(Student::getAge);
        IntSummaryStatistics summaryStatistics = mapToInt.summaryStatistics();

        double average = summaryStatistics.getAverage();
        int max = summaryStatistics.getMax();
        int min = summaryStatistics.getMin();

        System.out.println("AGE OF STUDENTS...");
        System.out.print("Average age of students: ");
        System.out.println(average);
        System.out.print("Maxim age of students: ");
        System.out.println(max);
        System.out.print("Minim age of students: ");
        System.out.println(min);
        System.out.println("---------");


        DoubleStream mapToDouble = someStudent.stream().mapToDouble(Student::getMathNote);
        DoubleSummaryStatistics summaryStatistics2 = mapToDouble.summaryStatistics();
        double average2 = summaryStatistics2.getAverage();
        double maxMathNote = summaryStatistics2.getMax();
        double minMathNote = summaryStatistics2.getMin();

        System.out.println("MATH NOTES...");
        System.out.print("Average MathNote of students: ");
        System.out.println(average2);
        System.out.print("Maxim MathNote of students: ");
        System.out.println(maxMathNote);
        System.out.print("Minim MathNote of students: ");
        System.out.println(minMathNote);
        System.out.println("---------");


        DoubleStream mapToDouble2 = someStudent.stream().mapToDouble(Student::getSportNote);
        DoubleSummaryStatistics summaryStatistics3 = mapToDouble2.summaryStatistics();
        double average3 = summaryStatistics3.getAverage();
        double maxSportNote = summaryStatistics3.getMax();
        double minSportNote = summaryStatistics3.getMin();

        System.out.println("SPORT NOTES...");
        System.out.print("Average SportNote of students: ");
        System.out.println(average3);
        System.out.print("Maxim SportNote of students: ");
        System.out.println(maxSportNote);
        System.out.print("Minim SportNote of students: ");
        System.out.println(minSportNote);




    }
    private static List<Student> getSomeStudent (){
        Student p1 = new Student("Alex", "Lee", 11,38.5,40.0);
        Student p2 = new Student("David", "Lowlier", 21,15.2,21.0);
        Student p3 = new Student("Paul", "Walker", 17,30.8,30.0);
        Student p4 = new Student("Tom", "Iris", 13,10.0,39.8);
        Student p5 = new Student("Madison", "Rae", 25,48.5,25.3);
        Student p6 = new Student("Alexa", "Hoffman", 13,50.0,45.5);
        Student p7 = new Student("Conor", "McGregor", 23,5.9,18.3);
        Student p8 = new Student("Habib", "Magomed", 18,28.9,49.8);

        List<Student> students = new ArrayList<Student>();
        students.add(p1);
        students.add(p2);
        students.add(p3);
        students.add(p4);
        students.add(p5);
        students.add(p6);
        students.add(p7);
        students.add(p8);
        return students;
    }
}
