import java.util.stream.Stream;

public class Asdfg {
    public static void main(String[] args)
    {
        // Creating a Stream of Strings using of() method
        // by creating object of Stream of string type
        Stream<String> stream
                = Stream.of("Geeks", "fOr", "GEEKSQUIZ",
                "GeeksforGeeks", "CSe");

        // Using Stream noneMatch(Predicate predicate)
        // and storing the boolean value
        boolean answer = stream.noneMatch(
                str
                        -> Character.isUpperCase(str.charAt(1))
                        && Character.isLowerCase(str.charAt(2))
                        && str.charAt(0) == 'f');

        // Printing the above boolean value on console
        System.out.println(answer);
    }
}
