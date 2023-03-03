package lista1;
import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int tempF;
		double tempC; 
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		tempF = ler.nextInt();
		
		tempC = (tempF - 32)*5/9;
		
		
		System.out.println("Temperatura em Fahrenheit: " + tempF);
		System.out.println("Temperatura em Celcius: " + tempC);

	}

}
