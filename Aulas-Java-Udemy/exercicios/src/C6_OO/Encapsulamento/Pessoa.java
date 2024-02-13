package C6_OO.Encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome, int idade){
        setIdade(idade);
        setNome(nome);
        setSobrenome(sobrenome);
    }

    // Getters
    public int getIdade(){
        return idade;
    }

    // Setters
    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if(novaIdade < 0 || novaIdade > 120){
            novaIdade = 0;
        }else{
            this.idade = novaIdade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String nomeCompleto(){
        return getNome() + " " + getSobrenome();
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " | Idade: " + idade;
    }
}
