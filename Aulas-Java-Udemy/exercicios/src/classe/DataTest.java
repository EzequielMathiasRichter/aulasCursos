package classe;

public class DataTest {
    public static void main(String[] args) {
        Data data1 = new Data();

        Data data2 = new Data(29,06,2000);

        System.out.printf(data1.obterDataFormatada(data1.dia, data1.mes, data1.ano));
        System.out.println();
        data2.imprimirData();

    }
}
