package C6_OO.Heranca.Desafio;

public interface Luxo {
    void ligarAr();
    void desligarAr();
   default int VelocidadeDaAr(){
       return 1;
   }
}
