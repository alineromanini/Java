package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>(); //Collections 

		numeros.add(5);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(5);

		System.out.println(numeros);

		System.out.println("Exibir o elemento na posição 2: " + numeros.get(2));

		System.out.println("Exibir o índice do elemento 10: " + numeros.indexOf(10));
		
		//System.out.println("Exibir o índice do elemento 5: " + numeros.indexOf(3));

		numeros.set(numeros.indexOf(3), 4); //troca as posições

		numeros.remove(numeros.indexOf(5)); //remove o primeiro elemento de posição 5
		
		//For each que só pode ser utilizado pra estrutura de dados
		for(int numero: numeros) {
			System.out.println(numero);
		}

		System.out.println("Tamanho da lista: " + numeros.size());
		
		System.out.println("A lista está vazia?" + numeros.isEmpty());
		
		System.out.println("O numero 8 está na lista?" + numeros.contains(8));

	}

}
