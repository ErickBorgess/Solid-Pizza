package versao_inicial;

public class CatalogoPizza {

    public static String getPizza(int idPizza) {
        switch (idPizza) {
            case 1:
                return "Calabresa";
            case 2:
                return "Portuguesa";
            case 3:
                return "Frango com Catupiry";    
            default:
                return "Pizza fora do catalogo!";
        }
    }

    public static double getPreco(int idPizza) {
        if(idPizza == 1) return 30.00;
        if(idPizza == 2) return 40.00;
        if(idPizza == 3) return 35.00;
        return 0.00;
    }

}
