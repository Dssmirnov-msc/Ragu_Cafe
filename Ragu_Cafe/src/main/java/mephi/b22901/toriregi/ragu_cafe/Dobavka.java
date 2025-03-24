/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.toriregi.ragu_cafe;

/**
 *
 * @author test2023
 */
public class Dobavka extends Decorator{
    private String name;
    private int price;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }
    
    
    public Dobavka(Dish ndish) {
        super(ndish);
    }

    @Override
    public int getPrice() {
        int superPrice = super.getPrice();
        int thisPrice = superPrice + price;
        return thisPrice;
    }

    @Override
    public String getName() {
        String superName = super.getName();
        String thisName = superName + "+" + name;
        return thisName;
    }

    
}
