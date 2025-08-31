package versao_refatorada.service;

import versao_refatorada.model.Pedido;

public class ReciboService {
    public void gerarRecibo(Pedido pedido) {
        System.out.println("\n------ SIMULAÇÃO DE RECIBO ------");
        System.out.println("Cliente: " + pedido.nomeCliente);
        System.out.println("Pizzas: " + pedido.pizzas);
        System.out.println("Total: R$" + pedido.valorTotal);
        System.out.println("Tipo de pagamento: " + pedido.tipoPagamento);
        System.out.println("Obrigado pela preferência!");
        System.out.println("-----------------------------------\n");
    }
}
