/*
 *  Dado um terreno retangular, do qual são conhecidos sua largura e seu comprimento, escreva um programa
 *  que calcule e exiba os valores de seu perímetro e sua area.
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
			System.out.println("Perímetro =  " + perimetro + "cm\nÁrea = " + area + "cm²");

		} catch (Exception e) {
			
			System.out.println("Entrada inválida.");
			
		} finally {
			
			in.close();
		}
	}

}
