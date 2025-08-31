package versao_refatorada.pagamento;

import versao_refatorada.model.Pedido;

public interface PagamentoStrategy {
    void pagar(Pedido pedido);
    String getTipo();
}
