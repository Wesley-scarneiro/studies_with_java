package studies_with_java.capitulo2_sintaxeJava;

/*
 *	Exemplos de uso da promoção automática de tipos e da coersão de tipos (type casting).
 */
public class PromocaoEcoercao {

	public static void main(String[] args) {
		
		byte a = 1;
		
		// A variável 'a' do tipo byte (1 byte) é convertida automaticamente para o tipo int (4 bytes).
		// Promoção automática de tipos.
		int soma = a + 2;
		
		double pi = 3.14159265;
		
		// Coerção do tipo double (8 bytes) para int; a parte fracionário é truncada.
		// Type casting
		int c = (int) pi;
		
	}

}
