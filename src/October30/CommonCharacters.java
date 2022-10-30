package October30;

public class CommonCharacters {

        public static void main(String[] args) {

            String [] words = new String[]{"Rashad","Farid","Chingiz"};
            String [] character = {};
            System.out.println(common(words,character));

        }
        static boolean common(String[] words, String[] character) {

            for(int i = 0; i < words[0].length(); i++){
                String ch = String.valueOf(words[0].charAt(i));
                boolean isTrue = false;
                for(int j = 1; j < words.length; j++){
                    if(words[j].contains(ch)){
                        words[j] = words[j].replaceFirst(ch,"");
                        isTrue = true;
                    }else{
                        isTrue = false;
                        break;
                    }
                }
            }

   return true; }
}



