package lista1;
import java.util.Scanner;
public class ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int cTerreno,lTerreno,cCasa,lCasa,aLivre,aTerreno,aCasa,percent;
		
		System.out.println("Digite as dimensoes do Terrno: ");
		System.out.print("Comprimento: ");
		cTerreno = ler.nextInt();
		
		System.out.print("Largura: ");
		lTerreno = ler.nextInt();

		System.out.println("Digite as dimensoes da Casa: ");
		System.out.print("Comprimento: ");
		cCasa = ler.nextInt();
		
		System.out.print("Largura: ");
		lCasa = ler.nextInt();
		
		aTerreno = cTerreno * lTerreno;
		aCasa = cCasa * lCasa;
		aLivre = aTerreno - aCasa;
		percent = (100 * aLivre)/aTerreno;
		
		System.out.println("Area livre do terreno: " + aLivre + "m^2");
		System.out.println("Area livre do terreno em %: " + percent);
		
	}

}
