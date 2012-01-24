package Vossen_Konijnen;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Controller extends JPanel implements ActionListener
{
	
	private Simulator sim;
	private SimulatorView simview;
	//private JFrame screen;	
	private JButton eenstap;
	private JButton honderdstappen;	
	
	public Controller() 
	{			
		
		setSize(450, 50);
		
		//screen = new JFrame("Vossen_Konijnen");
		//Container contents = screen.getContentPane();
		//contents.setLayout(new GridLayout(0,1));		
		
		eenstap = new JButton("1 stap");
		add(eenstap);		
		eenstap.addActionListener(this);
		
	    //honderdstappen = new JButton("100 stappen");
	    //honderdstappen.addActionListener(this);	    
	    //contents.add(honderdstappen, BorderLayout.CENTER);
	    //screen.pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
	}

}
