package lista3;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número de 1 a 10: ");
		numero = ler.nextInt();
		
		 System.out.printf("Tabuada do %d:\n", numero);		
		 System.out.println("1 x " + numero + " = " + (1 * numero));
	     System.out.println("2 x " + numero + " = " + (2 * numero));
	     System.out.println("3 x " + numero + " = " + (3 * numero));
	     System.out.println("4 x " + numero + " = " + (4 * numero));
	     System.out.println("5 x " + numero + " = " + (5 * numero));
	     System.out.println("6 x " + numero + " = " + (6 * numero));
	     System.out.println("7 x " + numero + " = " + (7 * numero));
	     System.out.println("8 x " + numero + " = " + (8 * numero));
	     System.out.println("9 x " + numero + " = " + (9 * numero));

	}

}
