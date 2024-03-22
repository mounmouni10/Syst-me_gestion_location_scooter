package controleurs;
import vue.*;
import model.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

public class SelectScoButton implements ActionListener {
	Parc p;
	JTable t;
	LocalDate dd,df;
	int idc;

	public SelectScoButton(Parc p2,JTable ta,LocalDate dD, LocalDate dF,int id)
	{
		p=p2;
		t=ta;
		dd=dD;
		df=dF;
		idc=id;
	}
	public SelectScoButton() {}
	@Override
public void actionPerformed(ActionEvent e) 
{       int id;
		int selectedRow = t.getSelectedRow();
    // Si une ligne est sélectionnée
    if (selectedRow != -1) {
        // Récupérer les données de la ligne
         id = ((Integer)t.getValueAt(selectedRow, 0)).intValue();
        p.loue_Scooter(id, idc, dd,df);
        } 	
    JComponent comp = (JComponent) e.getSource();
	Window win =SwingUtilities.getWindowAncestor(comp);
	win.dispose();
	Windoww r= new Windoww(p);
	r.setVisible(true);
	r.setSize(900,600);
	r.setResizable(false); //pour que la fenetre ne peut pas se redimenssionnée
	r.setLocationRelativeTo(null);
  }
}
