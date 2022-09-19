/*
 * Dados os valores de um depósito fixo mensal e um montante desejado, determine quantos meses serão necessários para acumular o montante
 * desejado, considerando juros mensais de  0,5%. 
 */

package studies_with_java.capitulo2_exercicios;

public class Exemplo8 {
	
	/*
	 * Determina o tempo de aplicação mensal com base em um montante, depósito fixo e a taxa de juros mensais.
	 * Considera que o depósito inicial é igual aos mensais.
	 */
	public static void tempoDeAplicacao(double montante, double deposito, double juros) {
		
		juros = juros/100;
		int tempo = (int) (Math.log10( ( (montante*juros)/( (1+juros)*deposito ) ) + 1)/Math.log10(1+juros));
		System.out.printf("Tempo de aplicação necessário = %d meses.", tempo);
	}
	
	public static void main(String[] args) {
		
		tempoDeAplicacao(4236.48, 150, 1);
	}

}
