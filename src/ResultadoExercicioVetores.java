import java.util.Scanner;

public class ResultadoExercicioVetores {

	public static void main(String[] args) {
		double total=0;
		double alunos[] = new double [10];
		Scanner leitor = new Scanner(System.in);

		for (int i=0;i<alunos.length;i++) {
			System.out.println("Por favor, digite o consumo do aluno " + (i + 1));
			alunos[i] = leitor.nextDouble();
			//aqui a cada volta do meu loop aqui vai captar o aluno que acabou de ser somado,
			//vai juntar no total e guardar
			total = total + alunos[i];
		}

		for(int i = 0;i<alunos.length;i++) {
			System.out.println("O consumo do aluno " + ( i + 1 ) + " foi de: " + alunos[i]);
		}
		System.out.println("O total de consumo foi de R$ " + total);

		leitor.close();
	}
}



		

