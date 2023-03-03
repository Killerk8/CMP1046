package lista1;

import java.util.Scanner;
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		double rTerreno,pCasa,rCasa,aTerreno,aCasa,aLivre,percent;
		//tem 2 opçoes onde pode ser fornecido o PERIMETRO ou RAIO
		//fornecendo raio foi utilizado a formula A=pi*r^2
		//fornecendo o perimetro teria que utilizar d=p/pi logo dps d/2 para achar o raio
		//onde seria utilizado a formula A=p*r/2 para achar a area 
		
		System.out.println("Digite a dimensoes do Terreno: ");
		System.out.print("Raio: ");
		rTerreno = ler.nextDouble();
		
		System.out.println("Digite a dimensoes da Casa: ");		
		System.out.print("Raio: ");
		rCasa = ler.nextDouble();
		
		aTerreno = 3.14 * (rTerreno * rTerreno);
		aCasa = 3.14 * (rCasa * rCasa);
		aLivre = aTerreno - aCasa;
		percent = (100 * aLivre)/aTerreno;
		
		System.out.println("Area livre do terreno: " + aLivre + "m^2");
		System.out.println("Area livre do terreno em %: " + percent);
		
		
	}

}
