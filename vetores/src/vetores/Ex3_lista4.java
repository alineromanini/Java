package vetores;

import java.util.Scanner;

public class Ex3_lista4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int matriz[][] = new int[3][3];

		String diagonalPrincipal = "", diagonalSecundaria = "";

		int somaPrincipal = 0, somaSecundaria = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("matriz[%d][%d] = ", linha, coluna);
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		// Exibir e somar os elementos da diagonal principal
		for (int indice = 0; indice < matriz.length; indice++) {
			diagonalPrincipal += matriz[indice][indice] + " ";
			somaPrincipal += matriz[indice][indice];
		}
		// Exibir e somar os elementos da diagonal secundária
		for (int indice = 0; indice < matriz.length; indice++) {
			diagonalSecundaria += matriz[indice][2 - indice] + " ";
			somaSecundaria += matriz[indice][2 - indice];
		}

		System.out.println("Elementos da diagonal principal: " + diagonalPrincipal);
		System.out.println("Elementos da diagonal secundária: " + diagonalSecundaria);
		System.out.println("Soma dos elementos da diagonal principal: " + somaPrincipal);
		System.out.println("Soma dos elementos da diagonal secundária: " + somaSecundaria);
	}

}
