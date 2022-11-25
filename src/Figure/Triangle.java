package Figure;

public abstract class Triangle extends Figure {

   public int a;
   public int b;
   public int c;

   @Override
   public String toString() {
      return "Triangle{" +
              "a=" + a +
              ", b=" + b +
              ", c=" + c +
              '}';
   }

   public Triangle(int a, int b, int c) {
      this.a = a;
      this.b = b;
      this.c = c;


   }
}
