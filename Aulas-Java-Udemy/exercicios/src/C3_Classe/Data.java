package C3_Classe;

public class Data {
    Integer dia;
    Integer mes;
    Integer ano;

    Data(){
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1,1,1970);
    }
    Data(Integer dia, Integer mes, Integer ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    String obterDataFormatada(Integer dia, Integer mes, Integer ano){
        String dataFormatada;

        dataFormatada = dia.toString() + "/" + mes.toString() + "/" + ano.toString();
        return dataFormatada;
    }
    String obterDataFormatada(){
        final String formatada = "%d/%d/%d";
        return String.format(formatada, this.dia, this.mes, this.ano);
    }
    void imprimirData(){
        System.out.println(obterDataFormatada());
    }

}
