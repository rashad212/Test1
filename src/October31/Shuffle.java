package October31;

public class Shuffle {

    public Shuffle(){
//        a=5;

    }
    {
//        a=5;

    }

    static {
       a=6 ;


    }
    static Integer a;



    public static void main(String[] args) {

         String a ;

        int[] index = {2, 1, 0, 7, 4, 5, 6, 3};
        a="leetcode";
//        a="fdv";
//     /**/   a="lee"+"asd";
        int b = a.length();
        char[] z = new char[b];

        for (int i = 0; i < b; i++) {
            z[index[i]] = a.charAt(i);
        }
        String result = "";
        for (char e : z) {
            result += e;

        }
        System.out.println(result);
    }
}
