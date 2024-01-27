package C2_Controle;

public class desafioFor {
    public static void main(String[] args) {
        // criar uma meia piramide sem usar valores numéricos
        for(String v = "*"; !v.equals("*****"); v+="*"){
            System.out.println(v);
        }
    }
}
