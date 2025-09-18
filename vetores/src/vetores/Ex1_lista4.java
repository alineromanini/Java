package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1_lista4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero;

		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();

		for (int cont = 0; cont < vetor.length; cont++) {
			if (numero == vetor[cont]) {
				System.out.printf("O número %d está localizado na posição: %d", numero, cont);
				return;
			}
		}

		System.out.println("O número " + numero + " não foi encontrado!");
	}
}