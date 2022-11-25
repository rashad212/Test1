package Figure;

public class TriangleFactory {
    public static void main(String[] args) {

        Triangle triangle = getObj(4, 4, 4);

        System.out.println(triangle);

    }

    public static Triangle getObj(int a, int b, int c) {
        if (a == b && a == c) {
            return new BeraberTerefli(a, b, c);
        } else if (a == b || a == c || b == c) {
            return new BeraberYanli(a, b, c);
        } else if (((a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c == b * b))) {
            return new Duzbucaqli3bucaq(a, b, c) {
            };
        }
        return null;

    }
}
