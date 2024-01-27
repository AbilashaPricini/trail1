public class ListOfPrimeNumbers {
    public static void main(String args[]){
        int count;
        int c = 0;

        for(int i=2; i<=100; i++){  //i=7
            count = 0;
            for(int j=2; j<i/2; j++){
                if(i%j == 0) {  // 9%3==0
                    count++; //count = 1
                    break;
                }
            }

            if(count == 0 ){
                c++;
                System.out.print( i + " ");

            }

           // System.out.println(c);


        }
        System.out.println( "\n" + c);
    }
}
