package leetcode.com;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        //x = 12321
        int rem = 0, quot, res = 0;


        while (x > 0) {
            rem = x % 10; // 1
            quot = x / 10; //1232
            rem = quot * 10 + rem; //12321
        }

        if (rem == x) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]){
        System.out.println(isPalindrome(12321));
    }
}
