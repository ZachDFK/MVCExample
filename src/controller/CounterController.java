package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CounterModel;
import view.CounterView;

public class CounterController implements ActionListener {
	private CounterModel model;
	
	
	public CounterController(CounterModel model)
	{
		this.model = model;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("increment"))
		{
			model.increment();
		}
		
		
	}
	
}
