package lista1;
import java.util.Scanner;


public class ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double dep,taxa,rend,total;
		
		System.out.print("Digite o valor do deposito: ");
		dep = ler.nextDouble();
		
		System.out.print("Digite o valor da taxa: ");
		taxa = ler.nextDouble();
		
		rend = (dep/100);
		total = dep+rend;
		
		System.out.println("Valor do rendimento: " + rend);
		System.out.println("Valor com o rendimento: " + total);
		
	}

}
