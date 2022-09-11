package studies_with_java.capitulo2_sintaxeJava;

/*
 * 	Exemplo de operadores lógicos do java: and, or, xor e not.
 */
public class OperadoresLogicos {

	public static void main(String[] args) {
	
		double a = 2.78;
		double b = -3.1415;
		
		System.out.println("a = " + a + " e b = " + b);
		System.out.println("and: (a < 0) && (b < 0)? " + (a<0 && b<0));
		System.out.println("or : (a > 0) || (b > 0)? " + (a>0 || b>0));
		System.out.println("not: !((a < 0) && (b < 0))? " + !(a<0 && b<0));
		System.out.println("xor: (a > 0) ^ (b > 0)? " + (a>0 ^ b>0));
		
	}
}
