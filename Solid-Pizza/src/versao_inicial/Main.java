package versao_inicial;

public class Main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        caixa.iniciarPedido("Erick");
        caixa.adicionarPizza(1);
        caixa.pagamento("dinheiro");

        caixa.iniciarPedido("Joao");
        caixa.adicionarPizza(2);
        caixa.pagamento("pix");

        caixa.iniciarPedido("Mario");
        caixa.adicionarPizza(3);
        caixa.pagamento("credito");

        caixa.iniciarPedido("Ana");
        caixa.adicionarPizza(1);
        caixa.adicionarPizza(2);
        caixa.pagamento("debito");
    }
}
