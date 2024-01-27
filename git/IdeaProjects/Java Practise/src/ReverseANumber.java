public class ReverseANumber {
    public static void main(String args[]){
        int num = 23945645;
        int rev=0,rm;

        for(; num!=0; num=num/10){
            rm = num % 10;
            rev = rev*10 + rm;
            System.out.print(rm);

        }

        /*while(num != 0){
            rm = num % 10; //5 3
            num = num / 10; //2394564 2
            System.out.print(rm + " ");
        }*/
    }
}
