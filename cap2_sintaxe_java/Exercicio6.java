/*
 *  Dado um terreno retangular, do qual s�o conhecidos sua largura e seu comprimento, escreva um programa
 *  que calcule e exiba os valores de seu per�metro e sua area.
 */
package studies_with_java.capitulo2_exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double largura = 0;
		double comprimento = 0;
		
		try {
			
			System.out.print("Informe a largura(cm): ");
			largura = in.nextDouble();
			System.out.print("Informe o comprimento(cm): ");
			comprimento = in.nextDouble();
			
			double perimetro = 2*largura + 2*comprimento;
			double area = largura*comprimento;
			System.out.println("Per�metro =  " + perimetro + "cm\n�rea = " + area + "cm�");

		} catch (Exception e) {
			
			System.out.println("Entrada inv�lida.");
			
		} finally {
			
			in.close();
		}
	}

}
