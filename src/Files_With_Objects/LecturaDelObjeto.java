package Files_With_Objects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaDelObjeto {
 
	public static void main(String[] args) {
		try (FileInputStream FIO = new FileInputStream("files\\students.dat")) {
			try (ObjectInputStream obj = new ObjectInputStream(FIO)) {
				Student s1 = (Student) obj.readObject();
				Student s2 = (Student) obj.readObject();
				System.out.println("Object 1: "+s1);
				System.out.println("Object 1: "+s2);
 
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
 
	}
 
}
