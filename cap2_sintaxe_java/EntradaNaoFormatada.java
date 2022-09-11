/*
 * 	Realiza a leitura de um único caractere como inteiro.
 * 	A saída informará a representação decimal do caractere na tabela de ASCII.
 */

package studies_with_java.capitulo2_sintaxeJava;

import java.io.IOException;

public class EntradaNaoFormatada {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Digite um caractere: ");
		
		/*
		 * 	System: Classe que fornece um objeto do tipo "in".
		 *  in: Objeto para a entrada de dados do console (teclado).
		 *  read(): Método do objeto "in" que permite realizar a leitura de um único caractere como inteiro.
		 */
		int c = System.in.read();
		
		System.out.println("Representação decimal do caractere digitado: " + c);
	}
}
