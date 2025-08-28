package versao_inicial;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    public List<String> pizzas;
    public double valorTotal;
    public String nomeCliente;
    
    public Pedido() {
        pizzas = new ArrayList<>();
        valorTotal = 0.00;
    }

}
