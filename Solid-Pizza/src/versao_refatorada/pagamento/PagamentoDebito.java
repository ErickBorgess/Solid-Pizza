package versao_refatorada.pagamento;

import versao_refatorada.model.Pedido;

public class PagamentoDebito implements PagamentoStrategy{
    public void pagar(Pedido pedido) {
        System.out.println("[DEBITO] Valor total = R$"+pedido.valorTotal);
    }

    public String getTipo() {
        return "Debito";
    }
}
