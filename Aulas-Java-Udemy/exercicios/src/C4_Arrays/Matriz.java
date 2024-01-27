package C4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos alunos?");
        int qtdAlunos = entrada.nextInt();

        System.out.println("Quantas notas por alun?");
        int qtdNotas = entrada.nextInt();

        double total = 0;
        double [][] notasDaTurma = new double [qtdAlunos][qtdNotas];
        for (int i = 0; i< notasDaTurma.length; i++){
            for (int n = 0; n < notasDaTurma[i].length; n++){
                System.out.printf("Informe a nota %d do aluno %d: ", n+1, i+1);
                notasDaTurma[i][n] = entrada.nextDouble();
                total += notasDaTurma[i][n];
            }
        }
        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Média da turma é: " + media);

        for(double[] notasDoAluno: notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }
        entrada.close();
    }
}
