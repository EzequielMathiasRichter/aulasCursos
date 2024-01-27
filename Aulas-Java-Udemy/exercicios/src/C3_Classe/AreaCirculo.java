package C3_Classe;

public class AreaCirculo {
    double raio;
    static final double PI = 3.14;

    AreaCirculo(double raioInicial){
        raio= raioInicial;
    }
    double area(){
        return PI * Math.pow(raio, 2);
    }
    static double area(double raio){
        return PI * Math.pow(raio, 2);
    }
}
