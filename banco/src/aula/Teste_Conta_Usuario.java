package aula;
import java.util.Scanner;

public class Teste_Conta_Usuario {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Conta cn=null;
		ContaEspecial ce=null;
		int opc, tipo, n;
		double si, li, valor;
		
		System.out.print("Deseja criar uma conta (1- normal, 2- Especial): ");
		tipo = leia.nextInt();
		
		if (tipo ==1) {
			System.out.print("N�mero: ");
			n = leia.nextInt();
			System.out.print("Saldo  : ");
			si = leia.nextDouble();
			cn = new Conta(n, si);
			cn.exibe();
		}
		else {
			System.out.print("N�mero: ");
			n = leia.nextInt();
			System.out.print("Saldo  : ");
			si = leia.nextDouble();
			System.out.print("Limite : ");
			li = leia.nextDouble();
			ce = new ContaEspecial(n, si, li);
			ce.exibe();
		}
				// Menu com: 1-Cr�dito/ 2-D�bito/ 3-Exibir/ 0-finalizar
		do {
			System.out.println("Menu: \n1-Cr�dito\n2-D�bito\n3-Exibir\n0-finalizar\n");
			System.out.print("Escolha um item do menu: ");
			opc = leia.nextInt();
			switch ( opc ){
				case 1: System.out.println("===  Cr�dito  ===");
						System.out.println("Digite um valor para o cr�dito: ");
						valor = leia.nextDouble();
						if ( tipo==1) cn.credito(valor);
							else ce.credito(valor);
					break;
				case 2:	System.out.println("===  D�bito  ===");
						System.out.println("Digite um valor para o d�bito: ");
						valor = leia.nextDouble();
						if ( tipo==1) cn.debito(valor);
								else ce.debito(valor);
					
					break;
				case 3:	System.out.println("===  Exibir  ===");	
						if ( tipo==1) cn.exibe();
								else ce.exibe();
					break;
				case 0:	System.out.println("-===  Sair  ===");
						System.out.println("Digite 0 pra sair!");
						opc = leia.nextInt();
					break;
				default: System.out.println("\n--==<< Op��o inv�lida! >>==--\n");	
			}
			
		} while( opc != 0  );
		
		
		System.out.println("Fim do Programa!");
	}

}
