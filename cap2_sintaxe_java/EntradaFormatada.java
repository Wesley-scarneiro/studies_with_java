package studies_with_java.capitulo2_sintaxeJava;

import java.util.Scanner;

/*
 * Exemplo simples para a entrada formada, através da classe Scanner (incluída no Java 5). 
 */
public class EntradaFormatada {

	public static void main(String[] args) {
		
		/*
		 *	Scanner: Classe para a entrada formatada de dados.
		 *	System.in: Objeto para a entrada de dados.
		 *	A classe Scanner oferecerá métodos para receber diferentes tipos de dados.
		 */
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("*Entrada*\nDigite o seu ano de nascimento: ");
		
		int nascimento = entrada.nextInt();
		System.out.println("Digite o ano corrente: ");
		int ano = entrada.nextInt();
		
		// Encerra a leitura após encontrar o caractere space ou  ENTER. Necessário retirar o ENTER do buffer ("\n").
		System.out.println("Digite o seu nome: ");							
		entrada.nextLine();
		String nome = entrada.next();
		
		// Pega o "\n" deixado pela leitura anterior e encerra a leitura da linha após identificar o "\n".
		System.out.println("Digite o seu sobrenome: ");
		entrada.nextLine();
		String sobrenome = entrada.nextLine();
		
		System.out.println("*Saída*\nNome completo: " + nome + " " + sobrenome + "\nIdade: " + (ano - nascimento) + " aninhos");
	}

}
