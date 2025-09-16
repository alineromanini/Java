package repeticoes;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao = 1;

		do {

			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

		} while (opcao == 0);

		leia.close();
	}

}
