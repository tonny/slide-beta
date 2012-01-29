package Interfaz;

import java.awt.Graphics;

public class DisenioSimple extends Disenio {
//	private int simple=1,doble=2,tirple=3;
	private int disenio;
	public DisenioSimple(){
		super();
	}
	public void paint(Graphics g){
		super.paint(g);
	}
	public void dibujar(int dibujar){
		disenio=dibujar;
		repaint();
	}


}
