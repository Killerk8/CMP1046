package lista2;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um valor: ");
		numero = ler.nextInt();
		
		System.out.println("O numero " + numero + " tem seu antecessor " + (numero-1) + " e seu sucessor " + (numero+1));

	}

}
