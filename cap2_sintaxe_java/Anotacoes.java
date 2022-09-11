/*
 * Exemplo de uso de algumas anota��es do Java.
 */
package studies_with_java.capitulo2_sintaxeJava;

/*
 * Classe para ser instanciada no main.
 */
class ExemploAnotacao {
	
	String nome;
	
	/*
	 * Sobreponto o m�todo toString.
	 * @Override : Indica que o m�todo est� sendo sobreposto.
	 * @SuppressWarnings : Supremi avisos sobre a vari�vel "x" n�o utilizada.
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
	 * Indica se um inteiro � par ou �mpar.
	 * A anota��o @Deprecated indica que o m�todo � obsoleto e n�o deve ser usado.
	 * Se usado, ser� gerado um aviso durante a compila��o.
	 */
	@Deprecated 
	public static void parOuimpar(int x) {
		
		if (x % 2 == 0) System.out.println(x + " � par.");
		else System.out.println(x + " � �mpar.");
	}
	
	
	public static void main(String[] args) {
		
		// Tentando usar o m�todo obsoleto.
		parOuimpar(9);
		
		ExemploAnotacao e = new ExemploAnotacao();
		e.nome = "Wesley";
		System.out.println(e);			// chama toString();
		
	}
	
}


