/*
 * Exemplo de opera��es sobre os argumentos recebidos no m�todo main.
 */
package studies_with_java.capitulo2_sintaxeJava;

import java.text.NumberFormat;

public class ArgumentosMain {
	
	/*
	 * Recebe o array de Strings do par�metro da fun��o main.
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
	 * Recebe o array de Strings do par�metro da fun��o main.
	 * Converte os n�meros em string para o tipo int ou double.
	 */
	public static void converterArgumentos(String[] args) {
		
			if (args.length > 0) {
				
				for (int i = 0; i < args.length; i++) {
					
					System.out.print("\targs[" + i + "] = " + args[i]);
					
					try {
						
						int n = Integer.parseInt(args[i]);
						System.out.println("\t--> Tipo: int");
						
					} catch (NumberFormatException e1) {
						
						// Se ocorreu exce��o, ent�o args[i] n�o � um inteiro.
						// Pode ser um n�mero real.
						
						try {
							
							double n = Double.parseDouble(args[i]);
							System.out.println(" --> Tipo: double");
							
						} catch (NumberFormatException e2) {
							
							// Se ocorreu exce��o, ent�o args[i] � uma string (cadeia de caracteres).
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
