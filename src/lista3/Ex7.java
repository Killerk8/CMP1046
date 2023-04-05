package lista3;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double metros,decimetros,centimetros,milimetros;
		
		System.out.print("Digite o valor em metros: ");
		metros = ler.nextDouble();
		
		decimetros = metros * 10;
		centimetros = metros * 100;
		milimetros = metros * 1000;
		
		System.out.printf("%.2f metros equivalem a:\n", metros);
        System.out.printf("%.2f decímetros\n", decimetros);
        System.out.printf("%.2f centímetros\n", centimetros);
        System.out.printf("%.2f milímetros\n", milimetros);
	}

}
