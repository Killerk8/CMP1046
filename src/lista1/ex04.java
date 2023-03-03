package lista1;
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int qtdap;
		double diaria,promo,val1,val2,val3;
		
		System.out.print("Quantidade de apartamentos: ");		
		qtdap = ler.nextInt();
		
		System.out.print("Valor da diaria: ");
		diaria = ler.nextDouble();
		
		promo = diaria - (diaria * 0.25);
		val1 = promo * qtdap;
		val2 = (qtdap * 0.7) * promo;
		val3 = qtdap * diaria;
		
		System.out.println("valor promocional da diaria: " + promo);	
		System.out.println("valor total a ser arrecadado caso a ocupação neste final de semana atinja 100%: " + val1);	
		System.out.println("valor total a ser arrecadado caso a ocupação neste final de semana atinja 70%: " + val2);	
		System.out.println("valor que o hotel deixará de arrecadar em virtude da promoção, caso a ocupação atinja 100%: " + val3);	
	}

}
