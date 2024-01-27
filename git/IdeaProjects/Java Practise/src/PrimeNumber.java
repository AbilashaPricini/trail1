public class PrimeNumber {
    public static void main(String args[]){
        checkWhetherPrimeOrNot(17); //wrong
        checkPrimeOrNot(36); //correct
    }

    public static void checkWhetherPrimeOrNot(int num){
        boolean isprime = true;
        if(num <= 0){
            isprime = false;
        }
        if(num == 2){
            isprime = true;
        }
        if(num%2 != 0){
            isprime = true;
        }else{
            isprime = false;
        }

        if(isprime){
            System.out.println(num + " is prime number");
        }
        else{
            System.out.println(num + " is not prime number");
        }
    }

    public static void checkPrimeOrNot(int num){ //17
        boolean isPrime = true;

        for(int i=2; i<Math.sqrt(num); i++){ //i=2
            if(num%i == 0) { //17%2 .....17%16 ,,,15%3=0
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(num + " is prime number(2)");
        }else{
            System.out.println(num + " is not prime number(2)");
        }
    }
}
