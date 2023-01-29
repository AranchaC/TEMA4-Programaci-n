package días;

public class PruebaDías {

	public static void main(String[] args) {		
		DíaSemana hoy = DíaSemana.JUEVES;
		
		//paso a entero con método ordinal
		System.out.println("Hoy es el "+ (hoy.ordinal()+1) +"to día de la Semana y es " + hoy + " 15 de Dic 2022.");
		
		int numDías=100;
		int numDías2=50;
		int numDías3=5;
		DíaSemana futuro = DíaSemana.díaEnNDías(hoy, numDías);
		DíaSemana futuro2 = DíaSemana.díaEnNDías2(hoy, numDías2);
		DíaSemana futuro3 = DíaSemana.díaEnNDías3(hoy, numDías3);
		System.out.printf("Dentro de %d días es %s el día %d de la semana. \n",numDías,futuro,(futuro.ordinal()+1));
		System.out.printf("Dentro de %d días es %s el día %d de la semana. \n",numDías2,futuro2, (futuro2.ordinal()+1));
		System.out.printf("Dentro de %d días es %s el día %d de la semana." ,numDías3,futuro3, (futuro3.ordinal()+1));

	}//main
}//class
