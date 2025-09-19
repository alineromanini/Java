package colecoes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila_lista4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();
		int opcao;

		do {

			System.out.println("***********************************************************");
			System.out.println("          1 - Adicionar Cliente na Fila");
			System.out.println("          2 - Listar todos os Clientes");
			System.out.println("          3 - Retirar cliente da Fila");
			System.out.println("          0 - Sair");
			System.out.println("***********************************************************");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine(); // limpa o buffer

			switch (opcao) {
			case 1: // adicionar cliente na fila

				System.out.println("Digite o nome do cliente para ser adicionado à fila: ");
				String cliente = leia.nextLine();
				fila.add(cliente);

				System.out.println("Cliente adicionado!");
				leia.skip("\\R"); // ignora o \n ou o enter do buffer
				break;

			case 2: // listar todos os clientes

				System.out.println(fila);
				leia.skip("\\R"); // ignora o \n ou o enter do buffer
				break;

			case 3: // retirar cliente da fila
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					fila.remove();
					System.out.println(fila);
				}
				leia.skip("\\R");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");

			case 0:
				System.out.println("Programa finalizado.");
			}

		} while (opcao != 0);

		leia.close();
	}

}
