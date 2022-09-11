package studies_with_java.capitulo2_sintaxeJava;

/*
 *	Exemplo de saída formatada, com o uso do método printf(), semelhante ao da linguagem C.
 */
public class SaidaFormatada {
	
	public static void main(String[] args) {
		
		/*
		 * 	System: Classe que fornece um objeto do tipo "out".
		 * 	out: Objeto para a saída de dados.
		 * 	printf: Método para impressão formatada no console de sáida padrão (monitor).
		 */
		int inicio = 0;
		int fim = 100;
		int soma = 0;
		System.out.printf("*Somando os inteiro de %d a %d*%n", inicio, fim);
		
		while (inicio <= fim) {
			
			soma += inicio;
			++inicio;
		}
		
		System.out.printf("Total da soma: %d:%n", soma);
	}

}
