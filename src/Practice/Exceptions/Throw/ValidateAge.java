package Practice.Exceptions.Throw;

public class ValidateAge {
    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge (-2);
    }

    private static void validateAge(int age) throws AgeLessThanZeroException {

        if (age < 0) {
            throw new AgeLessThanZeroException("Oh  no! age cannot be negative");
        }
    }
}
