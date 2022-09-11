/*
 * 	Exemplos de uso das estrutura de controle de erros do Java.
 * 	Os erros no Java s�o entendidos como "exce��es" e podem ser tratadas pela diretiva try catch finally.
 */

package studies_with_java.capitulo2_sintaxeJava;

import java.util.Scanner;

public class ControleDeErros {
	
	/*
	 * Recebe um n�mero como string e faz a convers�o para inteiro.
	 * Verifica se o n�mero � par ou �mpar.
	 * Se for passado uma letra ou palavra, n�o ser� poss�vel a convers�o e a exce��o ser� tratada.
	 */
	public static void exemploErro1(String numero) {
		
		try {
			
			int x = Integer.parseInt(numero);
			if (x % 2 == 0) System.out.println("O n�mero " + x + " � par.");
			else System.out.println("O n�mero " + x + " � �mpar.");
			
		} catch (Exception e) {	// Erro gen�rico
			
			System.out.println("* N�o foi poss�vel converter a string repassada como inteiro. *");
		} 
	}
	
	/*
	 * Recebe um array de Strings e o �ndice do elemento a ser acessado.
	 * O elemento string � convertido para um n�mero inteiro, sendo verificado se � par ou �mpar.
	 * Se o elemento n�o existe no array ou se a convers�o n�o � poss�vel, ent�o uma exce��o ocorre e ser� tratada.
	 * Uso de dois catchs para tratar os dois poss�veis erros. 
	 */
	public static void exemploErro2(String [] args, int i) {
		
		try {
			
			int x = Integer.parseInt(args[i]);
			if (x % 2 == 0) System.out.println("O n�mero " + x + " � par.");
			else System.out.println("O n�mero " + x + " � �mpar.");
			
		} catch (ArrayIndexOutOfBoundsException e) { 								// Captura uma exce��o caso ocorra um acesso a uma posi��o indevida no array.
			
			System.out.println("* O elemento args[" + i + "] n�o existe. *");
		} catch (NumberFormatException e) {											// Captura uma exce��o em caso de uma convers�o inv�lida. 
			
			System.out.println("* N�o foi poss�vel converter o elemento \"" + args[i] + "\" para inteiro. *");
		}
	}
	
	/*
	 * 	Recebe um array de Strings e o �ndice do elemento a ser acessado.
	 * O elemento string � convertido para um n�mero inteiro, sendo verificado se � par ou �mpar.
	 * Se o elemento n�o existe no array ou se a convers�o n�o � poss�vel, ent�o uma exce��o ocorre e ser� tratada.
	 * A cl�usula finally � adicionada, para garantir que pelo menos o usu�rio informe o n�mero para a execu��o do programa, se ocorrer alguma exce��o.
	 */
	
	public static void exemploErro3(String [] args, int i) {
		
		boolean executar = true;
		
		try {
			
			int x = Integer.parseInt(args[i]);
			if (x % 2 == 0) System.out.println("O n�mero " + x + " � par.");
			else System.out.println("O n�mero " + x + " � �mpar.");
			executar = false;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("* Nenhum argumento foi informado. *");
		} catch (NumberFormatException e) {
			
			System.out.println("* Imposs�vel converter \"" + args[i] + "\" para inteiro. *");
		} finally {
			
			if (executar == true) {
				
				System.out.print("Informe um n�mero inteiro: ");
				
				try {
					
					Scanner in = new Scanner(System.in);
					int x = in.nextInt();
					if (x % 2 == 0) System.out.println("O n�mero " + x + " � par.");
					else System.out.println("O n�mero " + x + " � �mpar.");
					
				} catch (Exception e) {
					
					System.out.println("* O n�mero informado n�o corresponde a um inteiro. *");
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
