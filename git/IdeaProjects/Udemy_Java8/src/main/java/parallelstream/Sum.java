package parallelstream;

public class Sum {
    private int total;
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public  void perfromSum(int input){
        total += input;
    }

}
