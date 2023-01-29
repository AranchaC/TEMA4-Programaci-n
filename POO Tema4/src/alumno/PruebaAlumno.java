package alumno;
import java.util.Scanner;
public class PruebaAlumno {
	public static void main(String[] args) {
		Alumno alumno0= new Alumno();
		
		Alumno alumno[]= new Alumno [10];
		for (int i=0; i<alumno.length;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Dime tu nombre");
			String nom=sc.nextLine();
			alumno[i].setNombre(nom);
		}

		System.out.println(alumno[0]);
		System.out.println(alumno0);
		
		
		
		
	}

}
