package Interfaz;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource;


public class ContenedorDerecho extends JPanel{
	private Dimension dim;
	private JPanel disenio,template;
	public ContenedorDerecho(Dimension dim){
		this.dim=dim;
		setBounds(dim.width-250,0,250,dim.height-28);
		setBackground(Color.BLACK);
		setLayout(null);
		crearPanel();
		crearSlide();
		crearDisenio();
		setOpaque(true);
        setVisible(true);
	}
	public void crearPanel(){
		JTabbedPane pa= new JTabbedPane();
		pa.setBounds(0,0,250,dim.height-28);
		pa.setBackground(Color.WHITE);
		disenio = new JPanel();
		disenio.setLayout(null);
		template = new JPanel();
		template.setLayout(null);
		pa.add("diseño",disenio);
		pa.add("template",template);
		add(pa);
	}
	public void crearSlide(){	 
	   JPanel pan=new JPanel();
	   pan.setBounds(10, 10, 200,100);
	   pan.setBackground(Color.BLACK);
	 //  pan.setLayout(null);
	   template.add(pan);
	   
	   JPanel pan2=new JPanel();
	   pan2.setBounds(10, 120, 200,100);
	   pan2.setBackground(Color.DARK_GRAY);
	 //  pan.setLayout(null);
	   template.add(pan2);
	   
	   repaint();
	}
	public void crearDisenio(){	 
		
		   Disenio pan=new Disenio();		 
		   pan.setLocation(10,10);
		   pan.dibujar(1);		  		
		   disenio.add(pan);
		   
		   Disenio pan2=new Disenio();
		   pan2.setLocation(10,130);
		   pan2.dibujar(2);
		   disenio.add(pan2);
		   
		   repaint();
		}
/*	public static void main(String[] args) {
		   Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		   JFrame frame=new JFrame();
		   ContenedorDerecho p =new ContenedorDerecho(dim);
		   frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		   frame.setSize(dim.width,dim.height);
		   frame.setLayout(null);
		   frame.add(p);
		   frame.setVisible(true);
	}*/
}
