package C1_Fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".length());
        String s = "Boa Tarde";
        System.out.println(s.concat("!!!"));
        var nome = "Ezequiel";
        var sobrenome ="Richter";
        var salario = 3398.15;
        var idade = 33;
        System.out.printf("O senhor %s %s tem %d anos e ganha R$:%.2f", nome, sobrenome, idade, salario);
    }

}
