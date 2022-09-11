/*
 * Exemplo de operações sobre os argumentos recebidos no método main.
 */
package studies_with_java.capitulo2_sintaxeJava;

import java.text.NumberFormat;

public class ArgumentosMain {
	
	/*
	 * Recebe o array de Strings do parâmetro da função main.
	 * Imprime os argumentos informados na linha de comando. 
	 */
	public static void imprimirArgumentos(String[] args) {
		
		if (args.length > 0) {
			
			System.out.println("Total de argumentos: " + args.length);
			System.out.println("Argumentos informados:");
			
			for (int i = 0; i < args.length; i++) {
				
				System.out.println("\targs[" + i + "] = " + args[i]);
			}
		}
		else {
			
			System.out.println("Nenhum argumento informado na linha de comando.");
		}
	}
	
	/*
	 * Recebe o array de Strings do parâmetro da função main.
	 * Converte os números em string para o tipo int ou double.
	 */
	public static void converterArgumentos(String[] args) {
		
			if (args.length > 0) {
				
				for (int i = 0; i < args.length; i++) {
					
					System.out.print("\targs[" + i + "] = " + args[i]);
					
					try {
						
						int n = Integer.parseInt(args[i]);
						System.out.println("\t--> Tipo: int");
						
					} catch (NumberFormatException e1) {
						
						// Se ocorreu exceção, então args[i] não é um inteiro.
						// Pode ser um número real.
						
						try {
							
							double n = Double.parseDouble(args[i]);
							System.out.println(" --> Tipo: double");
							
						} catch (NumberFormatException e2) {
							
							// Se ocorreu exceção, então args[i] é uma string (cadeia de caracteres).
							System.out.println(" --> Tipo: String");
						}
					}
				}
			}
			else {
				
				System.out.println("Nenhum argumento informado na linha de comando.");
			}
	}
	
	public static void main(String[] args) {
		
		// imprimirArgumentos(args);
		// converterArgumentos(args);
	}
}
