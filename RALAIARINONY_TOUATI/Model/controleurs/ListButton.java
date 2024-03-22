package controleurs;
import vue.*;
import model.*;
import java.awt.Window;
import java.awt.event.*;
import javax.swing.*;

public class ListButton implements ActionListener {
	Parc p;
	public ListButton(Parc p2)
	{
		p=p2;
	}
	public ListButton() {}
public void actionPerformed(ActionEvent e) 
{
	
	JComponent comp = (JComponent) e.getSource();
	Window win =SwingUtilities.getWindowAncestor(comp);
	win.dispose();
	ListScowin r= new ListScowin(p);
	r.setVisible(true);
	r.setSize(900,600);
	r.setResizable(false); //pour que la fenetre ne peut pas se redimenssionnée
	r.setLocationRelativeTo(null);	
  }
}