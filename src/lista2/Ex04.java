package lista2;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valor,imposto;
		
		System.out.print("Digite o valor do carro: ");
		valor = ler.nextDouble();
		
		imposto = valor * 0.27;
		
		System.out.print("Valor do carro com impostos: " + (imposto + valor));

	}

}
