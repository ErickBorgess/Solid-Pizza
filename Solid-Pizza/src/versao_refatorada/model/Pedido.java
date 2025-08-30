package versao_refatorada.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    public List<Pizza> pizzas;
    public double valorTotal;
    public String nomeCliente;
    public String tipoPagamento;

    public Pedido(String cliente) {
        this.nomeCliente = cliente;
        this.pizzas = new ArrayList<>();
        this.valorTotal = 0.00;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        valorTotal += pizza.getPreco();
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    
}
