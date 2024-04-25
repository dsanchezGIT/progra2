public class Persona {

//Atributos
protected String nombrel;
protected int edad;
protected double altura;

//Constructor
public Persona(String nombrel, int edad, double altura) {
    this.nombrel = nombrel;
    this.edad = edad;
    this.altura = altura;
}


//Getter & setter
public String getNombrel() {
    return nombrel;
}

public void setNombrel(String nombrel) {
    this.nombrel = nombrel;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public double getAltura() {
    return altura;
}

public void setAltura(double altura) {
    this.altura = altura;
}




}
