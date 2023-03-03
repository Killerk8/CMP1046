package lista2;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valor;
		
		System.out.print("Digite o valor do emprestimo: ");
		valor = ler.nextDouble();
		
		System.out.println("Valor das prestaçoes do emprestimo");
		System.out.println("1x  "  + ((valor * 0.4) + valor));
		System.out.println("2x  "  + ((valor * 0.8) + valor));
		System.out.println("3x  "  + ((valor * 0.12) + valor));
		System.out.println("4x  "  + ((valor * 0.16) + valor));
		System.out.println("5x  "  + ((valor * 0.20) + valor));
		System.out.println("6x  "  + ((valor * 0.24) + valor));
		System.out.println("7x  "  + ((valor * 0.28) + valor));
		System.out.println("8x  "  + ((valor * 0.32) + valor));
		System.out.println("9x  "  + ((valor * 0.36) + valor));
		System.out.println("10x " + ((valor * 0.40) + valor));
		System.out.println("11x " + ((valor * 0.44) + valor));
		System.out.println("12x " + ((valor * 0.48) + valor));

	}

}
