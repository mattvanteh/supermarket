package Supermarket;



public class App {
    public static void main(String[] args) {
        SuperMarketProduct cereal = new SuperMarketProduct(100, "Cereal");
        SuperMarketProduct yoghourt = new SuperMarketProduct(200, "Yoghourt");

        CashRegister cashRegister = new CashRegister();
        cashRegister.addProduct(cereal);
    }

}