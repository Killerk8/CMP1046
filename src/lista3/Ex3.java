package lista3;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		double altura,comprimento,largura,azulejos,area;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite as dimensões da cozinha.");
		System.out.print("Comprimento: ");
		comprimento = ler.nextDouble();
		System.out.print("Altura.....: ");
		altura = ler.nextDouble();
		System.out.print("Largura....: ");
		largura = ler.nextDouble();
		
		area = largura * comprimento;
		azulejos = area/1.5;
		
		System.out.println("Irá utilizar: " + azulejos + " azulejos.");
	}

}
