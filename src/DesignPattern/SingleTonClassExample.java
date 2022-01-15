package DesignPattern;

public class SingleTonClassExample {

    public static void main(String[] args) {

        // Instantiating Singleton class with variable X
        SingleTonClass x = SingleTonClass.getInstance();

        // Instantiating Singleton class with variable y
        SingleTonClass y = SingleTonClass.getInstance();

        // Instantiating Singleton class with variable z
        SingleTonClass z = SingleTonClass.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());
    }
}

class SingleTonClass {

    // Static variable reference of single_instance
    // of type Singleton
    private static SingleTonClass single_instance = new SingleTonClass();

    // Declaring a variable of type String
    public String s;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private void SingleTonClassMain() {
        s = "Hello I am a string part of Singleton class";
    }

    // Static method
    // Static method to create instance of Singleton class
    public static SingleTonClass getInstance() {
        if (single_instance == null)
            single_instance = new SingleTonClass();

        return single_instance;
    }

}
