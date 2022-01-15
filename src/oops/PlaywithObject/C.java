package oops.PlaywithObject;

class A {
    void m1() {
        System.out.println("Class A");
    }
}

class B extends A {
    void m1() {
        System.out.println("Class B");
    }
}

class C extends B {
    void m1() {
        System.out.println("Class  C");
    }

    public static void main(String[] args) {
//        A a = new B();
//        C c = (C) a;
//        c.m1();

        A b= new C();
        b.m1();
    }

}
