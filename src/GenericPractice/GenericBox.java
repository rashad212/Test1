package GenericPractice;

public class GenericBox <A>  {

    A box;

    GenericBox(A box){
        this.box = box;
    }
    public void print(){
        System.out.println(box);
    }
}