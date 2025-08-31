package versao_refatorada.repository;

import java.util.ArrayList;
import java.util.List;

import versao_refatorada.model.Pizza;

public class CatalogoPizzaRepository implements PizzaRepository{
    private List<Pizza> catalogo = new ArrayList<>();

    public CatalogoPizzaRepository() {
        catalogo.add(new Pizza(1, "Calabresa", 30.00));
        catalogo.add(new Pizza(2, "Portuguesa",40.00));
        catalogo.add(new Pizza(3, "Frango com Catupiry", 35.00));
    }

    public Pizza buscarPorId(int id) {
        for(Pizza p : catalogo) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
