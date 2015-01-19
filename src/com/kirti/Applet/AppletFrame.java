package com.kirti.Applet;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="AppletFrame" width=300 height=50></applet>
*/
class SampleFrame extends Frame{
	SampleFrame(String title){
		super(title);
		
		MyWindowAdapter adapter=new MyWindowAdapter(this);
		
		addWindowListener(adapter);
	}
	
	public void paint(Graphics g){
		g.drawString("This is a frame window", 10, 20);
	}
}

class MyWindowAdapter extends WindowAdapter{
	SampleFrame sampleframe;
	
	public MyWindowAdapter(SampleFrame sampleframe){
		this.sampleframe=sampleframe;
	}
		
	public void windowClosing(WindowEvent e) {
		sampleframe.setVisible(false);
	}
}

public class AppletFrame extends Applet{
	
	Frame f;	
	public void init() {
		f=new SampleFrame("A frame window");
		f.setSize(250,250);
		f.setVisible(true);
	}
		
	public void start() {
		f.setVisible(true);
	}
		
	public void stop() {
		f.setVisible(false);
	}
	
	public void paint(Graphics g) {
		g.drawString("This is an applet window", 10, 20);
	}
}