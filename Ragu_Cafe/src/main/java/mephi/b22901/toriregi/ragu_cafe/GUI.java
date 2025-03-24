/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.toriregi.ragu_cafe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Регина
 */
public class GUI {

    private DobavkiManager manager;
    
    public GUI() {
        JFrame frame = new JFrame("Оформление заказа");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);
        frame.setLayout(new BorderLayout());
        
        manager = new DobavkiManager();

        JButton simpleOrder = new JButton("Рагу без добавок");
        JButton compOrder = new JButton("Рагу с добавками");

        JPanel startPage = new JPanel();
        startPage.add(simpleOrder);
        startPage.add(compOrder);

        frame.add(startPage);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        simpleOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Base base = new Base();
                Order newOrder = new Order(base.getName(), base.getPrice());
                JOptionPane.showMessageDialog(frame, newOrder.toString(), "OK", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        compOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addDobavki();
            }
        });

    }

    public void addDobavki() {
        JFrame frame = new JFrame("Добавки для рагу");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 300);
        frame.setLayout(new BorderLayout());
        
        
        
        JButton result = new JButton("Сделать заказ");
        
        String[] allDobavkiNames = {"Огненный соус", "Двойная порция оленина", 
            "Снежные ягоды", "Нордская лепешка"}; 
        
        int[] allPrices = {10, 20, 5, 7};
        
        for (int i = 0; i < 4; i++) {
            manager.createNewOption(allDobavkiNames[i], allPrices[i]);
        }
        
        
        
        JPanel panel = new JPanel();
        manager.setRadioButtonsToPanel(panel);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.add(result, BorderLayout.SOUTH);
       
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
        
        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Dish dish = manager.createDish();
                
                Order newOrder = new Order(dish.getName(), dish.getPrice());
                JOptionPane.showMessageDialog(frame, newOrder.toString(), "OK", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        
    }

}
