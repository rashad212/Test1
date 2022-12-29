package Test.NestedClass;

public class LocalClass {
    public void run(){

        class Local {
            int a;

            Local (int a){
                this.a=a;
            }
            public void print(){
                System.out.println(a);
            }
        }
        Local l = new Local(5);
        l.print();
    }
}
