public class RandomThreeDigit {
    public static void main(String[] args) {
        int threeDigit = (int) (Math.random() * Math.pow(10, 15));
        System.out.println(Math.random() + " " + Math.pow(10, 12) + " " + "ans : " + threeDigit);
    }
}
