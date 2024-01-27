public class MathRandom_RandomPassword {
    public static void main(String[] args) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
        int passwordLength = 10;
        char [] password = new char[passwordLength];

        for(int i=0; i<passwordLength; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            /*System.out.println("i : " + i);
            System.out.println("random value : " + Math.random());
            System.out.println("passwordSet length : " + passwordSet.length());
            System.out.println("rand : " + rand);*/
                         //0.9 * 43 = 38
            password[i] = passwordSet.charAt(rand); // i=0 -> charAt(38)= #
            System.out.print(password[i]);
        }

        System.out.println("\nnew password : " + password);
    }
}
