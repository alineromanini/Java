package vetores;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeros[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		float numerosReais[][] = new float[3][2];
		
		System.out.println("Mostrar valores matriz números");

		for (int linha = 0; linha < numeros.length; linha++) { // Percorre as linhas
			for (int coluna = 0; coluna < numeros.length; coluna++) { // Percorre as colunas
				System.out.printf("numeros[%d][%d] = %d%n", linha, coluna, numeros[linha][coluna]);
			}
		}
		
		System.out.println("\nInput de dados - Matriz números reais");

		for (int linha = 0; linha < numerosReais.length; linha++) { // Percorre as linhas
			for (int coluna = 0; coluna < numerosReais[linha].length; coluna++) { // Percorre as colunas
				System.out.println("Digite um número: ");
				numerosReais[linha][coluna] = leia.nextFloat();
			}
		}
		
		System.out.println("Mostrar valores matriz números reais");

		for (int linha = 0; linha < numerosReais.length; linha++) { // Percorre as linhas
			for (int coluna = 0; coluna < numerosReais[linha].length; coluna++) { // Percorre as colunas
				System.out.printf("numeros reais[%d][%d] = %.0f%n", linha, coluna, numerosReais[linha][coluna]);
			}
		}

		leia.close();
	}

}
