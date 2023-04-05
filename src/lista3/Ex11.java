package lista3;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double tamanhoArquivo,velocidadeInternet,tempoDownload;
		
		System.out.print("Informe o tamanho do arquivo (em MB): ");
		tamanhoArquivo = ler.nextDouble();
		
		System.out.print("Informe a velocidade da Internet (em Mbps): ");
		velocidadeInternet = ler.nextDouble();
		
		tempoDownload = tamanhoArquivo / (velocidadeInternet / 8) / 60;
	}

}
