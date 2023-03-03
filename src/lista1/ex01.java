package lista1;
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		double n1,n2,n3,n4,mp;
		
		Scanner ler = new Scanner(System.in);
	
		System.out.print("Digite o valor do primeiro numero: ");
		n1 = ler.nextDouble();
		
		System.out.print("Digite o valor do segundo numero: ");
		n2 = ler.nextDouble();
		
		System.out.print("Digite o valor do terceiro numero: ");
		n3 = ler.nextDouble();
		
		System.out.print("Digite o valor do quarto numero: ");
		n4 = ler.nextDouble();

		mp = ((n1*1) + (n2*2) + (n3*3) + (n4*4)) /10;
		
		System.out.print("Valor da media ponderada: " + mp);
	}
	

}
