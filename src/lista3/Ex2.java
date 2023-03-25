package lista3;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int anoNasc, ano;
		
		System.out.print("Digite o seu ano de nascimento:");
		anoNasc = ler.nextInt();
		
		System.out.print("Digite o ano atual: ");
		ano = ler.nextInt();
		
		System.out.println("Sua idade........: " + (ano - anoNasc) + " anos.");
		System.out.println("Sua idade em 2030: " + (2030 - anoNasc) + " anos.");
	}

}
