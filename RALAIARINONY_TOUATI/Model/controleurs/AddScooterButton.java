package controleurs;
import vue.*;
import model.*;
import java.awt.Window;
import java.awt.event.*;
import javax.swing.*;

//import java.lang.*;
public class AddScooterButton implements ActionListener {
	Parc p;
	public AddScooterButton (Parc p2)
	{
		p=p2;
	}
	public AddScooterButton () {}
public void actionPerformed(ActionEvent e) 
{
	
	JComponent comp = (JComponent) e.getSource();
	Window win =SwingUtilities.getWindowAncestor(comp);
	win.dispose();
	AddScooter r= new AddScooter(p);
	r.setVisible(true);
	r.setSize(900,600);
	r.setResizable(false); //pour que la fenetre ne peut pas se redimenssionnée
	r.setLocationRelativeTo(null);
  }
}