package oops.abstraction;

public abstract  class DemoAbstract {

	int x;
	//abstract method don't required implementation
	public abstract  void someMethod();

	public abstract  void someMethod2();

	//non abstract method  required implementation or body
	public static void concreteMethod() {
		System.out.println("concreteMethod ...");
	}

	//abstract class may or may not have abstract method

	//we can't use final and abstract at same time cause final class or method cannot be modified where abstract class or method must be modified

	//abstract method cannot be private , if abstract method allowed to be private  then they will not be inherited to subclass

	//abstract method cannot be static ( only public and protected allowed)

	//concrete method can be static here.

//	DemoAbstract(Integer i){
//		this.x=i;
//	}

}
