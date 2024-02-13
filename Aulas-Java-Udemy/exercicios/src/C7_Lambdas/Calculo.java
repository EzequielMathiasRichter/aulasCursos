package C7_Lambdas;
@FunctionalInterface
public interface Calculo {
    double executar(double a, double b);
//    double teste(); // FunctionalInterface allows only one abstract method
    default String legal(){
        return "legal";
    }

    static String muitoLegal(){
        return "muito legal";
    }
}
