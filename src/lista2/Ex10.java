package lista2;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double salario,inss,ipr,salariolqd;
		
		System.out.print("Digite o valor do salario: ");
		salario = ler.nextDouble();
		
		inss = salario * 8/100;
		ipr = (salario - inss) * 15/100; 
		salariolqd = salario - inss - ipr;
		
		System.out.println("Valor do INSS....: " + inss);
		System.out.println("Imposto de renda.: " + ipr);
		System.out.println("Salario informado: " + salario);
		System.out.println("Salario liquido..: " + salariolqd);

	}

}
