/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.toriregi.ragu_cafe;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author test2023
 */
public class DobavkiManager {
    
    private HashMap<JRadioButton, HashMap<String, Integer>> storage;
    
    public DobavkiManager(){
        storage = new HashMap<>();
    }
    
    public void createNewOption(String name, int price){
        JRadioButton button = new JRadioButton(name);
        
        HashMap<String, Integer> instruction = new HashMap();
        instruction.put(name, price);
        storage.put(button, instruction);
    }
    
    public void setRadioButtonsToPanel(JPanel panel){
        for (Map.Entry<JRadioButton, HashMap<String, Integer>> entry : storage.entrySet()) {
            JRadioButton key = entry.getKey();
            panel.add(key);
        }
    }
    
    
    public Dish createDish(){
        
        Dish lastDish = new Base();
        
        for (Map.Entry<JRadioButton, HashMap<String, Integer>> entry : storage.entrySet()) {
            JRadioButton button = entry.getKey();
            if (button.isSelected()){
                HashMap<String, Integer> instruction = entry.getValue();
                String name = instruction.keySet().iterator().next();
                lastDish = new Dobavka(lastDish);
                lastDish.setName(name);
                lastDish.setPrice(instruction.get(name));
            }
        }
        
        return lastDish;
    }
}
