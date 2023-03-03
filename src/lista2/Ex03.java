package lista2;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int anos,meses,dias,total;
		
		System.out.println("Digite sua idade");
		System.out.print("Anos: ");
		anos = ler.nextInt();
		
		System.out.print("Meses: ");
		meses = ler.nextInt();
		
		System.out.print("Dias: ");
		dias = ler.nextInt();
		
		total = (anos*360) + (meses*30) + dias;
		
		System.out.print("Sua idade em dias: " + total);

	}

}
