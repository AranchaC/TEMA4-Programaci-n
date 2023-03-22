package alumno;
//prueba
import java.util.Objects;

public class Alumno {

	private String nombre;
	private String apellido;
	private int edad;
	
	public Alumno(){ 
		this("sin nombre","sin apellido",0);
	}
	
	public Alumno(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre(){
		return nombre;		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellido, other.apellido) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	
	

}
