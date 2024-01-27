package leetcode.com;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        char rev = 0;
           for(int i=s.length-1; i>=0; i--){
               rev = (char) (rev  + s[i]);
           }
           System.out.println(rev);

    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(new char[] {'h','e','l','l','o'});

    }
}
