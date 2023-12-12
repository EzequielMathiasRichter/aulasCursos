package classe;

public class Data {
    Integer dia;
    Integer mes;
    Integer ano;

    String obterDataFormatada(Integer dia, Integer mes, Integer ano){
        String dataFormatada;

        dataFormatada = dia.toString() + "/" + mes.toString() + "/" + ano.toString();
        return dataFormatada;
    }
    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
    void imprimirData(){
        System.out.println(obterDataFormatada());
    }
}
