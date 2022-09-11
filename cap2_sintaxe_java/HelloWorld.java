package studies_with_java.capitulo2_sintaxeJava;

/*
	Programinha inicial com a linguagem Java.
*/
public class HelloWorld {

	public static void olaMundo(int i) {
		
		while (i > 0) {
			
			System.out.println("Olá, mundo!");
			--i;
		}
	}
	
	public static void main(String[] args) {
		
		olaMundo(5);
	}

}
