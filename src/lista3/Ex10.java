package lista3;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valorHora,salarioBruto,ir,inss,sindicato,totalDescontos,salarioLiquido;
		int horasTrabalhadas;

		System.out.print("Informe o valor da sua hora de trabalho: ");
		valorHora = ler.nextDouble();
		
		System.out.print("Informe o número de horas trabalhadas no mês: ");
		horasTrabalhadas = ler.nextInt();
		
		salarioBruto = valorHora * horasTrabalhadas;
        ir = salarioBruto * 0.11;
        inss = salarioBruto * 0.08;
        sindicato = salarioBruto * 0.05;
        totalDescontos = ir + inss + sindicato;
        salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.println("+ Salário Bruto: R$" + salarioBruto);
        System.out.println("- IR (11%): R$" + ir);
        System.out.println("- INSS (8%): R$" + inss);
        System.out.println("- Sindicato (5%): R$" + sindicato);
        System.out.println("= Salário Líquido: R$" + salarioLiquido);
	}

}
