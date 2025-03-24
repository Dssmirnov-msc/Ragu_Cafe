/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.toriregi.ragu_cafe;

/**
 *
 * @author Регина
 */
public abstract class Decorator implements Dish{
    private Dish dish;

       
    public Decorator(Dish ndish){
       dish = ndish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
        
    @Override
    public String getName(){
        return dish.getName();
    }

    @Override
    public int getPrice(){
        return dish.getPrice();
    };
    
    
}
