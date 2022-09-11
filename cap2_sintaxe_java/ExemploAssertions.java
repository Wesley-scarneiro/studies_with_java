/*
 * 	Exemplo de uso de asser��es (assertions) do Java.
 * 	Quando a condi��o de uma asser��o � falsa, a execu��o do programa � paralisada e lan�ada uma exe��o do tipo "AssertionError".
 * 	As asser��es s�o ferramentas �teis para a corre��o de algoritmos.
 * 	Para que o programa possa lan�ar asser��es, � preciso habilit�-las durante a compila��o: java -ea ExemploAssertions
 */
package studies_with_java.capitulo2_sintaxeJava;

import java.util.Scanner;

public class ExemploAssertions {
	
	public static void main(String[] args) {
		
		try {
			
			Scanner in = new Scanner(System.in);
			System.out.println("Informe um n�mero de 1 � 9:");
			int x = in.nextInt();
			assert (x <= 9) : "O inteiro informado � > 9!"; // Assert
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
