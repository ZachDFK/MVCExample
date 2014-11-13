package view;

import model.CounterModel;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import controller.CounterController;


public class CounterView extends JFrame implements ActionListener,Observer {


	private JTextField counterField;
	private CounterController controller;
	private CounterModel counter;
	
    public CounterView(CounterModel counter){
    	System.out.println("print");
    	this.counter = counter;
        counterField = new JTextField("0");
        this.add(counterField, BorderLayout.CENTER);
        JButton incButton = new JButton("increment");
        this.add(incButton, BorderLayout.SOUTH); 
        incButton.addActionListener(new CounterController(counter));
        this.setSize(200,400);
    	this.setVisible(true);
    }
    
    public static void main(String[] args) {
    	CounterModel counter = new CounterModel();
    	System.out.println("print");
    }

    
	public void updateDisplay(int value) {
		
		counterField.setText(value+"");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Observable CounterModel, Object arg) {
		this.updateDisplay((int)arg);
	}

}

