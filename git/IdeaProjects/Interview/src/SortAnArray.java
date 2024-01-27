import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int a[] = {2,4,1,5,3,9,6};
        int temp;

        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){ //2>1
                    temp = a[i]; //2
                    a[i] = a[j]; //1
                    a[j] = temp; //2
                }

            }
            System.out.print(a[i] + " ");
        }


       //Arrays.sort(a);
       /*for(int s : a){
           System.out.print(s + " ");
       }*/

       //System.out.println(Arrays.toString(a));


        //Arrays.stream(a).boxed().sorted().forEach(n -> System.out.print(n + " "));
    }
}
