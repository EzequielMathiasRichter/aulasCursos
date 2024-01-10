package Arrays;

import java.util.Arrays;

public class ExecicioDois {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        double total = 0;
        for(double nota: notasAlunoA){
            total += nota;
        }
        System.out.println(total / notasAlunoA.length);
    }
}
