package colecoes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("Laranja");
		frutas.add("Abacate");
		frutas.add("Banana");
		
		System.out.println(frutas); //imprime na ordem dos hashcodes
		
		for(String fruta: frutas) {
			System.out.println(fruta.hashCode());
		}
		
		frutas.remove("Abacate");
		System.out.println(frutas);
		
		System.out.println("A fruta amora está presente no set?" + frutas.contains("Amora"));
		
		System.out.println("O set está vazio?" + frutas.isEmpty());
		
		Iterator<String> itFrutas = frutas.iterator();
		
		while(itFrutas.hasNext()) { //hasNext é o método e itFrutas é o objeto
			System.out.println(itFrutas.next());
		}
		
		// Ordenar a lista. Para isso primeiro precisamos utilizar o ArrayList 
		ArrayList<String> frutasList = new ArrayList<String>();
		
		//add a coleção set n ArrayList
		frutasList.addAll(frutas);
		
		//ordenação dos dados em ordem crescente
		frutasList.sort(null);
		
		System.out.println(frutasList);
		
		//ordenação dos dados em ordem decrescente. para funcionar precisar ordenar primeiro 
		frutasList.sort(Comparator.reverseOrder());
		
		System.out.println(frutasList);
		
	}

}
