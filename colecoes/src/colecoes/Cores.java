package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();
		
		// Solicita que o usuário entre com as 5 cores
		for(int cont = 1; cont <= 5; cont++) {
			System.out.println("Digite a " + cont + "ª cor: ");
			String cor = leia.nextLine();
			cores.add(cor);	
		}
			
		//Exibe todas as cores adicionadas
		System.out.println(cores);
		
		//Ordena em ordem crescente
		Collections.sort(cores);
		
		//Exibe as cores em ordem crescente
		System.out.println("Cores em ordem crescente: " + cores);
		
		leia.close();
			
	}

}
