package mz.com.idilo.servico;

public class ConversorParaRomanos {

	private String[] romanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	private int[] numerais = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private String romano = "";

	public String converte(int valor) {

		if (valor <= 0) {
			throw new RuntimeException("Numero menores de zero nao podem ser convertidos");
		} else {
			for (int i = 0; i < numerais.length; i++) {
				while (valor >= numerais[i]) {
					romano += romanos[i];
					valor -= numerais[i];
				}
			}
		}

		return romano;
	}
}
