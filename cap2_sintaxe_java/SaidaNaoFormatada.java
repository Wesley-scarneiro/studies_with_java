package studies_with_java.capitulo2_sintaxeJava;

/*
 *	Exemplo simples de saída não formatada. 	
 */
public class SaidaNaoFormatada {

	public static void main(String[] args) {
		
		/*
		 *	System: Classe que fornece um objeto do tipo "out".
		 *	out: Objeto que representa um dispositivo de saída de dados (monitor).
		 *	println: Método do objeto "out" para a saída de valores, mensagens e objetos. Solicita quebra de linha.
		 */
		System.out.println("Ola, segue alguns exemplos de uso de saída não formada no Java:");
		
		String nome = "Wesley";
		int nascimento = 1995;
		int ano = 2022;
		System.out.println(nome);
		System.out.println(nome + " Carneiro");
		System.out.println("Idade: " + (ano - nascimento) + " anos.");
	}

}
