import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
      String s = "hello qtwysu wsys";
      int i =  s.length() -1, length = 0;

      while (i>=0 && s.charAt(i) == ' ');

      while (i>=0 && s.charAt(i) != ' ') {
          length++;
          i--;
      }
        System.out.println(length);
    }
}
