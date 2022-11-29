package Jdm;

public class CarFactory {
//    private static Object Engine;
//    private static Object Model;

    public CarFactory() {

    }

    public static void main(String[] args) {

        Engine nissanEng = new Engine("doch", "2.6", 200, 300);
        Transmission nissanTransmission = new Transmission("manual");

        JdmCars nissan1 = new Nissan("R34 GT-R", nissanTransmission, nissanEng, new Model("Skyline"));
        JdmCars subaru = new Subaru("WRX STI", nissanTransmission, nissanEng, new Model("WRX STI"));
        JdmCars[] jdmArr = new JdmCars[2];
        jdmArr[0] = nissan1;
        jdmArr[1] = subaru;



//        String [] cars = new String[2];
//        JdmCars cars2 = new JdmCars();

        for (int i = 0; i < jdmArr.length; i++)
            System.out.println(jdmArr[i]);

//        JdmCars car1 = new Nissan("R34 GT-R", "RB26DETT", "6 gear manual", new Engine("Twinturbo", "2.6 L", 276, 353), new Model("Skyline"));

//        System.out.println(car2);
    }
}

