package lista3;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int seg,horas,minutos,segundos;
		
		System.out.print("Digite os segundos: ");
		seg = ler.nextInt();
		
		segundos = (seg % 3600) % 60;
		minutos = (seg % 3600) / 60;;
		horas = seg/3600;
		
		System.out.print(horas + ":" + minutos + ":" + segundos);

	}

}
