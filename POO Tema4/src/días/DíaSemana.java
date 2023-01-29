package días;

public enum DíaSemana {
	LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO;
	
	public static DíaSemana díaEnNDías (DíaSemana día, int días) {
		int numFuturo = (día.ordinal() +días) %DíaSemana.values().length;		
		//pasar de int a enum
		DíaSemana futuro = DíaSemana.values()[numFuturo];		
		return futuro;
	}//DíaSemana
	
	public static DíaSemana díaEnNDías2 (DíaSemana día, int días) {
		int numFuturo = (día.ordinal() +días) %DíaSemana.values().length;
		DíaSemana futuro = DíaSemana.values()[numFuturo];		
		return futuro;
	}//díaSemana
	
	public static DíaSemana díaEnNDías3 (DíaSemana día, int días) {
		int numFuturo = (día.ordinal() +días) %DíaSemana.values().length;
		DíaSemana futuro = DíaSemana.values()[numFuturo];		
		return futuro;
	}//díaSemana
	 
}
