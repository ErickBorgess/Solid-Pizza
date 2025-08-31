package versao_refatorada.model;

public class Pizza {
    private int id;
    private String nome;
    private double preco;

    public Pizza(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " (R$ " + preco + ")";
    }
}
