package controleurs;
import vue.*;
import model.*;
import java.awt.Window;
import java.awt.event.*;
import javax.swing.*;


public class LouScoButton implements ActionListener {
	Parc p;
	public LouScoButton (Parc p2)
	{
		p=p2;
	}
	public LouScoButton () {}
public void actionPerformed(ActionEvent e) 
{
	
	JComponent comp = (JComponent) e.getSource();
	Window win =SwingUtilities.getWindowAncestor(comp);
	win.dispose();
	LouScowin r= new LouScowin(p);
	r.setVisible(true);
	r.setSize(900,600);
	r.setResizable(false); //pour que la fenetre ne peut pas se redimenssionnée
	r.setLocationRelativeTo(null);
  }
}