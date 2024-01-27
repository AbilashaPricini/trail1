public class AddArray {

    static int[] arr = {12,2,30,13,5};

    public static void main(String[] args) {
        System.out.println(sumOfDigits(arr.length-1));
    }

    private static int sumOfDigits(int n) {

        if(n==0)
            return arr[0];

        return arr[n] + sumOfDigits(n-1);
    }


}
