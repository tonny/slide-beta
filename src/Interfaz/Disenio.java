package Interfaz;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Disenio extends JPanel{
	private int simple=1,doble=2,tirple=3;
	private int disenio;
	public Disenio(){
		setSize(200, 150);
		//setLayout(null);
	}
	public void paint(Graphics g){
		g.drawRect( 20, 15, 170, 85 );
		if(disenio==simple)
			g.fillRect(35, 24, 130, 5);
		if(disenio==doble){
			g.fillRect(35, 24, 130, 5);
			g.drawRect(35, 35, 130, 60);
		}

	}
	public void dibujar(int dibujar){
		disenio=dibujar;
		repaint();
	}

}
