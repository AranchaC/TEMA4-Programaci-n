package colores;

public class PruebaColores {

	public static void main(String[] args) {
		Color miColor = Color.Verde;
		Color tuColor = Color.Azul;
		
		//¿se puede pasar de string a enum?
		miColor = Color.valueOf("Verde");
		tuColor = Color.valueOf("Azul");
		
		//paso auto de Enum a String
		System.out.println("Mi color preferido es: "+miColor);
		System.out.println("Tu color preferido es: "+tuColor);

	}

}
