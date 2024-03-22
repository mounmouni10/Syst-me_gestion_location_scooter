package controleurs;
import vue.*;
import model.*;

import java.awt.Window;
import java.awt.event.*;
import javax.swing.*;

public class DoneAddS implements ActionListener {
	Parc p;

	JTextField km;
	JTextField modele;
	
	public DoneAddS(Parc pp,JTextField k,JTextField m) {
		p=pp;
		
		km=k ;
		modele=m;
		}
	public DoneAddS() {}
public void actionPerformed(ActionEvent e) 
{
	
	String Model=modele.getText();
	float ki=Float.parseFloat(km.getText());
	JComponent comp = (JComponent) e.getSource();
	Window win =SwingUtilities.getWindowAncestor(comp);
	win.dispose();
	Scooter s=new Scooter(ki,Model); 
	p.ajouterScooter(s);
	AddScooter w = new AddScooter(p);
	w.setVisible(true);
	w.setSize(900,600);
	w.setResizable(false); //pour que la fenetre ne peut pas se redimenssionnée
	w.setLocationRelativeTo(null);
	w.setTitle("Gestion de location");
	
}
}
