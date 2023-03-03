package lista1;
import java.util.Scanner;
public class ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double compra;
		
		System.out.print("Valor da compra: ");
		compra = ler.nextDouble();
		
		System.out.println("Valor da compra dividido em 1x: " + (compra/1));
		System.out.println("Valor da compra dividido em 2x: " + (compra/2));
		System.out.println("Valor da compra dividido em 3x: " + (compra/3));
		System.out.println("Valor da compra dividido em 4x: " + (compra/4));
		System.out.println("Valor da compra dividido em 5x: " + (compra/5));
		
		

	}

}
