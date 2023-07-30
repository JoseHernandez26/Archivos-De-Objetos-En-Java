package Files_With_Objects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraDelObjeto {

	public static void main(String[] args) {
		Student estudiante1 = new Student("andrea", 9444);
		Student estudiante2 = new Student("Marcela", 4268);
		
		try(FileOutputStream fos = new FileOutputStream("files\\students.dat")){
			try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
				obj.writeObject(estudiante1);
				obj.writeObject(estudiante2);
				System.out.println("Object written onto the file");
			}

		} catch (FileNotFoundException e) {
			System.out.println("ileNotFoundException");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException");
		}

	}

}