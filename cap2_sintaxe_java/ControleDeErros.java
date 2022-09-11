/*
 * 	Exemplos de uso das estrutura de controle de erros do Java.
 * 	Os erros no Java são entendidos como "exceções" e podem ser tratadas pela diretiva try catch finally.
 */

package studies_with_java.capitulo2_sintaxeJava;

import java.util.Scanner;

public class ControleDeErros {
	
	/*
	 * Recebe um número como string e faz a conversão para inteiro.
	 * Verifica se o número é par ou ímpar.
	 * Se for passado uma letra ou palavra, não será possível a conversão e a exceção será tratada.
	 */
	public static void exemploErro1(String numero) {
		
		try {
			
			int x = Integer.parseInt(numero);
			if (x % 2 == 0) System.out.println("O número " + x + " é par.");
			else System.out.println("O número " + x + " é ímpar.");
			
		} catch (Exception e) {	// Erro genérico
			
			System.out.println("* Não foi possível converter a string repassada como inteiro. *");
		} 
	}
	
	/*
	 * Recebe um array de Strings e o índice do elemento a ser acessado.
	 * O elemento string é convertido para um número inteiro, sendo verificado se é par ou ímpar.
	 * Se o elemento não existe no array ou se a conversão não é possível, então uma exceção ocorre e será tratada.
	 * Uso de dois catchs para tratar os dois possíveis erros. 
	 */
	public static void exemploErro2(String [] args, int i) {
		
		try {
			
			int x = Integer.parseInt(args[i]);
			if (x % 2 == 0) System.out.println("O número " + x + " é par.");
			else System.out.println("O número " + x + " é ímpar.");
			
		} catch (ArrayIndexOutOfBoundsException e) { 								// Captura uma exceção caso ocorra um acesso a uma posição indevida no array.
			
			System.out.println("* O elemento args[" + i + "] não existe. *");
		} catch (NumberFormatException e) {											// Captura uma exceção em caso de uma conversão inválida. 
			
			System.out.println("* Não foi possível converter o elemento \"" + args[i] + "\" para inteiro. *");
		}
	}
	
	/*
	 * 	Recebe um array de Strings e o índice do elemento a ser acessado.
	 * O elemento string é convertido para um número inteiro, sendo verificado se é par ou ímpar.
	 * Se o elemento não existe no array ou se a conversão não é possível, então uma exceção ocorre e será tratada.
	 * A cláusula finally é adicionada, para garantir que pelo menos o usuário informe o número para a execução do programa, se ocorrer alguma exceção.
	 */
	
	public static void exemploErro3(String [] args, int i) {
		
		boolean executar = true;
		
		try {
			
			int x = Integer.parseInt(args[i]);
			if (x % 2 == 0) System.out.println("O número " + x + " é par.");
			else System.out.println("O número " + x + " é ímpar.");
			executar = false;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("* Nenhum argumento foi informado. *");
		} catch (NumberFormatException e) {
			
			System.out.println("* Impossível converter \"" + args[i] + "\" para inteiro. *");
		} finally {
			
			if (executar == true) {
				
				System.out.print("Informe um número inteiro: ");
				
				try {
					
					Scanner in = new Scanner(System.in);
					int x = in.nextInt();
					if (x % 2 == 0) System.out.println("O número " + x + " é par.");
					else System.out.println("O número " + x + " é ímpar.");
					
				} catch (Exception e) {
					
					System.out.println("* O número informado não corresponde a um inteiro. *");
				}
			}
			
			System.out.println("Programa encerrado.");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("--> Exemplo 1:");
		exemploErro1("10");
		exemploErro1("13");
		exemploErro1("a");
		
		System.out.println("--> Exemplo 2:");
		String [] array = new String[10];
		array[0] = "2";
		array[1] = "3";
		array[3] = "w";
		exemploErro2(array, 0);
		exemploErro2(array, 1);
		exemploErro2(array, 3);
		exemploErro2(array, 10);
		
		System.out.println("--> Exemplo 3:");
		exemploErro3(array, 0);
		exemploErro3(array, 1);
		exemploErro3(array, 3); // Informar um tipo correto para inteiro.
		exemploErro3(array, 10); // Informa um tipo incorreto para inteiro.
	}
}
