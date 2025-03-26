package Exercicio_4;

public class Main {
    public static void main(String[] args) {
    Pagamento[] pagamento=new Pagamento[2];
    pagamento[0] = new PagamentoCartao();
    pagamento[1] = new PagamentoDinheiro();

    for (Pagamento value:pagamento){
        value.realizarPagamento();
    }
    }
}