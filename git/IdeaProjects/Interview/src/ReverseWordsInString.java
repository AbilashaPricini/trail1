import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInString {
    public static void main(String[] args) {
          System.out.println(reverseWords_StringBuilder("The sky is blue"));
    }

    public static String reverseWords(String s){
        String[] array = s.split(" ");
        String s1 = "";

        for(int i=array.length-1; i>=0; i--){
            s1 = s1 + array[i] + " ";
        }
        return s1;
    }

    public static String reverseWordsJava8(String s){
        String[] array = s.split(" ");
        String str = Arrays.stream(array).sorted(Collections.reverseOrder()).toString();
        return str;
    }

    public static String reverseWords_StringBuilder(String s){
        String s1 = new StringBuilder(s).reverse().toString();
        return s1;
    }
}
