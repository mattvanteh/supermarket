package Supermarket;


class ShoppingCartItem {

   public String itemName;
    public int itemCost;
    public int quantity;

    public ShoppingCartItem() {

    }

    public ShoppingCartItem(String itemName, int itemCost, int quantity) {
        this.itemName = itemName;
        this.itemCost = itemCost;
        this.quantity = quantity;
    }

    public void add(ShoppingCartItem otherItem) {
        this.quantity = this.quantity + otherItem.quantity;
    }

    public void remove(ShoppingCartItem otherItem) {
        this.quantity = this.quantity - otherItem.quantity;
    }


}

