package controleurs;
import vue.AddClient;
import model.*;

import java.awt.Window;
import java.awt.event.*;
import javax.swing.*;

public class DoneAddC implements ActionListener {
	Parc p;
	
	JTextField nom;
	JTextField prenom;
	Client c;
	public DoneAddC(Parc pp,JTextField n,JTextField pn) {
		p=pp;
		
		nom=n;
		prenom=pn;
		}
	public DoneAddC() {}
public void actionPerformed(ActionEvent e) 
{
	
	String name=nom.getText();
	String sname=prenom.getText();
	
	JComponent comp = (JComponent) e.getSource();
	Window win =SwingUtilities.getWindowAncestor(comp);
	win.dispose();
	Client c=new Client(name,sname);
	p.ajouterClient(c);
	AddClient w = new AddClient(p);
	w.setVisible(true);
	w.setSize(900,600);
	w.setResizable(false); //pour que la fenetre ne peut pas se redimenssionnée
	w.setLocationRelativeTo(null);
	w.setTitle("Gestion de location");
	
}
}
