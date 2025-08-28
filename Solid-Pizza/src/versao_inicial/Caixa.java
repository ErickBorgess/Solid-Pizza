package versao_inicial;

//Vai ser o God Object
public class Caixa {
    private Pedido pedido;

    public void iniciarPedido(String cliente) {
        pedido = new Pedido();
        pedido.nomeCliente = cliente;
    }

    public void adicionarPizza(int idPizza) {
        String nome = CatalogoPizza.getPizza(idPizza);
        double preco = CatalogoPizza.getPreco(idPizza);

        pedido.pizzas.add(nome);
        pedido.valorTotal += preco;

        System.out.println("Pizza adicionada: "+nome+" | Preço: R$"+preco);
    }

    public void pagamento(String tipoPagamento) {
        switch (tipoPagamento) {
            case "dinehiro":
                System.out.println("[DINHEIRO] Valor total = R$"+pedido.valorTotal);
                break;
            case "pix":
                System.out.println("[PIX] Valor total = R$"+pedido.valorTotal);
                break;
            case "credito":
                System.out.println("[CREDITO] Valor total (taxa 2%) = R$"+(pedido.valorTotal*0.02));
                break;
            case "debito":
                System.out.println("[DEBITO] Valor total = R$"+pedido.valorTotal);
                break;
            default:
                System.out.println("Tipo não disponível!");
                break;
        
        salvarRecibo();
        
    }

        private void salvarRecibo() { //IDENTIFICAR ERRO
            System.out.println("\n--- SIMULAÇÃO DE RECIBO ---");
            System.out.println("Cliente: "+pedido.nomeCliente);
            System.out.println("Pizzas: "+pedido.pizzas);
            System.out.println("Total: R$"+pedido.valorTotal);
            System.out.println("Obrigado pela preferência!");
            System.out.println("----------------------------\n");
        }
    }
}
