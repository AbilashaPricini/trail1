public class FindMaximumElementInArray {
    public static void main(String[] args) {
        int a[] = {3, 4, 5, 100, 9, 10, 33, 55, 1, 89, 187};
        int max = a[0];

        for(int i=0; i<a.length; i++){
            if(a[i]>max){ //3>3, 4>3, 5>4, 100>5
                max = a[i]; //4, 5, 100,
                System.out.println(max);
            }
        }
        System.out.println(max);



        /*for (int i = 0; i < a.length; i++) { //3
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    max = a[i];
                    System.out.println("Max num : " + max);
                }else{
                    min = a[j];
                    System.out.println("Min num : " + min);
                }
            }
        }
        System.out.println("Final Max num : " + max);*/
    }
}
