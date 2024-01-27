public class BooleanToStringConversion {
    public static void main(String[] args) {
        boolean b = true;

        String s = String.valueOf(b);
        System.out.println(s);

        String s1 = "" + b;
        System.out.println(s1);

        String s2 = Boolean.toString(b);
        System.out.println(s2);
    }
}
