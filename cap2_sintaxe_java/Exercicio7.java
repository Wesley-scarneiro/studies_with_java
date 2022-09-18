/*
 * Construa um programa que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos.
 * Argumentos inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções.
 */
package studies_with_java.capitulo2_exercicios;

public class Exercicio7 {

	public static void main(String[] args) {
		
		int soma1 = 0;
		double soma2 = 0;
		
		if (args.length > 0) {
			
			for (int i = 0; i < args.length; i++) {
				
				try {
					
					soma1 += Integer.parseInt(args[i]);
					
				} catch (NumberFormatException e1) {
					
					try {
						
						soma2 += Double.parseDouble(args[i]);
						
					} catch (NumberFormatException e2) {
						
						// Então args[i] é uma String.
						// Nenhum operação é realizada. 
					}
				}
			}
			
			System.out.println("Soma de todos os inteiros = " + soma1);
			System.out.println("Soma de todos os reais = " + soma2);
		}
		else {
			
			System.out.println("Nenhum argumento informado.");
		}
	}
}
