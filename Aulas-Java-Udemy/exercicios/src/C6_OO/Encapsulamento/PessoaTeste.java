package C6_OO.Encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", "Raul", -30);
//        p1.idade = -35;
        p1.setIdade(121);
        System.out.println(p1.getIdade());
        System.out.println(p1); // toString
        System.out.println(p1.nomeCompleto());
    }
}
