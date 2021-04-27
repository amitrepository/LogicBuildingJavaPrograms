package serializale;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog implements Serializable{
	int i=10;
	static int j=20;
	
	Cat c1=new Cat();
	
	
	public static void main(String[] args) throws Exception {
	
		Dog d1=new Dog();
		
		File file = new File("sample.txt");
		//Serializable example
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2= (Dog) ois.readObject();
		
		System.out.println("i= "+d2.i + " j= "+d2.j);
		
	
		oos.writeObject(d1);
		
		Dog d3= (Dog) ois.readObject();
		System.out.println(d3.c1.r.k);
		
		
		
	}

}
