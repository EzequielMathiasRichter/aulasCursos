package C1_Fundamentos;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {
        double um = Math.pow(6*(3+2) ,2 ) / (3*2);
        double dois = Math.pow(((1-5)*(2-7)/2),2);
        double tres  = um - dois;
        double quatro = Math.pow(tres,3);
        double res = quatro/Math.pow(10,3);
        System.out.println(res);
    }
}
