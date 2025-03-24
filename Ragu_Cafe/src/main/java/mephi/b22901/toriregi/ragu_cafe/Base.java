/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.toriregi.ragu_cafe;

/**
 *
 * @author Регина
 */
public class Base implements Dish{
    private final String name = "Нордское рагу";
    private final int price = 50;
    
    public Base(){
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public void setPrice(int price) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
