package versao_refatorada.pagamento;

import versao_refatorada.model.Pedido;

public class PagamentoPix implements PagamentoStrategy{
    public void pagar(Pedido pedido) {
        System.out.println("[PIX] Valor total = R$"+pedido.valorTotal);
    }

    public String getTipo() {
        return "Pix";
    }
}
