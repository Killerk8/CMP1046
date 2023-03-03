package lista1;
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double qtdDoll,cot,qtReal;
		
		System.out.print("Quantidade de dólares no cofre: ");	
		qtdDoll = ler.nextDouble();
		
		System.out.print("cotação do dólar: ");	
		cot = ler.nextDouble();
		
		qtReal = qtdDoll * cot;
		
		System.out.print("Quantia em Reais: R$" + qtReal);	
		
	}

}
