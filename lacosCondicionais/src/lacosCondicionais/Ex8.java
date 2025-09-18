package lacosCondicionais;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		float saldo = 1000, valor;
		int codigo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o código da operação de 1 a 3: \n");
		codigo = leia.nextInt();
		
		switch (codigo) {
        case 1:
            System.out.printf("Operação - Saldo\nSaldo: R$ %.2f", saldo);
            break;

        case 2:
            System.out.println("Valor: ");
            valor = leia.nextFloat();
            if(valor <= saldo) {
            	saldo -= valor;
            	System.out.printf("Operação - Saque\nNovo saldo: R$ %.2f", saldo);
            } else {
            	System.out.printf("Operação - Saque \nSaldo insuficiente!");
            }
     
            break;
            
        case 3:
        	System.out.println("Valor: ");
            valor = leia.nextFloat();
            saldo += valor;
            System.out.printf("Operação - Depósito\nNovo saldo: R$ %.2f", saldo);
             
            break;

        default:
            System.out.println("Operação inválida!");
		}   
         leia.close();
	}

}
