package Exceptions.TryCatch;

public class Student {

    public static Student find(String id) throws StudentException {

        if (id.equals("212")) {
            return new Student();
        } else {
            throw new StudentException("Telebe tapilmadi !");
        }
    }
}
