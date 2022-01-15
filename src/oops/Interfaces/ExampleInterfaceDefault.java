package oops.Interfaces;

//Tricky
interface interf {
    default void m1() {
        System.out.println("Hello Interface0");
    }
}

interface interf1 {
    default void m1() {
        System.out.println("Hello Interface1");
    }

    static void s1() {
        System.out.println("s1 running");
    }


}

public class ExampleInterfaceDefault implements interf, interf1 {

    // Implementation always overrides the default implementation
//    public void m1() {
//        System.out.println("Hi Interface2");
//    }

//    static void s1() {
//        System.out.println("s2 running");
//    }

    public static void main(String[] args) {
        ExampleInterfaceDefault t = new ExampleInterfaceDefault();
        t.m1();
      //  t.s1();
        interf1.s1();

    }

    @Override
    public void m1() {
        interf1.super.m1();
    }
}
