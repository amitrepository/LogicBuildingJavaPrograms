package DesignPattern;

public class SingleTonClass2 {
    //egar instialization - defining @ same time.
    private static SingleTonClass2 singleTonClass2 = new SingleTonClass2();

    private SingleTonClass2() {
    }

    public static SingleTonClass2 getInstance() {
        return singleTonClass2;
    }
}

class SingleTonClassLazy2 {
    //Lazy instialization - defining @ Later time.
    private static SingleTonClassLazy2 SingleTonClassLazy2;

    private SingleTonClassLazy2() {
    }

    public static SingleTonClassLazy2 getInstance() {
        if (SingleTonClassLazy2 == null) {
            SingleTonClassLazy2 = new SingleTonClassLazy2();
        }
        return SingleTonClassLazy2;
    }
}

class SingleTonClassSynchronisedExample {
    //Lazy instialization - defining @ Later time.
    private static SingleTonClassSynchronisedExample SingleTonClassSynchronisedExample;

    private SingleTonClassSynchronisedExample() {
    }

    public static synchronized SingleTonClassSynchronisedExample getInstance() {
        if (SingleTonClassSynchronisedExample == null) {
            SingleTonClassSynchronisedExample = new SingleTonClassSynchronisedExample();
        }
        return SingleTonClassSynchronisedExample;
    }
}

class MainClass {
    public static void main(String[] args) {
        // Instantiating Singleton class with variable X
        SingleTonClass2 x = SingleTonClass2.getInstance();

        SingleTonClass2 x1 = SingleTonClass2.getInstance();

        // Instantiating Singleton class with variable y
        SingleTonClassLazy2 y = SingleTonClassLazy2.getInstance();

        SingleTonClassLazy2 y1 = SingleTonClassLazy2.getInstance();

        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());

        System.out.println("Hashcode of x1 is "
                + x1.hashCode());
        System.out.println("Hashcode of y1 is "
                + y1.hashCode());
    }
}