package lista3;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	double inicio,fim,combustivel,valor,lucro,consumo;
	
	System.out.println("Marcação do odômetro.");
	System.out.print("Inicio......................: ");
	inicio = ler.nextDouble();
	System.out.print("Fim.........................: ");
	fim = ler.nextDouble();
	System.out.print("Litros de gasolina gastos...: ");
	combustivel = ler.nextDouble();
	System.out.print("Quantia recebida em dinheiro: ");
	valor = ler.nextDouble();
				
	consumo = (fim - inicio)/combustivel;
	lucro = valor - (consumo * 1.72);
	
	System.out.println("Media de consumo em Km: " + consumo + "Km.");
	System.out.println("Lucro liquido do dia..: R$" + lucro);
	
	}

}
