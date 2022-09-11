package studies_with_java.capitulo2_sintaxeJava;

/*
 * 	Exemplo de uso dos operadores bitwise, que realizam operações entre bits.
 * 	O resultado de uma operação bitwise (bit-a-bit) não retorna um valor booleano.
 * 
 *	No exemplo que segue, as variáveis utilizadas são do tipo byte (8 bits).
 *	31 = 0001 1111
 *	16 = 0001 0000
 *	
 *	Exemplo: Bitwise and comprara os bits de cada operando usando o operador lógico and.	
 *		0001 1111
 *		0001 0000
 *		_________
 *		0001 0000
 *	
 *	Exemplo na rotação de 1 bit à esquerda: Descarta o bit mais significativo e acrescenta 0 na posição menos significativa.
 *	1 = (0)000 0001
 *		 000 0001(0)
 *		 ___________
 *		  0000 0010 	
 */
public class Bitwise {
	
	/*
	 * 	Realiza a rotação de bits, utilizando o operador de rotação de bits à esquerda.
	 * 	Atua como um contador que incrementa em potências de 2, através da rotação bit-a-bit.
	 * 	Descarta a cada incremento 1 bit mais significativo e acrescenta um 0 (1 para negativos) na posição menos significativa.
	 */
	public static void rotacaoEsquerda() {

		System.out.print("Rotação esquerda: ");
		for (byte x = 1; x > 0; x <<= 1) {
			
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	/*
	 * Realiza a rotação de bits, utilizando o operador de rotação de bits à direita.
	 * Atua como um contador que decrementa em potências de 2, através da rotação bit-a-bit.
	 * Descarta a cada incremento 1 bit menos significativo e acrescenta um 0 (1 para negativos) no bit mais significativo.
	 */
	public static void rotacaoDireita() {
		
		System.out.print("Rotação direita: ");
		for (byte x = 64; x > 0; x >>= 1) {
			
			System.out.print(x + " ");
		}
		System.out.println();	
	}
	
	/*
	 * Realiza a rotação de bits, utilizando o operador de rotação de bits à direita sem sinal.
	 * Atua como um contador que decrementa em potências de 2, através da rotação bit-a-bit.
	 * Descarta a cada incremento 1 bit menos significativo e acrescenta sempre 0 no bit mais significativo.
	 */
	public static void rotacaoDireitaSemSinal() {
		
		System.out.print("Rotação direita sem sinal: ");
		for (byte x = 64; x > 0; x >>>= 1) {
			
			System.out.print(x + " ");
		}
		System.out.println();	
	}
	
	public static void main(String[] args) {
		
		// 31 representado em haxadecimal com 8 bits
		byte a = 0x1F;
		byte b = 0x10;	// 16
		
		System.out.println("a = " + a + " e b = " + b);
		System.out.println("bitwise and : (a & b) = " + (a&b));
		System.out.println("bitwise or  : (a | b) = " + (a|b));
		System.out.println("bitwise xor : (a ^ b) = " + (a^b));
		System.out.println("Representação em complemento de 2 : ~a = " + ~a);
		rotacaoEsquerda();
		rotacaoDireita();
		rotacaoDireitaSemSinal();

	}

}

/*
a = 31 e b = 16
bitwise and : (a & b) = 16
bitwise or  : (a | b) = 31
bitwise xor : (a ^ b) = 15
Representação em complemento de 2 : ~a = -32
Rotação esquerda: 1 2 4 8 16 32 64 
Rotação direita: 64 32 16 8 4 2 1 
Rotação direita sem sinal: 64 32 16 8 4 2 1 
*/
