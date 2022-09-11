package studies_with_java.capitulo2_sintaxeJava;

import java.util.Scanner;

/*
 * 	Programa para testar o uso das estruturas de controle do Java.
 * 	As estruturas de controle do java podem ser divididas em:
 * 		- Estruturas de repetição: Repetição simples com o "for" e repetição condicional com o "while" e "do while".
 * 		- Estruturas de desvio de fluxo: Desvio condicional com "if else" e "switch"; desvio incondicional com "break" 
 * 		  e "continue".
 */
public class EstruturasDeControle {

	/*
	 * Imprime uma progressão aritmética de "n" elementos com razão "r". O parâmetro
	 * "x" é o primeiro elemento da sequência.
	 */
	public static void paComFor(int x, int r, int n) {

		for (int i = 0; i < n; i++) {

			System.out.print(x + " ");
			x += r;
		}

		System.out.println("");
	}

	/*
	 * Exemplo de uso do foreach, mais avançado que o "for" comum. Recebe um array
	 * de inteiros e os imprime. Muito poderoso!
	 */
	public static void forAvancado(int[] array) {

		for (int x : array)
			System.out.print(x + " ");
		System.out.println("");
	}

	/*
	 * Cria uma progressão geomética e a guarda em um array de inteiros. Retorna a
	 * referência do array de inteiros criado (um ponteiro para um array de
	 * inteiros!).
	 */
	public static int[] progressaoGeo(int x, int r, int n) {

		int pg[] = new int[n];

		for (int i = 0; i < n; i++) {

			pg[i] = x;
			x *= r;
		}

		return pg;
	}

	/*
	 * Exemplo de uso do while, estrutura de repetição condicional. Realiza a
	 * contagem regressiva a partir de um número "x" informado.
	 */
	public static void regressivaWhile(int x) {

		while (x >= 0) {

			System.out.print(x + " ");
			x--;
		}

		System.out.println("!");
	}

	/*
	 * Exemplo de uso do "do while", estrutura também de repetição condicional.
	 * Diferente do "while", executa o bloco de diretivas no mínimo uma vez.
	 * 
	 * Enquanto a string recebida for diferente da especificada na condição do
	 * "while", o bloco de diretivas do "do" será executado.
	 */
	public static void jogoDaBanana() {

		Scanner in = new Scanner(System.in);
		String resposta;

		do {

			System.out.println("Qual é a cor da banana? ");
			resposta = in.next();
			in.hasNextLine();

		} while (resposta.compareTo("amarelo") != 0);

		System.out.println("Acertou!");
	}

	/*
	 * Exemplo de uso de desvio de fluxo condicional com "if else". Decrementa o
	 * valor "max" fornecido, enquanto for maior que zero. Se receber um valor
	 * negativo ou zero, encerra.
	 */
	public static void exemploComIfelse(int max) {

		if (max > 0) {

			while (max > 0) {

				System.out.print(max + " ");
				max--;
			}

			System.out.println("");
		} else {

			if (max == 0) System.out.println("max = 0");
			else System.out.println("max < 0");
		}
	}

	/*
	 * Exemplo de uso do switch, estrutura de múltiplo desvio de fluxo. Avalia se o
	 * Verifica se o inteiro repassado corresponde ao estado 0 (desligado), 1
	 * (ligado) ou nenhum dos dois (indefinido).
	 */
	public static void exemploSwitch(int x) {

		switch (x) {

		case (0):
			System.out.println("Estado: Desligado.");
			break;
		case (1):
			System.out.println("Estado: Ligado.");
			break;
		default:
			System.out.println("Estado: Indefinido.");
		}
	}

	/*
	 * Exemplo de uso do switch com strings. Recebe uma string e avalia qual caso
	 * corresponde para executar o seu comando.
	 */
	public static void exemploSwitchString(String comando) {
		
		switch(comando.toLowerCase()) {	// interpreta a string com caracteres minúsculos.
		
		case ("ligar"):
			System.out.println("Sistema sendo iniciado...");
			break;
		case ("desligar"):
			System.out.println("Sistema sendo desligado...");
			break;
		case ("reiniciar"):
			System.out.println("Sistema sendo reiniciado...");
			break;
		default:
			System.out.println("Comando não reconhecido.");
		}
	}
	
	/*
	 * 	Exemplo de uso do switch como expressões.
	 * 	Define quantos dias tem o mês indicado (sem considerar o ano bissexto).
	 * 	** Nessessário JDK 14 **
	 */
	public static void switchExpressao(int mes) {
		
		int nDias = switch (mes) {
		
		case 1, 3, 5, 7, 8, 10, 12 -> 31;
		case 4, 6, 9, 11 -> 30;
		default -> 28;
		};
		
		System.out.println("O m�s " + mes + " possui " + nDias + " dias.");
	}
	
	/*
	 * 	Exemplo de uso da diretiva break.
	 * 	Procura "y" múltiplos de um número "x" no intervalo de 1 a 1000.
	 */
	public static void exemploBreak(int x, int y) {
		
		int total = 0;

		for (int i = 1; i < 1000; i++) {
			
			if (i % x == 0) {
				
				total++;
				System.out.print(i + " ");
			}
			
			if (total == y) break;
		}
		
		System.out.println("");
	}
	
	/*
	 * 	Exemplo de uso da diretiva continue.
	 *  Imprime todos os números de 1 a "n", menos os múltiplos de "x".
	 */
	public static void exemploContinue(int x, int n) {
		
		for (int i = 1; i < n; i++) {
			
			if (i % x == 0) continue;	// Força o incremento e avalição da variável i.
			System.out.print(i + " ");
		}
		
		System.out.println("");
	}

	public static void main(String[] args) {

		paComFor(1, 2, 10);
		paComFor(10, -1, 10);

		int array[] = { 0, 14, 27, 56, 102, 314, 278 };
		forAvancado(array);

		int pg[] = progressaoGeo(3, 2, 10);
		forAvancado(pg);

		regressivaWhile(10);
		// jogoDaBanana();

		exemploComIfelse(10);
		exemploComIfelse(0);
		exemploComIfelse(-10);
		
		exemploSwitch(0);
		exemploSwitch(1);
		exemploSwitch(2);
		exemploSwitchString("ligar");
		exemploSwitchString("Desligar");
		exemploSwitchString("Reiniciar");
		exemploSwitchString("Imprimir");
		
		exemploBreak(3, 20);
		exemploContinue(10, 30);
		switchExpressao(12);
	}
}

/*
1 3 5 7 9 11 13 15 17 19 
10 9 8 7 6 5 4 3 2 1 
0 14 27 56 102 314 278 
3 6 12 24 48 96 192 384 768 1536 
10 9 8 7 6 5 4 3 2 1 0 !
10 9 8 7 6 5 4 3 2 1 
max = 0
max < 0
Estado: Desligado.
Estado: Ligado.
Estado: Indefinido.
Sistema sendo iniciado...
Sistema sendo desligado...
Sistema sendo reiniciado...
Comando não reconhecido.
3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 51 54 57 60 
1 2 3 4 5 6 7 8 9 11 12 13 14 15 16 17 18 19 21 22 23 24 25 26 27 28 29 
*/
