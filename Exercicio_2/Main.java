package Ativ_Heranca;

public class Main {
    public static void main(String[] args) {
     Veiculo[] veiculo = new Veiculo[2];
     veiculo[0] = new Carro();
     veiculo[1] = new Bicicleta();

     for (int i= 0;i< veiculo.length;i++){
         veiculo[i].mover();
        }
    }
}
