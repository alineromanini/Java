package repeticoes;

import java.util.Scanner;

public class ex2_lista3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num, totalPar = 0, totalImpar = 0;

		for (int cont = 1; cont <= 10; cont++) {
			System.out.println("Digite o " + cont + "º número: ");
			num = leia.nextInt();
			if (num % 2 == 0) {
				totalPar++;
			} else {
				totalImpar++;
			}
		}

		System.out.printf("Total de números pares: %d%n", totalPar);
		
		System.out.printf("Total de números ímpares: %d%n", totalImpar);

		leia.close();
	}

}
