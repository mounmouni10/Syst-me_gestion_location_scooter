package controleurs;
import vue.*;
import model.*;
import java.awt.Window;
import java.awt.event.*;
import javax.swing.*;

//import java.lang.*;
public class AddClientButton implements ActionListener {
	Parc p;
	//JTextField ID, Nom,Pre;
	public AddClientButton (Parc p2)
	{
		p=p2;
		
	}
	
	public AddClientButton () {}
public void actionPerformed(ActionEvent e) 
{
	
	JComponent comp = (JComponent) e.getSource();
	Window win =SwingUtilities.getWindowAncestor(comp);
	win.dispose();
	AddClient r= new AddClient(p);
	r.setVisible(true);
	r.setSize(900,600);
	r.setResizable(false); //pour que la fenetre ne peut pas se redimenssionnée
	r.setLocationRelativeTo(null);
  }
}