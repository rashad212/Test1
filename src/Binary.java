import java.util.Scanner;

public class Binary {

  public static void main (String[] args){

      int number, i=0;
      int binary[]= new int[100];
      Scanner user_input=new Scanner(System.in);
      System.out.println("Onluq eded daxil edin:");
      number= user_input.nextInt();

      while (number!=0) {

          binary[i] = number % 2;
          number = number / 2;
          i++;
      }
      System.out.print("Binary cavabi:");
      for(int j=i-1; j>=0;j--)

      System.out.print(""+binary[j]);


  }

}
