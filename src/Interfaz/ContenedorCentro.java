package Interfaz;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class ContenedorCentro extends JPanel {
	JPanel Slide;
	public ContenedorCentro(Dimension dim){
		Slide = new JPanel();
		Slide.setBounds(45, 30, dim.width-600, dim.height-300);
		Slide.setBorder(new LineBorder(Color.BLACK ));
		Slide.setBackground(Color.WHITE);
		setSize(dim.width-500,dim.height-28);
		setLocation(250,0);
	//	setBackground(Color.darkGray);
		setLayout(null);
		add(Slide);
		setOpaque(true);
        setVisible(true);
        repaint();
	}
	public void setColor(Color color){
		
	}
    public void setFondo(ImageIcon imagen){
		
	}
    
}
