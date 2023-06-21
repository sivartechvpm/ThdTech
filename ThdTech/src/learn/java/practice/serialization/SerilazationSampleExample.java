package learn.java.practice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilazationSampleExample {

	public static void main(String[] args) {

		try {

			// SERIALIZATION

			FileOutputStream writeFile = new FileOutputStream("siva.txt");
			ObjectOutputStream out = new ObjectOutputStream(writeFile);

			Emp object = new Emp(1, "Siva Rajendran");

			// Method for serialization of object
			out.writeObject(object);

			out.close();
			writeFile.close();

			System.out.println("Object has been serialized\n" + "Data before Deserialization.");
		    System.out.println(object.id);
		    System.out.println(object.name);
			
			
			
			
			
			
			
			
			
			
			//----------------------------------------------------------------------------------------------
			
			
			
			// DE SERIALIZATION

			// Reading the object from a file
			FileInputStream readfile = new FileInputStream("siva.txt");
			ObjectInputStream in = new ObjectInputStream(readfile);

			// Method for deserialization of object
			object = (Emp) in.readObject();

			in.close();
			readfile.close();
			System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
			
			System.out.println(object.id);
		    System.out.println(object.name);

		} catch (Exception e) {

		}

	}

}

class Emp implements Serializable {

	transient int id;
	static String name="Kumar";

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
