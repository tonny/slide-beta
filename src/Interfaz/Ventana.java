package Interfaz;

import java.awt.*;
import java.lang.*;
import javax.swing.*;

import java.awt.event.*;
import java.io.*;

class Ventana extends JFrame implements ActionListener
{
	private Dimension dim;
	private ContenedorPrincipal Contenedor;

	JMenu Formato      = new JMenu("Formato");
	JMenu Presentacion = new JMenu("Precentacion");
	JMenu Ayuda        = new JMenu("Ayuda");

	//Menu
	private JMenuBar  MBarra    =new JMenuBar();

	//Menu Archivo
	private JMenu Archivo       = new JMenu("Archivo");
	private JMenuItem MNuevo    =new JMenuItem("Nuevo");
	private JMenuItem MAbrir    =new JMenuItem("Abrir");
	private	JMenuItem MSalir    =new JMenuItem("Salir");
	private JMenuItem MGuardar  =new JMenuItem("Guardar");
	private JMenuItem MImprimir =new JMenuItem("Imprimir");

    //Menu Editar
	private JMenu Editar        =new JMenu("Editar");
	private JMenuItem MCortar   =new JMenuItem("Cortar");
	private JMenuItem MCopiar   =new JMenuItem("Copiar");
	private JMenuItem MPegar    =new JMenuItem("Pegar");
	private JMenuItem MBuscar   =new JMenuItem("Buscar");
	private JMenuItem MRemplazar=new JMenuItem("Reemplazar");
	private JMenuItem MSelec    =new JMenuItem("Seleccionar todo");

	// Menu de Ver
	private JMenu Ver              = new JMenu("Ver");
	private JMenuItem normal       = new JMenuItem("normal");
    private JMenuItem organizador  = new JMenuItem("organizador de diapositivas");
    private JMenuItem precentacion = new JMenuItem("precentacion");

    // Menu Insertar
    private JMenu Insertar        = new JMenu("Insertar");
    private JMenuItem diapositiva = new JMenuItem("diapositiva");
    private JMenuItem fecha       = new JMenuItem("fecha y hora");
    private JMenuItem numpag      = new JMenuItem("numero de paginas");
    private JMenuItem imagen      = new JMenuItem("imagen");
    private JMenuItem video       = new JMenuItem("video sonido");

	//Imagenes
	private ImageIcon INuevo   =new ImageIcon("imagen/nuevo1.gif");
	private ImageIcon IAbrir   =new ImageIcon("imagen/abrir.jpg");
	private ImageIcon ICopiar  =new ImageIcon("imagen/copiar1.jpg");
	private ImageIcon ICortar  =new ImageIcon("imagen/cortar.gif");
	private ImageIcon IPegar   =new ImageIcon("imagen/pegar.gif");
	private ImageIcon IGuardar =new ImageIcon("imagen/guardar.jpg");
	private ImageIcon IImprimir=new ImageIcon("imagen/impresora.jpg");
	private ImageIcon IBuscar  =new ImageIcon("imagen/buscar.gif");
	private ImageIcon ISalir   =new ImageIcon("imagen/salir.gif");
	private ImageIcon IPdf     =new ImageIcon("imagen/pdf.jpg");
	private ImageIcon IAtras   =new ImageIcon("imagen/atras.gif");
	private ImageIcon IAdelante=new ImageIcon("imagen/adelante.gif");

	//Toolbar
	private JToolBar TBarra =new JToolBar();
	private JToolBar TEditar= new JToolBar();

	private JButton BNuevo    =new JButton(INuevo);
	private JButton BAbrir    =new JButton(IAbrir);
	private	JButton BCopiar   =new JButton(ICopiar);
	private	JButton BCortar   =new JButton(ICortar);
	private	JButton BPegar    =new JButton(IPegar);
	private	JButton BGuardar  =new JButton(IGuardar);
	private	JButton BPdf      =new JButton(IPdf);
	private	JButton BImpresora= new JButton(IImprimir);
	private	JButton BAdelante = new JButton(IAdelante);
	private	JButton BAtras    = new JButton(IAtras);

	//PopUpMenu Boton derecho
	private JPopupMenu PopMenu  =new JPopupMenu ();
  	private JMenuItem PopCortar =new JMenuItem ("Cortar");
  	private JMenuItem PopCopiar =new JMenuItem ("Copiar");
  	private JMenuItem PopPegar  =new JMenuItem ("Pegar");
  	private JMenuItem PopSelTodo=new JMenuItem ("Seleccionar Todo");

  	private	String nombre=" "; //nobre del programa

	//Paleta de colores
	JButton colorTexto   = new JButton("    ");
	JLabel lcolorTexto   = new JLabel("Texto: ");
	JButton colorFondo   = new JButton("    ");
    JLabel lcolorFondo   = new JLabel("Fondo: ");
	JColorChooser colores= new JColorChooser();

	//cajas de texto
	JTextArea Texto  = new JTextArea();
	JTextArea Errores= new JTextArea(6,1);
	String Copiar="";

	public Ventana(){

		dim=Toolkit.getDefaultToolkit().getScreenSize();
		Contenedor = new ContenedorPrincipal(dim);

		//Menu Archivo
		Archivo.add(MNuevo);
		MNuevo.addActionListener(this);
		Archivo.add(MAbrir);
		MAbrir.addActionListener(this);
		Archivo.add(MSalir);
		MSalir.addActionListener(this);
		Archivo.add(MGuardar);
		MGuardar.setIcon(IGuardar);
		MGuardar.addActionListener(this);
		Archivo.add(MImprimir);
		MImprimir.setIcon(IImprimir);
		MImprimir.addActionListener(this);
		Archivo.addSeparator();
		Archivo.add(MSalir);
		MSalir.setIcon(ISalir);
		MSalir.addActionListener(this);

		//Menu Editar
		Editar.add(MCortar);
		MCortar.setIcon(ICortar);
		MCortar.addActionListener(this);
		Editar.add(MCopiar);
		MCopiar.setIcon(ICopiar);
		MCopiar.addActionListener(this);
		Editar.add(MPegar);
		MPegar.setIcon(IPegar);
		Editar.addSeparator();
		Editar.add(MBuscar);
		MBuscar.setIcon(IBuscar);
		MBuscar.addActionListener(this);
		MPegar.addActionListener(this);
		Editar.add(MRemplazar);
		MRemplazar.addActionListener(this);
		Editar.addSeparator();
		Editar.add(MSelec);
		MSelec.addActionListener(this);

		//Menu Ver
		Ver.add(normal);
	    Ver.add(organizador);
	    Ver.add(precentacion);

	    // Menu Insertar
	    Insertar.add(diapositiva);
        Insertar.add(numpag);
        Insertar.add(fecha);
        Insertar.addSeparator();
        Insertar.add(imagen);
        Insertar.add(video);

		MBarra.add(Archivo);
		MBarra.add(Editar);
		MBarra.add(Ver);
		MBarra.add(Insertar);
		MBarra.add(Formato);
		MBarra.add(Presentacion);
		MBarra.add(Ayuda);

		setJMenuBar(MBarra);



		//ToolBar
		TBarra.add(BNuevo);
		BNuevo.addActionListener(this);

		TBarra.add(BAbrir);
		BAbrir.addActionListener(this);

		TBarra.add(BGuardar);
		BGuardar.addActionListener(this);

		TBarra.addSeparator();
		TBarra.add(BPdf);
		TBarra.add(BImpresora);

		TBarra.addSeparator();
		TBarra.add(BCopiar);
		BCopiar.addActionListener(this);

		TBarra.add(BCortar);
		BCortar.addActionListener(this);

		TBarra.add(BPegar);
		BPegar.addActionListener(this);

		TBarra.addSeparator();
		TBarra.add(BAtras);
		TBarra.add(BAdelante);

		BGuardar.setToolTipText ("Guardar");
		BNuevo.setToolTipText ("Nuevo");
		BAbrir.setToolTipText ("Abrir");
		BCopiar.setToolTipText ("Copiar");
		BCortar.setToolTipText ("Cortar");
		BPegar.setToolTipText ("Pegar");
		BPdf.setToolTipText ("Exportar pdf");
		BImpresora.setToolTipText ("Imprimir");
		BAdelante.setToolTipText ("Adelante");
		BAtras.setToolTipText ("Atras");

		//Colores de fondo y texto
	//	TBarra.addSeparator();
		TEditar.add(lcolorTexto);
		TEditar.add(colorTexto);
		colorTexto.addActionListener(this);
		colorTexto.setBackground(Color.WHITE);

	    TEditar.addSeparator();
		TEditar.add(lcolorFondo);
		TEditar.add(colorFondo);
		colorFondo.addActionListener(this);
		colorFondo.setBackground(Color.WHITE);

		TBarra.setLocation(0, 0);
		TEditar.setLocation(0,30 );
		add(TBarra,"North");
	//	add(TBarra);
		Texto.requestFocus();
		TBarra.setFloatable(false);

	//	add(TEditar,"South");
	//	add(TEditar);
	//	TEditar.setFloatable(false);

		//PopUpMenu
		PopCortar.addActionListener (this);
        PopMenu.add (PopCortar);
        PopCopiar.addActionListener(this);
        PopMenu.add(PopCopiar);
        PopPegar.addActionListener(this);
        PopMenu.add(PopPegar);

        PopCortar.setIcon (ICortar);
        PopCopiar.setIcon(ICopiar);
        PopPegar.setIcon(IPegar);
        Texto.setComponentPopupMenu (PopMenu);
	/*
		//Aadir barras de scroll a la caja de texto principal
		JScrollPane barrillas=new JScrollPane(Texto,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(barrillas);

		//Aadir barras de scroll a la caja de texto de los errores
		JScrollPane barrasError=new JScrollPane(Errores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(barrasError,"South");

		*/
		//Cerrar Ventana
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			 {
			 	System.exit(0);
			 }
		});

		setTitle("Editor de Precentaciones ");
	    setSize(dim.width,dim.height);
	    add(Contenedor,"Center");
	    //setLayout(null);
		setVisible(true);

	}


		public void actionPerformed(ActionEvent ae)
		 {
		 	if(ae.getSource()==MImprimir) imprimir();

		 	if(ae.getSource()==MSalir) dispose();

		 	if(ae.getSource()==MNuevo || ae.getSource()==BNuevo) Texto.setText("");

		 	if(ae.getSource()==MCopiar || ae.getSource()==PopCopiar || ae.getSource()==BCopiar)	Texto.copy();

		 	if(ae.getSource()==MPegar || ae.getSource()==PopPegar || ae.getSource()==BPegar)	Texto.paste();

		 	if(ae.getSource()==MCortar || ae.getSource()==PopCortar || ae.getSource()==BCortar) Texto.cut();

		 	if(ae.getSource()==MSelec)
		 	{
		 		Texto.requestFocus();
		 	    Texto.selectAll();
		 	}

		 	if(ae.getSource()==BAbrir) Abrir();

		 	if(ae.getSource()==BGuardar )
		 	{
		 		Guardar ();
		 	}

		 	if(ae.getSource()==MAbrir)
		 	{
		 	    Abrir ();
		 	}

		 	if(ae.getSource()==MGuardar)
		 	{
			Guardar ();
		 	}

		/* 	if(ae.getSource()==MBuscar)
		 	{
		 		Busca Bes=new Busca(this,"Buscar...",true);
		 	}
		 	if(ae.getSource()==MRemplazar)
		 	{
		 		BuscaRemplaza ByR=new BuscaRemplaza(this,"Buscar y Reemplazar",true);
		 	}
		 */
		 	if(ae.getSource()==colorFondo){
		 		ElegirColor myColor=new ElegirColor(this,"Elegir color...",true,"fondo");
		 	}

		 	if(ae.getSource()==colorTexto){
		 		ElegirColor myColor=new ElegirColor(this,"Elegir color...",true,"texto");
		 	}
		 }
		 void Abrir ()
		 {
		 		String Text="";
	            try
				{
	           		JFileChooser fc=new JFileChooser(System.getProperty("user.dir"));
		 			fc.showOpenDialog(this);
		 			File Abrir=fc.getSelectedFile(); //Devuelve el File que vamos a leerName

		 			if(Abrir!=null)
		 			{
		 				nombre=fc.getSelectedFile().getName();
		 			}

		 			if(Abrir!=null)
		 			{
		 				Texto.setText("");
		 				FileReader Fichero=new FileReader(Abrir);
		 				BufferedReader leer=new BufferedReader(Fichero);
		 				while((Text=leer.readLine())!=null)
		 					{
		 					 Texto.append(Text+ "\n"); //append Concatena la linea leida
		 					}

		 		  		leer.close();
		 			}

		 		}
		 		catch(IOException ioe)
					{
					  System.out.println(ioe);
					}
		 }

		 void Guardar ()
		 {
		 		String Text="";
		 		try
		 		{
		 			JFileChooser fc=new JFileChooser(System.getProperty("user.dir"));
		 			fc.showSaveDialog(this);
		 			File Guardar =fc.getSelectedFile();
		 			if(Guardar !=null)
		 			{
			 			nombre=fc.getSelectedFile().getName();
			 			FileWriter  Guardx=new FileWriter(Guardar);
			 			Guardx.write(Texto.getText());
			 			Guardx.close();
		 		    }

		 		 }
		 	   catch(IOException ioe)
					{
					  System.out.println(ioe);
					}
		 }

	  void imprimir ()
       {
       	   String todo=Texto.getText();
     	  	PrintJob pjob = getToolkit().getPrintJob(this,"Imprimir Hoja",null);
	     	  	Graphics pg=  pjob.getGraphics();
	     	  	pg.setFont(new Font("SansSerif",Font.PLAIN,10));
	     	  	pg.drawString("Imprimido:",100,100);
	     	  	int inicio=0;
	     	  	int numlineas=1;
	     	  	for (int i=0; i<todo.length();i++)
	     	  	 {
	     	  	    if((int) todo.charAt(i)==10)
	     	  	     {
	     	  	    	pg.drawString(todo.substring(inicio,i-1),100,100 + (15 * numlineas));
	     	  	    	inicio=i+1;
	     	  	    	numlineas ++;
	     	  	     }
	     	  	 }
	     	  	pg.drawString (todo.substring(inicio,todo.length()),100,100 + (15 * numlineas));
	     	  	pg.dispose (); //Finalizar pagina
	     	  	pjob.end(); //Termina trabajo y escupe pagina
       }

		/* public static void main (String []args)
		 {
		 	new Ventana();
		 }*/
}