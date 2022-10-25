package October23;

public class LastWordLenght {
    public static void main(String[] args) {

        String text = "hello qwer    ";
        int sonuncuIndex = text.length() - 1;

        while (sonuncuIndex >= 0 && text.charAt(sonuncuIndex) == ' '){
            sonuncuIndex--;
        }
        int sonIndex=sonuncuIndex+1;


        while (sonuncuIndex >= 0 && text.charAt(sonuncuIndex) != ' '){
            sonuncuIndex--;

        }
        int ilkIndex=sonuncuIndex+1;

        System.out.println(text.substring(ilkIndex,sonIndex));

    }
}
