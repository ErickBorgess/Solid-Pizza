package versao_refatorada.pagamento;

import versao_refatorada.model.Pedido;

public class PagamentoCredito implements PagamentoStrategy{
    public void pagar(Pedido pedido) {
        pedido.valorTotal += 1.00;
        System.out.println("[CREDITO] Valor total (taxa R$1,00) = R$"+pedido.valorTotal);
    }

    public String getTipo() {
        return "Credito";
    }
}
