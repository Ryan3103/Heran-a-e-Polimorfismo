package Heranca_Poliformismo;

public class Funcionario {
        protected String nome;
        protected Double salarioBase;

        public Funcionario(String nome, Double salarioBase) {
            this.nome = nome;
            this.salarioBase = salarioBase;
        }
        protected Double calcularsalario(){
            return salarioBase;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
