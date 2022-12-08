import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();

        a.add("asd");
        a.add("bsd");

    ArrayList<String> b = new ArrayList<>();
    b.add("zxc");
    b.add("vxc");
    b.add("vxc");


    ArrayList<String> ab = new ArrayList<>();
        ab.addAll(b);
        System.out.println(b.remove(1));
        System.out.println(b.set(1,"xxx"));
        System.out.println(b);
    }
}









