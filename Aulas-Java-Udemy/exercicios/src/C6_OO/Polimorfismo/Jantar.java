package C6_OO.Polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.2);
        Feijao ingrediente2 = new Feijao(0.1);

        System.out.println(p.getPeso());

        p.comer(ingrediente1);
        p.comer(ingrediente2);

        System.out.println(p.getPeso());

        Sorvete sobremesa = new Sorvete(0.4);

        p.comer(sobremesa);

        System.out.println(p.getPeso());
    }
}
