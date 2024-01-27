package C3_Classe;

public class AreaCirculoTeste {
    public static void main(String[] args) {
        AreaCirculo a1 = new AreaCirculo(5.6);
        System.out.println(a1.area());

        AreaCirculo a2 = new AreaCirculo(5);
        System.out.println(a2.area());
        System.out.println(AreaCirculo.area(10));
        System.out.println(AreaCirculo.PI);
        System.out.println(Math.PI);

    }
}
