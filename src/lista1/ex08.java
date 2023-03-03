package lista1;
import java.util.Scanner;
public class ex08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double lado,perimetro,area;
		
		System.out.print("Digite o tamanho do lado do quadrado: ");
		lado = ler.nextDouble();
		
		area = lado * lado;
		perimetro = 4 * lado;

		System.out.println("Area do quadrado: " + area + "m^2");
		System.out.println("Perimetro do quadrado: " + perimetro);
	}

}
