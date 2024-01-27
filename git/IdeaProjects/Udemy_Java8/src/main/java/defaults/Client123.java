package defaults;

public class Client123 implements Interface1, Interface2, Interface3 {
    public void methodB(){
        System.out.println("Inside method B" + Client123.class);
    }
    public static void main(String[] args) {
        Client123 client = new Client123();

        client.methodA();
        client.methodB();
        client.methodC();
    }
}
