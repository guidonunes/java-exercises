package Part9.OnlineShop;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;


public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks= new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        return this.prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.stocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if(!this.stocks.containsKey(product)) {
            return false;
        }

        int currentStock = this.stocks.get(product);

        if(currentStock > 0) {
            this.stocks.put(product, currentStock  -1 );
            return true;
        } else {
            return false;
        }
    }

    public Set<String> products() {
        Set<String> keys = this.stocks.keySet();
        return keys;
    }
}
