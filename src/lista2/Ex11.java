package lista2;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valor1,valor2;
		
		System.out.print("Digite o primeiro valor....: ");
		valor1 = ler.nextDouble();
		
		System.out.print("Digite o segundo valor.....: ");
		valor2 = ler.nextDouble();
		
		System.out.println("Valor do primeiro numero.: " + valor1);
		System.out.println("Valor do segundo numero..: " + valor2);
		
		System.out.print("Digite um valor............: ");
		valor1 = ler.nextDouble();
		
		System.out.print("Digite outro valor.........: ");
		valor2 = ler.nextDouble();
		
		System.out.println("Valor dos  numeros atualizados");
		System.out.println("Valor do primeiro numero.: " + valor1);
		System.out.println("Valor do segundo numero..: " + valor2);
	}

}
