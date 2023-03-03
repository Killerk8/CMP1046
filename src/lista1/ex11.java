package lista1;
import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int horas,minutos,segundos,x;
		
		System.out.println("Digite o horario: ");
		System.out.print("Horas: ");
		horas = ler.nextInt();
		
		System.out.print("Minutos: ");
		minutos = ler.nextInt();
		
		System.out.print("Segundos: ");
		segundos = ler.nextInt();
		
		x = ((((horas*60) + minutos)*60) + segundos);
		
		System.out.print("Já se passaram " + x + " segundos desde que o dia começou.");

	}

}
