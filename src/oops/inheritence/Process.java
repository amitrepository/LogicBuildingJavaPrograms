package oops.inheritence;

public class Process {
    public static void main(String[] args) {
        SecondClass secondClass= new SecondClass();
        secondClass.add(3,"Three");
        secondClass.add(2,2);
        secondClass.add(1,"one");
        secondClass.add(6,6);
        secondClass.display();
    }
}
