/*
 * Escreva um programa que seja capaz de ler do console 31 valores reais correspondentes ao índice pluviométrico diário de um mês.
 * Após a leitura, o prograa deve determinar o índice pluviométrico médio, o índice pluviométrico máximo, e o dia de ocorrência.
 */
package studies_with_java.capitulo2_exercicios;

import java.util.Random;

public class Exercicio11 {
	
	/*
	 * Gera números aleatórios para representar as entradas dos índices pluviométricos de cada mês.
	 * Supõe-se que o índice diário pode ser no máximo até 100mm.
	 */
	public static void gerarIndices(double [] array) {
		
		Random random = new Random();
		System.out.println("--> Rebendo o índice pluviométrico diário: ");
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = random.nextDouble(100);
			System.out.printf("\t dia [%d] = %.2f mm\n", (i+1), array[i]);
		}
		
	}
	
	/*
	 * Retorna o índice pluviométrico médio.
	 */
	public static void indiceMedio(double [] array) {
		
		double media = 0;
		for (int i = 0; i < array.length; i++) media += array[i];
		media /= array.length;
		System.out.printf("--> Índice pluviométrico médio %.2fmm no mês.\n", media);
	}
	
	/*
	 * Retorna o índice plubiométrico máximo.
	 */
	public static void indiceMaximo(double [] array) {
		
		double maximo = 0;
		int dia = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (maximo < array[i]) {
				
				maximo = array[i];
				dia = i;
			}
		}
		
		System.out.printf("--> Índice pluviométrico máximo %.2fmm no dia %d", maximo, (dia+1));
	}

	public static void main(String[] args) {
	
		// Array para representar o índice pluviométrico diário.
		double [] indice_diario = new double[31];
		
		gerarIndices(indice_diario);
		indiceMedio(indice_diario);
		indiceMaximo(indice_diario);
	}

}
