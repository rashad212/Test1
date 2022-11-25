package TelebeClass;

public class Telebeler {
    public static void main(String[] args) {
        Telebe[] arr= new Telebe[4];

        Telebe t1=new Telebe();
        t1.name="Rashad";
        t1.surname="Abuzarli";
        t1.age=23;
        arr[0]=t1;

        Telebe t2=new Telebe();
        t2.name="Arzu";
        t2.surname="Nagizade";
        t2.age=25;
        arr[1]=t2;

        Telebe t3=new Telebe();
        t3.name="Zeyneb";
        t3.surname="Eliyeva";
        t3.age=21;
        arr[2]=t3;


        Telebe[] array =new Telebe[]{t1,t2,t3};
        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j].age > array[j].age){
                    temp = array[j].age;
                    array[j].age = array[j+1].age;
                    array[j+1].age = temp;

                }
            }
        }
        for (Telebe telebe: array) {
            System.out.println(telebe.name +" "+ telebe.age);
        }

    }
}