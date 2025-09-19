package colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex3_collections {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// criando a collection set de integer

		Set<Integer> numeros = new HashSet<Integer>();

		System.out.println("Digite 10 números inteiros (não repetidos):");

		while (numeros.size() < 10) {
			System.out.println("Número " + (numeros.size() + 1) + ": ");
			int valor = leia.nextInt();

			if (!numeros.add(valor)) {
				System.out.println("Valor já existe. Digite outro número.");
			}
		}

		// exibindo todos os elementos com iterator
		System.out.println("\nElementos do Set:");
		Iterator<Integer> it = numeros.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		leia.close();
	}
}