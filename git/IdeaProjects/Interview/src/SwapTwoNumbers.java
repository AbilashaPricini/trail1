public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;

        a = a + b; //30
        b = a - b; //10
        a = a - b; //20

        System.out.println( a + " " + b);

        /*if third variable declared ---->
        c = a; //10
        a = b; //20
        b = c; //10*/
    }
}
