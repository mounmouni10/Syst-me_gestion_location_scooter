package controleurs;
import java.awt.Window;
import java.awt.event.*;
import javax.swing.*;

import model.*;
import vue.Windoww;
public class RetourHoma implements ActionListener {
	
	Parc p;
	public RetourHoma(Parc p2) 
	{
		p=p2;
		
	}
	public RetourHoma() {}
public void actionPerformed(ActionEvent e) 
{
	JComponent comp = (JComponent) e.getSource();
	Window win =SwingUtilities.getWindowAncestor(comp);
	win.dispose();
	Windoww r = new Windoww(p);
	r.setVisible(true);
	r.setSize(1000,700);
	r.setResizable(false); //pour que la fenetre ne peut pas se redimenssionnée
	r.setLocationRelativeTo(null);
	r.setTitle("Gestion de location");

}
}