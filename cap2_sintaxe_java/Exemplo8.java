/*
 * Dados os valores de um dep�sito fixo mensal e um montante desejado, determine quantos meses ser�o necess�rios para acumular o montante
 * desejado, considerando juros mensais de  0,5%. 
 */

package studies_with_java.capitulo2_exercicios;

public class Exemplo8 {
	
	/*
	 * Determina o tempo de aplica��o mensal com base em um montante, dep�sito fixo e a taxa de juros mensais.
	 * Considera que o dep�sito inicial � igual aos mensais.
	 */
	public static void tempoDeAplicacao(double montante, double deposito, double juros) {
		
		juros = juros/100;
		int tempo = (int) (Math.log10( ( (montante*juros)/( (1+juros)*deposito ) ) + 1)/Math.log10(1+juros));
		System.out.printf("Tempo de aplica��o necess�rio = %d meses.", tempo);
	}
	
	public static void main(String[] args) {
		
		tempoDeAplicacao(4236.48, 150, 1);
	}

}
