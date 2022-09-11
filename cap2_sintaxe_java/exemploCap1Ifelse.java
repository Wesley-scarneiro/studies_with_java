package studies_with_java.capitulo2_sintaxeJava;

/*
 * 	O primeiro argumento informado na linha de comando determina o limite da sequência que será impressa.
 * 	Não impreme a sequência se não for especificado algum argumento.
 */
public class exemploCap1Ifelse {

	public static void main(String[] args) {
		
		if (args.length > 0) {	// verifica se a string de argumentos não está vazia.
			
			int max = Integer.parseInt(args[0]);	// converte o primeiro argumento recebido para int.
			for (int i = 0; i < max; i++) System.out.print(i + " ");
		}
		else {
			
			System.out.println("Nenhum argumento informado para imprimir a sequ�ncia.");
		}
	}
}
