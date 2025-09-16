package repeticoes;

import java.util.Scanner;

public class Ex5_lista3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, somaNum = 0;

		do {

			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if(numero > 0) {
				somaNum += numero;
			}
		

		} while (numero != 0);
		
		System.out.printf("A soma dos números positivos é: %d%n", somaNum);

		leia.close();
	}

}
