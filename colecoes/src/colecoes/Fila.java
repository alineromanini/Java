package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>(); // CTRL + SHIFT + O para importar a biblioteca

		fila.add("Maria");
		fila.add("Aline");
		fila.add("Letícia");
		fila.add("Cintia");
		fila.add("Rayssa");

		System.out.println(fila);

		// Retirar um elemento da fila
		fila.remove(); // remove o primeiro elemento

		System.out.println(fila);

		fila.add("Milena");
		fila.add("Nadia");

		System.out.println(fila);

		System.out.println("O tamanho da fila é: " + fila.size());

		System.out.println("A primeira pessoa da fila é: " + fila.peek());

		for (var pessoa : fila) { // var para nao fixar o tipo de variável pessoa, posso alterar, mas tem que ser
									// igual do objeto fila
			System.out.println(pessoa);

		}
	}

}
