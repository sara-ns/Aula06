import java.util.Scanner;
public class EntendendoVetores {

	public static void main(String[] args) {
		// Aqui esta criando uma  vetor, aqui ela é capaz de guardar varoios dados de uma so vez e cada um de uma posiçao
		// Uma variavel chamada vetor ela tem 10 espaços dentro dela//
		int vetor[] = new int[10];
		Scanner leitor = new Scanner(System.in);
		
		//Aqui foi criado uma mensagem para definir o tamanho do meu vetor usando a linguagem lenght//
		System.out.println("A primeira posiçao contem o valor" + vetor.length);
		
		// Aqui foi chamado um For e dentro dele foi colocado um vetor
		//Para int i igual a 0, i menor do que o tamanho do meu vetor e i ++
		for(int i=0;i<vetor.length;i++) {
			System.out.println("Digite um valor");
			// Aqui eu vou conseguir ler 10 valores em sequencia, usando apenas uma linha e consigo preservar todos esse valores na variavel vetor
			vetor[i] = leitor.nextInt();
		}
		//Esse foi foi criado para exibir os valores digitados//
		for(int i=0;i<vetor.length;i++) {
			System.out.println("No indice "+ i + "foi armazenado o valor" + vetor[i]);
		}
		
	}

}
