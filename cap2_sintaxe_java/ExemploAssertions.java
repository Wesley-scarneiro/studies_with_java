/*
 * 	Exemplo de uso de asserções (assertions) do Java.
 * 	Quando a condição de uma asserção é falsa, a execução do programa é paralisada e lançada uma exeção do tipo "AssertionError".
 * 	As asserções são ferramentas úteis para a correção de algoritmos.
 * 	Para que o programa possa lançar asserções, é preciso habilitá-las durante a compilação: java -ea ExemploAssertions
 */
package studies_with_java.capitulo2_sintaxeJava;

import java.util.Scanner;

public class ExemploAssertions {
	
	public static void main(String[] args) {
		
		try {
			
			Scanner in = new Scanner(System.in);
			System.out.println("Informe um número de 1 à 9:");
			int x = in.nextInt();
			assert (x <= 9) : "O inteiro informado é > 9!"; // Assert
			int soma = 0;
			
			for (int i = 0; i <= x; i++) {
				
				soma += i;
				assert (soma <= 45) : "Soma > 45!"; // Assert
			}
			
			System.out.println("Soma [0 + ... + " + x + "] = " + soma);
			
		} catch (Exception e) {
			
			System.out.println("* Erro no recebimento do inteiro. *");
		}
	}
}
