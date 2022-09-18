/*
 * Escreva um programa que seja capaz de ler do console 31 valores reais correspondentes ao �ndice pluviom�trico di�rio de um m�s.
 * Ap�s a leitura, o prograa deve determinar o �ndice pluviom�trico m�dio, o �ndice pluviom�trico m�ximo, e o dia de ocorr�ncia.
 */
package studies_with_java.capitulo2_exercicios;

import java.util.Random;

public class Exercicio11 {
	
	/*
	 * Gera n�meros aleat�rios para representar as entradas dos �ndices pluviom�tricos de cada m�s.
	 * Sup�e-se que o �ndice di�rio pode ser no m�ximo at� 100mm.
	 */
	public static void gerarIndices(double [] array) {
		
		Random random = new Random();
		System.out.println("--> Rebendo o �ndice pluviom�trico di�rio: ");
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = random.nextDouble(100);
			System.out.printf("\t dia [%d] = %.2f mm\n", (i+1), array[i]);
		}
		
	}
	
	/*
	 * Retorna o �ndice pluviom�trico m�dio.
	 */
	public static void indiceMedio(double [] array) {
		
		double media = 0;
		for (int i = 0; i < array.length; i++) media += array[i];
		media /= array.length;
		System.out.printf("--> �ndice pluviom�trico m�dio %.2fmm no m�s.\n", media);
	}
	
	/*
	 * Retorna o �ndice plubiom�trico m�ximo.
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
		
		System.out.printf("--> �ndice pluviom�trico m�ximo %.2fmm no dia %d", maximo, (dia+1));
	}

	public static void main(String[] args) {
	
		// Array para representar o �ndice pluviom�trico di�rio.
		double [] indice_diario = new double[31];
		
		gerarIndices(indice_diario);
		indiceMedio(indice_diario);
		indiceMaximo(indice_diario);
	}

}
