package classe;

public class DataTest {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.dia = 18;
        data1.mes = 04;
        data1.ano = 2005;

        Data data2 = new Data();
        data2.dia = 29;
        data2.mes = 06;
        data2.ano = 2000;

        System.out.printf(data1.obterDataFormatada(data1.dia, data1.mes, data1.ano));
        System.out.println();
        data2.imprimirData();

    }
}
