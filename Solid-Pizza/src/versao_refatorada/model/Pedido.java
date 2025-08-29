package versao_refatorada.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    public List<String> pizzas;
    public double valorTotal;
    public String nomeCliente;
    public String tipoPagamento;

    public Pedido(String cliente) {
        this.nomeCliente = cliente;
        this.pizzas = new ArrayList<>();
        this.valorTotal = 0.00;
    }

    
}
