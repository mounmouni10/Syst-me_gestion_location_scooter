package controleurs;
import vue.Retour;
import model.*;

import java.awt.Window;
import java.awt.event.*;
import javax.swing.*;
import vue.Windoww;
public class Retourner implements ActionListener {
	Parc p;
	
	int ids;
	int idl;
	Scooter sc;
	JTable table;
	public Retourner(Parc pp,JTable j) {p=pp;table=j;}
	public Retourner() {}
public void actionPerformed(ActionEvent e) 
{
	  int id;
			int selectedRow = table.getSelectedRow();
	    // Si une ligne est sélectionnée
	    if (selectedRow != -1) {
	        // Récupérer les données de la ligne
	    	
	         id = ((Integer)table.getValueAt(selectedRow, 3)).intValue();
	         
	         p.listsct.elementAt(id).listloc.remove(p.getLocation(((Integer)table.getValueAt(selectedRow, 0)).intValue()));
	         
	         p.retour_Scooter(id);
	        } 
 JComponent comp = (JComponent) e.getSource();
	Window win =SwingUtilities.getWindowAncestor(comp);
	win.dispose();;
	Windoww w = new Windoww(p);
	w.setVisible(true);
	w.setSize(1000,700);
	w.setResizable(false); //pour que la fenetre ne peut pas se redimenssionnée
	w.setLocationRelativeTo(null);
	w.setTitle("Gestion de location");
	
}
}
