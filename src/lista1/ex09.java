package lista1;
import java.util.Scanner;
public class ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int saque,nota100,nota50,nota20,nota10,nota5,nota2,nota1;
		
		System.out.print("Digite o valor a ser sacado: ");
		saque = ler.nextInt();
		
		nota100 = saque/100;
		nota50 = (saque%100)/50;
		nota20 = ((saque%100)%50)/20;
		nota10 = (((saque%100)%50)%20)/10;
		nota5 = ((((saque%100)%50)%20)%10)/5;
		nota2 = (((((saque%100)%50)%20)%10)%5)/2;
		nota1 = ((((((saque%100)%50)%20)%10)%5)%2)/1;
		
		System.out.println("Sera necessario a quantia de");
		System.out.println("Notas de R$100: " + nota100);
		System.out.println("Notas de R$50: " + nota50);
		System.out.println("Notas de R$20: " + nota20);
		System.out.println("Notas de R$10: " + nota10);
		System.out.println("Notas de R$5: " + nota5);
		System.out.println("Notas de R$2: " + nota2);
		System.out.println("Notas de R$1: " + nota1);
		

	}

}
