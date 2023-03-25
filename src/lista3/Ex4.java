package lista3;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int funcionarios,vendas;
		double salarioMin,precCusto,salarioTotal,vendasAc,comissao,lucroLoja;

		System.out.print("Numeros de funcionarios....: ");
		funcionarios = ler.nextInt();
		System.out.print("Salario minimo.............: ");
		salarioMin = ler.nextDouble();
		System.out.print("Preço de custo da bicicleta: ");
		precCusto = ler.nextDouble();
		System.out.print("Quantia de vendas..........: ");
		vendas = ler.nextInt();
		
		vendasAc = (precCusto*0.5 + precCusto) * vendas;
		comissao = (precCusto * 0.15) * vendas;
		salarioTotal = salarioMin*2 + (comissao/funcionarios);
		lucroLoja = vendasAc - salarioTotal;
		
		System.out.println();
		System.out.println("O slario de cada empregado: " + salarioTotal);
		System.out.println("Lucro liquido da loja.....: " + lucroLoja);
	}

}
