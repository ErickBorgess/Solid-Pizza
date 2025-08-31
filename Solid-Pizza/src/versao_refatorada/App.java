package versao_refatorada;

import versao_refatorada.model.Pedido;
import versao_refatorada.pagamento.*;
import versao_refatorada.repository.*;
import versao_refatorada.service.*;

public class App {
    public static void main(String[] args) throws Exception {
        PizzaRepository repositorio = new CatalogoPizzaRepository();
        ReciboService recibo = new ReciboService();
        Caixa caixa = new Caixa(repositorio, recibo);

        // Pedido 1
        Pedido p1 = caixa.iniciarPedido("Erick");
        caixa.adicionarPizza(p1, 1);
        caixa.finalizarPedido(p1, new PagamentoDinheiro());

        // Pedido 2
        Pedido p2 = caixa.iniciarPedido("João");
        caixa.adicionarPizza(p2, 2);
        caixa.finalizarPedido(p2, new PagamentoPix());

        // Pedido 3
        Pedido p3 = caixa.iniciarPedido("Mario");
        caixa.adicionarPizza(p3, 3);
        caixa.finalizarPedido(p3, new PagamentoCredito());

        // Pedido 4
        Pedido p4 = caixa.iniciarPedido("Ana");
        caixa.adicionarPizza(p4, 1);
        caixa.adicionarPizza(p4, 2);
        caixa.finalizarPedido(p4, new PagamentoDebito());
    }
}
