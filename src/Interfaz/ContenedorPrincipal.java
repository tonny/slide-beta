package Interfaz;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;


public class ContenedorPrincipal extends JPanel{
	private ContenedorIzquierdo CIzq;
	private ContenedorDerecho CDer;
	private ContenedorCentro CCen;
	private Dimension d;
	public ContenedorPrincipal(Dimension dim){
		d=dim;
		setBounds(0,0, dim.width, dim.height);
		setLayout(null);
		iniciarContenedores();
		setOpaque(true);
        setVisible(true);

	}
	public void iniciarContenedores(){
		/*
		 * Creamos los paneles que contendra nuestra ventana principal
		 */
		CIzq=new ContenedorIzquierdo(d);
		CDer=new ContenedorDerecho(d);
		CCen=new ContenedorCentro(d);
		/*
		 * Ponemos bordes a nuestros a los paneles
		 */
		CCen.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		CDer.setBorder(new TitledBorder("Template"));
		CIzq.setBorder(new TitledBorder("Diaposiivas"));

		/*
		 * insertamos nuestros paneles a la ventana principal
		 */

		add(CIzq);
		add(CCen);
		add(CDer);
		repaint();


	}
/*	public static void main(String[] args) {
		   Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		   JFrame frame=new JFrame();
		   ContenedorPrincipal p =new ContenedorPrincipal(dim);
		   frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		   frame.setSize(dim.width,dim.height);
		   frame.setLayout(null);
		   frame.add(p);
		   frame.setVisible(true);
	}*/
}
