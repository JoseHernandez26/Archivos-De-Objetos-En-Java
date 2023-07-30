package Files_With_Objects;

import java.io.Serializable;
 
public class Student implements Serializable {
	
	private static final long serialVersionUID = -8948432491824001606L;
	private String name;
	private int number;
 
	public Student(String name, int number) {
		this.name = name;
		this.number = number;
	}
 
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + "]";
	}
	
 
}
