package C2_Controle;

public class switchSemBreak {
    public static void main(String[] args) {
        String faixa = "preta";
        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("sei Bassar-dai...");
            case "marrom":
                System.out.println("sei Tekki Shodan");
            case "roxa":
                System.out.println("sei Heian godan");
            case "verde":
                System.out.println("sei Heian Yodan");
            default:
                System.out.println("não sei nada");
        }
    }
}
