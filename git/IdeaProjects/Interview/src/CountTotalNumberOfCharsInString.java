public class CountTotalNumberOfCharsInString {
    public static void main(String[] args) {
        String str = "AbilashaS";
        char ch, newCh;
        int count = 0;

        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            newCh = ch;
            //if
            count++;
        }
        System.out.println(count);
    }
}
