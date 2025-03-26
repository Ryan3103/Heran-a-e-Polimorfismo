package Heranca_Poliformismo;

public final class Desenvolvedor extends Funcionario {
    protected Double aumentoSalarial;
    protected Double bonus = 0.10;

    public Desenvolvedor(String nome, Double salarioBase, Double aumentoSalarial, Double bonus) {
        super(nome,salarioBase);
        this.aumentoSalarial = aumentoSalarial;
    }

    @Override
    protected Double calcularsalario() {
        return salarioBase + (salarioBase * bonus) ;
    }

}


