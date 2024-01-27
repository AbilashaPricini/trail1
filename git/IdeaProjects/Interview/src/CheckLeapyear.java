public class CheckLeapyear {
    public static void main(String[] args) {

        int year = 2016;


        if(year%4 == 0){
            System.out.println(year + " - Leap year");
        }else{
            System.out.println(year + " - not Leap year");
        }
    }
}
