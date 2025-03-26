package Heranca_Poliformismo;
public class Main{
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 0.10);
        Gerente gerente = new Gerente("Ana", 0.10, 0.10);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Lucas",0.10, 0.10, 0.10);

        System.out.printf("Salário do Funcionário %s: R$%.2f\n", funcionario.nome, funcionario.calcularsalario());
        System.out.printf("Salário do Gerente %s: R$%.2f\n", gerente.nome, gerente.calcularsalario());
        System.out.printf("Salário do Desenvolvedor %s: R$%.2f\n", desenvolvedor.nome, desenvolvedor.calcularsalario());
    }
}
