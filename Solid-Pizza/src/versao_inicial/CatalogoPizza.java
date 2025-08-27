package versao_inicial;

public class CatalogoPizza {

    public static String getPizza(int id) {
        switch (id) {
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

    public static double getPreco(int id) { //TO-DO mudar parâmetro para nome(string)
        if(id == 1) {
            return 30.00;
        }else if(id == 2) {
            return 40.00;
        }else if(id == 3) {
            return 35.00;
        }
        return 0.0;
    }
}
