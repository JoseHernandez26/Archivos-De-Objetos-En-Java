package Files_With_Objects;

import java.io.Serializable;

public class Student implements Serializable {

    // El serialVersionUID se utiliza para identificar la versión de la clase serializada.
    // Siempre que se realicen cambios en la clase, se debe actualizar este número.
    // De esta manera, se asegura que las versiones anteriores y posteriores sean compatibles al leer y escribir objetos.
    private static final long serialVersionUID = -8948432491824001606L;

    private String name;
    private int number;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    // Sobreescribimos el método toString() para obtener una representación de cadena del objeto.
    @Override
    public String toString() {
        return "Student [name=" + name + ", number=" + number +
