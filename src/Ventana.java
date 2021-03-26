import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.util.Random;

public class Ventana {
    //variables y contenedores
    private JLabel etiquetaSu;
    private JPanel panelIzquierdo, panelCenter, panelDerecho, panelInferior;
    private JButton botonIz1;
    private JButton botonDe1;
    private JButton botonIn1; 
    private JScrollPane scroll;
    private JButton boton1,boton2,boton3, boton4, boton5, boton6, boton7, boton8, boton9;
    
    public void contruyePanelIzquierdo(){
        panelIzquierdo=new JPanel();
        botonIz1=new JButton("MYWEATHER ☩");
        JButton botonIz1 = new JButton("MYWEATHER ☩");

        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo,BoxLayout.Y_AXIS));
        panelIzquierdo.setBackground(Color.yellow);
        panelIzquierdo.add(botonIz1);
    }

    public void contruyePanelDerecho(){
        panelDerecho = new JPanel();
        botonDe1=new JButton("McGREGOR ☩");
        panelDerecho.setLayout(new BoxLayout(panelDerecho,BoxLayout.Y_AXIS));
        panelDerecho.setBackground(Color.cyan);
        panelDerecho.add(botonDe1);
    }

    public void contruyePanelInferior(){
        panelInferior = new JPanel();
        botonIn1=new JButton("AMOR");
        
        botonIn1=new JButton("ODIO");
        panelInferior.setLayout(new FlowLayout());
        panelInferior.setBackground(Color.magenta);
        panelInferior.add(botonIn1);
        panelInferior.add(botonIn1);
    }
    
    public void contruyePanelCenter(){
    	Random rand = new Random();
    	panelCenter.setLayout(new GridLayout(3,3));
    	boton1=new JButton("X");
    	boton2=new JButton("X");
    	boton3=new JButton("X");
    	boton4=new JButton("X");
    	boton5=new JButton("X");
    	boton6=new JButton("X");
    	boton7=new JButton("X");
    	boton8=new JButton("X");
    	boton9=new JButton("X");
    	
    	 panelCenter = new JPanel();
        
    	 panelCenter.setLayout(new FlowLayout());
    	 panelCenter.setBackground(Color.magenta);
    	 panelCenter.add(boton1);
    	 panelCenter.add(boton2);
    	 panelCenter.add(boton3);
    	 panelCenter.add(boton4);
    	 panelCenter.add(boton5);
    	 panelCenter.add(boton6);
    	 panelCenter.add(boton7);
    	 panelCenter.add(boton8);
    	 panelCenter.add(boton9);
    	 
         
    	
        panelCenter = new JPanel();
        panelCenter.setLayout(new FlowLayout());
        panelCenter.setBackground(Color.black);
    }
    
    

    public void contruyeVentana(){
        JFrame frame = new JFrame();
        scroll = new JScrollPane(new JTextArea("JTextArea",22,44));
        etiquetaSu = new JLabel("☩  TREX EN RAYA ☩  " );
        Font aux=etiquetaSu.getFont();
        etiquetaSu.setFont(new Font(aux.getFontName(), aux.getStyle(), 55));
        frame.setLayout(new BorderLayout());

        //agregamos los paneles al frame principal
        frame.add(etiquetaSu,BorderLayout.NORTH);
        frame.add(scroll, BorderLayout.CENTER);
        frame.add(panelIzquierdo,BorderLayout.WEST);
        frame.add(panelDerecho,BorderLayout.EAST);
        frame.add(panelInferior,BorderLayout.SOUTH);
        frame.add(panelCenter,BorderLayout.CENTER);
        //Configuramos el frame
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public Ventana(){
        contruyePanelInferior();
        contruyePanelIzquierdo();
        contruyePanelDerecho();
        contruyePanelCenter();
        contruyeVentana();
    }

    public static void main (String [] inforux){
        new Ventana();
    }

	public void setVisible(boolean b) {
		// TODO Apéndice de método generado automáticamente
		
	}
}

	