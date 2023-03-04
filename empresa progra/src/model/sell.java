/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Diego Patiño
 */
public class sell {
    
    private final Product product;
    private final int quantity;
    private final double price;
    public sell(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.price =  quantity * this.product.getCurrentPrice();
    }

    public Product getProduct(){
        return product;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

}
