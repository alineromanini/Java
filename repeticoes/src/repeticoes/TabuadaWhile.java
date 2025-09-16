package repeticoes;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
		int cont = 1;

		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();

		while (cont <= 10) {

			System.out.printf("%d x %d = %d%n", numero, cont, numero * cont);
			cont++;
		}

		leia.close();
	}

}
