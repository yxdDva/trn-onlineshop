package com.ibm.bean;

/**
 * @author dva
 * @create 2019-03-22 14:34
 */
public class Cartitem {

    private Product product;
    private int amount;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Cartitem{" +
                "product=" + product +
                ", amount=" + amount +
                '}';
    }
}
