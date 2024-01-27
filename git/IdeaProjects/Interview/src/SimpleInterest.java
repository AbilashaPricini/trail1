import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter the values,");
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        System.out.println("Principle - " + p);
        int r = s.nextInt();
        System.out.println("Rate - " + r);
        int t = s.nextInt();
        System.out.println("Time - " + t);

        int si = (p * r * t) / 100;

        System.out.println(si);
    }
}
