/*
 * É desejado um programa que seja capaz de imprimir no console o valor por extenso de um número inteiro recebido como argumento.
 * O valor recebido deve estar dentro do intervalo [0, 99]. Valores maiores ou menores devem ser desconsiderados e uma mensagem 
 * apropriada deve ser exibida. 
 * 
 */
package studies_with_java.capitulo2_exercicios;

public class Exercicio9 {
	
	public static void teste(int x) {
		
		String [] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		String [] unidades_dez = {"onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
		String [] dezenas = {"dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"}; 
		
		if (x >= 0 && x <= 9) {
			
			System.out.println(x + " = " + unidades[x]);
		}
		else if (x >= 11 && x <= 19) {
			
			int resto = x % 10;
			System.out.println(x + " = " + unidades_dez[resto-1]);
		}
		else {		// Então x == 10 ou (x >= 20 && x <= 99)
			
			int resto = x % 10;
			int indice = x / 10;
			if (resto == 0) System.out.println(x + " = " + dezenas[indice-1]);
			else System.out.println(x + " = " + dezenas[indice-1] + " e " + unidades[resto]);
		}
		
	}

	public static void main(String[] args) {

		String [] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		String [] unidades_dez = {"onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
		String [] dezenas = {"dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"}; 
				
		try {
			
			if (args.length > 0) {
				
				int x = Integer.parseInt(args[0]);
				if (x >= 0 && x <= 99) {
					
					if (x >= 0 && x <= 9) {
						
						System.out.println(x + " = " + unidades[x]);
					}
					else if (x >= 11 && x <= 19) {
						
						int resto = x % 10;
						System.out.println(x + " = " + unidades_dez[resto-1]);
					}
					else {		// Então x == 10 ou (x >= 20 && x <= 99)
						
						int resto = x % 10;
						int indice = x / 10;
						if (resto == 0) System.out.println(x + " = " + dezenas[indice-1]);
						else System.out.println(x + " = " + dezenas[indice-1] + " e " + unidades[resto]);
					}
					
				}
				else {
					
					System.out.println("Número fora do intervalo de 0 a 99.");
				}
			}
			else {
				
				System.out.println("Nenhum número informado.");
			}
			
		} catch (Exception e) {
			
			System.out.println("Entrada inválida.");
		}
		
		
		// Testando que é possível contar por extenso até 99.
		/*for (int i = 0; i < 100; i++) {
			
			teste(i);
		}*/
		
	}

}

/*
0 = zero
1 = um
2 = dois
3 = três
4 = quatro
5 = cinco
6 = seis
7 = sete
8 = oito
9 = nove
10 = dez
11 = onze
12 = doze
13 = treze
14 = catorze
15 = quinze
16 = dezesseis
17 = dezessete
18 = dezoito
19 = dezenove
20 = vinte
21 = vinte e um
22 = vinte e dois
23 = vinte e três
24 = vinte e quatro
25 = vinte e cinco
26 = vinte e seis
27 = vinte e sete
28 = vinte e oito
29 = vinte e nove
30 = trinta
31 = trinta e um
32 = trinta e dois
33 = trinta e três
34 = trinta e quatro
35 = trinta e cinco
36 = trinta e seis
37 = trinta e sete
38 = trinta e oito
39 = trinta e nove
40 = quarenta
41 = quarenta e um
42 = quarenta e dois
43 = quarenta e três
44 = quarenta e quatro
45 = quarenta e cinco
46 = quarenta e seis
47 = quarenta e sete
48 = quarenta e oito
49 = quarenta e nove
50 = cinquenta
51 = cinquenta e um
52 = cinquenta e dois
53 = cinquenta e três
54 = cinquenta e quatro
55 = cinquenta e cinco
56 = cinquenta e seis
57 = cinquenta e sete
58 = cinquenta e oito
59 = cinquenta e nove
60 = sessenta
61 = sessenta e um
62 = sessenta e dois
63 = sessenta e três
64 = sessenta e quatro
65 = sessenta e cinco
66 = sessenta e seis
67 = sessenta e sete
68 = sessenta e oito
69 = sessenta e nove
70 = setenta
71 = setenta e um
72 = setenta e dois
73 = setenta e três
74 = setenta e quatro
75 = setenta e cinco
76 = setenta e seis
77 = setenta e sete
78 = setenta e oito
79 = setenta e nove
80 = oitenta
81 = oitenta e um
82 = oitenta e dois
83 = oitenta e três
84 = oitenta e quatro
85 = oitenta e cinco
86 = oitenta e seis
87 = oitenta e sete
88 = oitenta e oito
89 = oitenta e nove
90 = noventa
91 = noventa e um
92 = noventa e dois
93 = noventa e três
94 = noventa e quatro
95 = noventa e cinco
96 = noventa e seis
97 = noventa e sete
98 = noventa e oito
99 = noventa e nove
*/


