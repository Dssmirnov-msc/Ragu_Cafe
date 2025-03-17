/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.toriregi.ragu_cafe;

/**
 *
 * @author Регина
 */
public abstract class Decorator {
    private Base baseOrder;
    private String dobavki;
    private int finalCost;
    
    public Decorator(){
        baseOrder = new Base();
    }
    
    public String getName(){
        String fullName = baseOrder.getName();
        return fullName;
    }
}
