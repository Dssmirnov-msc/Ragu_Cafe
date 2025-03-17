/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.toriregi.ragu_cafe;

/**
 *
 * @author Регина
 */
public class Order {

    private java.time.LocalTime time;
    private String fullOrderName;
    private int fullCost;

    public Order(String name, int cost) {
        this.time = java.time.LocalTime.now();
        this.fullCost = cost;
        this.fullOrderName = name;
    }

    @Override
    public String toString() {
        return "Время заказа: " + time + "\nПолное имя заказа: " + fullOrderName + "\nЦена: " + fullCost + " септимов";
    }
}
