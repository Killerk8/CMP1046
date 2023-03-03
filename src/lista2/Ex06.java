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
		
		valorQW = (1/7) * (salario);
		
		new DecimalFormat(".##").format(valorQW);		
		
		System.out.print("Valor em Reais de cada Quilowatts: " + valorQW);
	}

}
