package Exercicio_4;

public class PagamentoDinheiro extends Pagamento {
    public PagamentoDinheiro() {
        super();
    }
    @Override
    public void realizarPagamento(){
        System.out.println("Pagamento com dinheiro recebido!");
    }
}