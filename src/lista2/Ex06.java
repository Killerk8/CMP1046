package lista2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// new DecimalFormat(".##").format(x);
		
		Scanner ler = new Scanner(System.in);
		
		double salario,qwatts,valorQW,valorReais,valorDesconto;
		
		System.out.print("Digite o valor do salario: ");
		salario = ler.nextDouble();
		
		System.out.print("Digite o consumo de Quilowatts: ");
		qwatts = ler.nextDouble();
		
		valorQW = ((salario * 1/7) / 100);
		valorReais = (salario * 1/7);
		valorDesconto = valorReais * 0.90;
		
		System.out.printf("Valor em Reais de cada Quilowatts: %.2f \n",valorQW);
		System.out.printf("Valor em Reais a ser pago: %.2f \n",valorReais);
		System.out.printf("Valor com desconto: %.2f",valorDesconto);
	}

}
