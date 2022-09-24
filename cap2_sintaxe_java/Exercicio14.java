/*
 * Escreva um programa que efetue a leitura de um valor inteiro N, determinando o valor total da soma
 * dos termos: 1 - 1/2 + 1/3 - 1/4 + .. at� 1/N.
 */
package studies_with_java.capitulo2_exercicios;

import java.util.Scanner;

public class Exercicio14 {
	
	/*
	 * Recebe um valor inteiro N e determina a soma dos termos 1 - 1/2 + 1/3 + ... at� 1/N.
	 * Se "i" � par, ent�o subtrai; se �mpar, soma. 
	 */
	public static void somaFinita(int n) {
		
		if (n > 0) {
			
			double soma = 1;
			
			for (int i = 2; i <= n; i++) {
				
				if (i % 2 == 0) soma -= 1.0/i;
				else soma += 1.0/i;
			}
			
			System.out.println("1 - 1/2 + 1/3 + ... at� 1/" + n + " = " + soma);
		}
		else {
			
			System.out.println("N�mero igual a zero ou negativo.");
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n;
		
		try {
			
			System.out.print("Informe um n�mero inteiro positivo e diferente de zero: ");
			n = in.nextInt();
			somaFinita(n);
			
		} catch (Exception e) {
			
			System.out.println("Entrada inv�lida.");
		}
	}

}
/*
Informe um n�mero inteiro positivo e diferente de zero: 10
1 - 1/2 + 1/3 + ... at� 1/10 = 0.6456349206349207
*/
