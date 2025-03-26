package Heranca_Poliformismo;

public class Gerente extends Funcionario{
    protected Double aumentoSalarial;
    public Gerente(String nome, Double salarioBase, Double aumentoSalarial) {
        super(nome,salarioBase);
        this.aumentoSalarial = aumentoSalarial;
    }

    @Override
    protected Double calcularsalario() {
    return salarioBase + aumentoSalarial;
    }

}

