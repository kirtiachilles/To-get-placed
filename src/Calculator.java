/**
 * @(#)Calculator.java
 *
 *
 * @author 				
 * @version 1.00 2012/2/9
 */

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator extends Frame implements ActionListener 
{	
	private static final long serialVersionUID = 1L;
	Panel p;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;
	FlowLayout f;

	public Calculator() 
	{
	
		
	/*	f = new FlowLayout("FlowLayout",CENTER_ALIGNMENT,10,10);
		setLayout(f);
	*/	
		p=new Panel();
		l1=new Label("First Number");
		l2=new Label("Second Number");
		l3=new Label("Result");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		setSize(140,300);
		setVisible(true);
		
		add(p);
		p.add(l1); p.add(t1);
		p.add(l2); p.add(t2);
		p.add(l3); p.add(t3);
		p.add(b1); p.add(b2); p.add(b3); p.add(b4);
		
    }
    public void actionPerformed(ActionEvent ae)
    {
    
    		if(ae.getSource()==b1)
    	{
    		t3.setText(""+(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText())));
    	}
    		if(ae.getSource()==b2)
    	{
    		t3.setText(""+(Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText())));
    	}
    		if(ae.getSource()==b3)
    	{
    		t3.setText(""+(Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText())));
    	}
    		if(ae.getSource()==b4)
    	{
    		t3.setText(""+(Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText())));
    	}
    }
    
    public static void main(String[] args)
    {
    	new Calculator();
    }
    
    
}