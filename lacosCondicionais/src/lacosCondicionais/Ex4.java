package lacosCondicionais;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a primeira palavra: ");
		String palavra1 = leia.nextLine();

		System.out.println("Digite a segunda palavra: ");
		String palavra2 = leia.nextLine();

		System.out.println("Digite a terceira palavra: ");
		String palavra3 = leia.nextLine();

		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("ave")) {
				if (palavra3.equalsIgnoreCase("carnívoro")) {
					System.out.println("Águia");
				} else if (palavra3.equalsIgnoreCase("onívoro")) {
					System.out.println("Pomba");
				}
			} else if (palavra2.equalsIgnoreCase("mamífero")) {
				if (palavra3.equalsIgnoreCase("onívoro")) {
					System.out.println("Homem");
				} else if (palavra3.equalsIgnoreCase("herbívoro")) {
					System.out.println("Vaca");
				}
			}
		} else if (palavra1.equalsIgnoreCase("invertebrado")) {
			if (palavra2.equalsIgnoreCase("inseto")) {
				if (palavra3.equalsIgnoreCase("hematófago")) {
					System.out.println("Pulga");
				} else if (palavra3.equalsIgnoreCase("herbívoro")) {
					System.out.println("Lagarta");
				}
			} else if (palavra2.equalsIgnoreCase("anelídeo")) {
				if (palavra3.equalsIgnoreCase("hematófago")) {
					System.out.println("Sanguessuga");
				} else if (palavra3.equalsIgnoreCase("onívoro")) {
					System.out.println("Minhoca");
				}
			}
		}

		leia.close();
	}
}
