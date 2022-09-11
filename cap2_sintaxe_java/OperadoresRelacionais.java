package studies_with_java.capitulo2_sintaxeJava;

/*
 *	Exemplo de uso dos operadores relacionais.
 */
public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		System.out.println("a = " + a + " e b = " + b);
		System.out.println("a == b --> " + (a==b));
		System.out.println("a != b --> " + (a!=b));
		System.out.println("a > b  --> " + (a>b));
		System.out.println("a >= b --> " + (a>=b));
		System.out.println("a < b  --> " + (a<b));
		System.out.println("a <= b --> " + (a<=b));
	}

}

/*
a = 10 e b = 5
a == b --> false
a != b --> true
a > b  --> true
a >= b --> true
a < b  --> false
a <= b --> false
 */