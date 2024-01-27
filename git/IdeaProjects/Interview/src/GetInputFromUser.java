import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String[] args) {
        System.out.println("Enter the input : ");
        Scanner input = new Scanner(System.in);
        int output = input.nextInt();

        System.out.println(output);
    }
}
