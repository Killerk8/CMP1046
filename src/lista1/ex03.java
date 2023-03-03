package lista1;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double peso, altura,mc;
		
		System.out.print("Digite o seu peso em Kg: ");
		peso = ler.nextDouble();
		
		System.out.print("Digite sua altura em metros: ");
		altura = ler.nextDouble();
		
		mc = peso / (altura * altura);
		
		System.out.print("Sua massa corporal: " + mc);

	}

}
