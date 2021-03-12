
public class EntendendoVetores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objetivo aqui é criar um programa para mostrar denhos antigos//

		//Aqui criei nome no vetor e quero alimenta-lo com dados precisos
		String[] desenhos = {"Cavaleiro do Zodiaco", "Yu Yu Hakusho", "Shuratu"};

		System.out.println("O tamanho do vetor é " + desenhos.length);
		System.out.println("A posiçao 0 contem " + desenhos [0]);
		System.out.println("A posiçao 0 contem " + desenhos [1]);
		System.out.println("A posiçao 0 contem " + desenhos [2]);

	}
}

//Pra que que server essa estrutura? Ela é estremamente ulti quando temos uma lista de dados e quer dar carga. 
//Ex: Imagina pega a lista de todos os estados brasileiros. Vc pode alimentar em vetor com o nome de estados.
//Da para usar com numeros tambem:vou criar um vetor com anos de laçamentos de filmes:
//int[] lacamentos = {2019,2020,2021}
//Resumindo, toda vez que eu quiser criar o vetor com dados pre-definidos, eu usarei essa denotaçao: 
//NOME DO VETOR = { SEPARADOS POR, CADA UM DOS VALORES QUE TENHO}