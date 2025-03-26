package Ativ_Heranca;

public abstract class Veiculo {
    private String veiculo;

    public void veiculo(String veiculo){
    this.veiculo = veiculo;
    }

    public void mover(){
        System.out.println("O veiculo está se movendo");
    }

    public abstract void Mover();
}