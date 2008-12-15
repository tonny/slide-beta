package Interfaz;

import java.awt.*;
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;

class ElegirColor extends JDialog implements ActionListener
{
	JColorChooser jcolor=new JColorChooser();
	JButton btAceptar=new JButton("Aceptar");
	Ventana ed;
	String tipo;
	
ElegirColor(JFrame Dcolor,String s,boolean b,String tip)
 {
 	super(Dcolor);
 	
 	ed=(Ventana)Dcolor;
 	setLayout(new FlowLayout());
 	add(jcolor);
 	add(btAceptar);
 	btAceptar.addActionListener(this);
 	setTitle("Elegir color...");
	setSize(400,440);
	setResizable(false);
	setLocation(200,250);
    setVisible(true);
    tipo=tip;
 }
 	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btAceptar){
			if(tipo.equals("fondo")){
			ed.Texto.setBackground(jcolor.getColor());
			ed.Errores.setBackground(jcolor.getColor());
			ed.colorFondo.setBackground(jcolor.getColor());
			}
			if(tipo.equals("texto")){
			ed.Texto.setForeground(jcolor.getColor());
			ed.Errores.setForeground(jcolor.getColor());
			ed.colorTexto.setBackground(jcolor.getColor());
			}		
		}
		dispose();
	}
}
