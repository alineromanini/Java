

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nomes[] = { "Cintia", "Stella", "Patricia", "Rafaela", "Letícia", "Jamila" };

		int numeros[] = new int[5]; // pra definir vetores vazios

		System.out.println("Listagem - Vetor de nomes");
		
		//Ordenar o vetor
		
		Arrays.sort(nomes); //arrays é a classe e o sort é o método
		
		Arrays.sort(nomes, Collections.reverseOrder()); //reverte a ordem dos vetores

		for (int indice = 0; indice < nomes.length; indice++) { // o length define o tamanho do vetor
			System.out.printf("nomes[%d] = %s%n", indice, nomes[indice]);
		}

		System.out.println("\nInput de dados - Vetor de números");

		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.println("Digite um número: ");
			numeros[indice] = leia.nextInt();
		}

		Arrays.sort(numeros); //sortear os números
		
		System.out.println("Listagem - Vetor de números");

		for (int indice = 0; indice < numeros.length; indice++) { // o length define o tamanho do vetor
			System.out.printf("numeros[%d] = %d%n", indice, numeros[indice]);
		}

		leia.close();

	}

}
