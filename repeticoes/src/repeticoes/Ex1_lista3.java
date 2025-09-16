package repeticoes;

import java.util.Scanner;

public class Ex1_lista3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();

		for (int cont = 1; cont <= 10; cont++) {

			System.out.printf("%d x %d = %d%n", numero, cont, numero * cont);
		}

		leia.close();
	}

}
