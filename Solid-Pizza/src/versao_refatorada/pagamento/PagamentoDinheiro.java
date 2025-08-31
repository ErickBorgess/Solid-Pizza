package versao_refatorada.pagamento;

import versao_refatorada.model.Pedido;

public class PagamentoDinheiro implements PagamentoStrategy{
    public void pagar(Pedido pedido) {
        System.out.println("[DINHEIRO] Valor total = R$"+pedido.valorTotal);
    }

    public String getTipo() {
        return "Dinheiro";
    }
}
