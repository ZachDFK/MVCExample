package model;

import java.util.Observable;

import controller.CounterController;
import view.CounterView;

public class CounterModel extends Observable{
	
	
    private int value, max;
    
    
    
    public CounterModel(){
    	this(10);
    }
    
    public CounterModel(int max) {
        value = 0;
        this.max = max;
        this.addObserver(new CounterView(this));
    }
    
    public int getValue() {
        return value;
    }
    
    public void increment() {
        value ++;
        if (value == max) value = 0;
        this.setChanged();
        this.notifyObservers(value);
        
    }
    
}
