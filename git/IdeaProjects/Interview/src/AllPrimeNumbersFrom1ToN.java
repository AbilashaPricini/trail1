public class AllPrimeNumbersFrom1ToN {
    public static void main(String[] args) {
        int n = 20, chk, count = 0;

        for(int i=2; i<=n; i++){
            chk = 0;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    chk++;
                    break;
                }
            }
            if(chk == 0){
                count ++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nCount - " + count);




    }
}
