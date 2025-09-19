package colecoes;

import java.util.Scanner;
import java.util.Stack;

public class EstruturaDados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();
        int opcao;

        do {
            // Menu
            System.out.println("\n--- MENU PILHA DE LIVROS ---");
            System.out.println("1 - Adicionar um livro");
            System.out.println("2 - Listar todos os livros");
            System.out.println("3 - Retirar um livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String livro = leia.nextLine();
                    pilha.push(livro); // adiciona no topo da pilha
                    System.out.println("Livro adicionado!");
                    break;

                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("Livros na pilha: " + pilha);
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        String retirado = pilha.pop(); // remove o topo da pilha
                        System.out.println("Livro retirado: " + retirado);
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        leia.close();
    }
}