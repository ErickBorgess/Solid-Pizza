package versao_refatorada.service;

import versao_refatorada.model.Pedido;
import versao_refatorada.model.Pizza;
import versao_refatorada.repository.PizzaRepository;
import versao_refatorada.pagamento.PagamentoStrategy;

public class Caixa {
    private final PizzaRepository PizzaRepository;
    private final ReciboService reciboService;

    public Caixa(PizzaRepository PizzaRepository, ReciboService reciboService) {
        this.PizzaRepository = PizzaRepository;
        this.reciboService = reciboService;
    }

    public Pedido iniciarPedido(String cliente) {
        System.out.println("------------| NOVO PEDIDO |--------------");
        System.out.println("Nome do Cliente: "+cliente);
        return new Pedido(cliente);
    }

    public void adicionarPizza(Pedido pedido, int idPizza) {
        Pizza pizza = PizzaRepository.buscarPorId(idPizza);
        if (pizza != null) {
            pedido.adicionarPizza(pizza);
            System.out.println("Pizza adicionada: " + pizza);
        } else {
            System.out.println("Pizza não encontrada!");
        }
    }

    public void finalizarPedido(Pedido pedido, PagamentoStrategy pagamento) {
        pagamento.pagar(pedido);
        pedido.setTipoPagamento(pagamento.getTipo());
        reciboService.gerarRecibo(pedido);
    }
}
