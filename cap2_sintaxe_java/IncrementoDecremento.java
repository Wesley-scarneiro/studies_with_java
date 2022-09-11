package studies_with_java.capitulo2_sintaxeJava;

/*
 * 	Exemplo simples de uso do pré e pós-incremento com os operadres "++" e "--".
 * 	O uso dos operadores no lado esquerdo ou direito nas variáveis, geram resultados diferentes
 *  somente em uma operação de atribuição.
 */
public class IncrementoDecremento {

	public static void main(String[] args) {
		
		int x, y;
		x = y = 0;
		System.out.println("Inicialização: x = " + x + " e y = " + y);
		
		// Pré-incremento: O valor de "x" é incrementado ANTES do seu uso.
		// y = 1 e x = 1
		y = ++x;
		System.out.println("Pré-incremento: x = " + x + " e y = " + y);
		
		// Pós-incremento: O valor de "x" é incrementado DEPOIS do seu uso.
		// y = 1 e x = 2
		y = x++;
		System.out.println("Pós-incremento: x = " + x + " e y = " + y);
		
		// x = 3;
		++x;
		System.out.println("++x: x = " + x);
		
		// x = 4
		x++;
		System.out.println("x++: x = " + x);
	}

}
