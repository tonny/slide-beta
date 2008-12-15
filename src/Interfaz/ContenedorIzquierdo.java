package Interfaz;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class ContenedorIzquierdo extends JPanel{
	public ContenedorIzquierdo(Dimension dim){	
		setBounds(0,0,250,dim.height-28);
		setBackground(Color.white);
		setLayout(null);
		crearSlides();
		setOpaque(true);
        setVisible(true);
		
	}
	public void crearSlides(){
		JPanel p =new JPanel();
		p.setBounds(15, 20, 220 ,170);
		p.setBorder(new LineBorder(Color.BLACK));
		add(p);
	}
}
