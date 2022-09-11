package studies_with_java.capitulo2_sintaxeJava;

/*
 * 	Exemplo de uso do operador ternário.
 * 	Ideal para avaliar condições reduzidas do tipo é/não é.
 * 	Sintaxe: (condição) > expressão_true : expressão_false
 */
public class OperadorTernario {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int max = (a > b) ? a : b;
		System.out.println("a = " + a + " b = " + b);
		System.out.println("Máximo{a, b} --> Máximo = " + max);
	}
}
