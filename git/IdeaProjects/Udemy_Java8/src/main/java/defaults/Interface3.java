package defaults;

public interface Interface3 extends Interface2{
    default void methodC(){
        System.out.println("Inside method C");
    }

    default void methodB(){
        System.out.println("Inside method B" + Interface3.class);
    }
}
