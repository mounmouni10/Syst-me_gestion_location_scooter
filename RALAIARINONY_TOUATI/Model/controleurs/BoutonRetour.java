package controleurs;
import vue.Retour;
import model.*;
import java.awt.Window;
import java.awt.event.*;
import javax.swing.*;
public class BoutonRetour implements ActionListener {
	Parc p;
	public BoutonRetour(Parc p2)
	{
		p=p2;
	}
	public BoutonRetour() {}
public void actionPerformed(ActionEvent e) 
{
	
	JComponent comp = (JComponent) e.getSource();
	Window win = SwingUtilities.getWindowAncestor(comp);
	win.dispose();
	Retour r= new Retour(p);
	r.pack();
	r.setVisible(true);
	
}
}
