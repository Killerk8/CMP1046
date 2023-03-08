package lista2;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valor,porcent,desconto;
		
		System.out.print("Digite o valor do produto: ");
		valor = ler.nextDouble();
		
		System.out.print("Digite a porcentagem de desconto: ");
		porcent = ler.nextDouble();

		desconto = (((100 - porcent)/100) * valor);
		
		System.out.println("Valor do produto.............: " + valor);
		System.out.println("Valor da porcentagem.........: " + porcent + "%");
		System.out.println("Valor do produto com desconto: " + desconto);
	}

}
