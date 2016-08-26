package mz.com.idilo.servico;

public class ConversorParaRomanos {

	// primeiro devo ter o array dos numeros
	private String[] romanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	private int[] numerais = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private String romano = "";

	public String coversor(int valor) {

		// percorer a lista dos numeros ou dos romanos
		for (int i = 0; i < numerais.length; i++) {
			//percorrendo o array de numeros e subtraido sempres pelo valor da posicao
			while(valor >= numerais[i]){
				romano += romanos[i];
				valor -= numerais[i];
			}
		}

		return romano;
	}
}
