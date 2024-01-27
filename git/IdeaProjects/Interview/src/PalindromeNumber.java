/*int num = 12321;
           int sum = 0;
           int d, mod;
           psvm(String args[]){

               for(int i = 0; i < 5; i++){
                   d = num/10; // 1
                   mod = num % 10; // 1232
                   sum = sum + d;

               }*/
public class PalindromeNumber {
    public static void main(String args[]) {
        int num = 12321;
        int temp = num; //12321
        int  r, sum=0;


        while(num>0){
            r = num % 10; //1
            sum = (sum * 10) + r; // 0+1=1
            //System.out.println(sum);
            num = num/10;
            //System.out.println(num);
        }

        //System.out.println(sum);
        if(temp == sum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }


    }

}
