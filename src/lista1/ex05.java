package lista1;
import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valor,desconto;
		
		System.out.print("Valor do produto: ");	
		valor = ler.nextDouble();
		
		desconto = valor - (valor * 0.09);
		
		System.out.print("Valor com desconto de 9%: R$" + desconto);	

	}

}
