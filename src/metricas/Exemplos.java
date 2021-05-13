package metricas;

public class Exemplos {

	public boolean isBissexto(int ano) {
		if (ano % 400 == 0) {
			return true;
		} 
		if (ano % 4 == 0  && ano % 100 != 0) {
			return true;
		}
		return false;
	}
	
}
