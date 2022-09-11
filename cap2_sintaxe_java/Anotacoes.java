/*
 * Exemplo de uso de algumas anotações do Java.
 */
package studies_with_java.capitulo2_sintaxeJava;

/*
 * Classe para ser instanciada no main.
 */
class ExemploAnotacao {
	
	String nome;
	
	/*
	 * Sobrepondo o método toString.
	 * @Override : Indica que o método está sendo sobreposto.
	 * @SuppressWarnings : Suprimi avisos sobre a variável "x" não utilizada.
	 */
	@Override
	@SuppressWarnings("unused")
	public String toString() {
		
		int x;
		return nome;
	}
}

public class Anotacoes {
	
	/*
	 * Indica se um inteiro é par ou ímpar.
	 * A anotação @Deprecated indica que o método é obsoleto e não deve ser usado.
	 * Se usado, será gerado um aviso durante a compilação.
	 */
	@Deprecated 
	public static void parOuimpar(int x) {
		
		if (x % 2 == 0) System.out.println(x + " é par.");
		else System.out.println(x + " é ímpar.");
	}
	
	
	public static void main(String[] args) {
		
		// Tentando usar o método obsoleto.
		parOuimpar(9);
		
		ExemploAnotacao e = new ExemploAnotacao();
		e.nome = "Wesley";
		System.out.println(e);			// chama toString();
		
	}
	
}


