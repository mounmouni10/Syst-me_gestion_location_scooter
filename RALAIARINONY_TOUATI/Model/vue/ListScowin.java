package vue;
import Main.Main;
import vue.Windoww.windowJP;
import controleurs.*;
import model.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ListScowin extends JFrame{
	
	Parc p;
	 JTable table;
	 Object[][] ls= {} ;
	 JButton retourButton;
	public ListScowin(Parc pp) {
		p=pp;
		float[] hsbValues = new float[3];
		setTitle("LOUSCOOT - Liste Scooters ");
		setTableData(pp.toTable(pp.listsct));
		
		String[] columname ={"ID", "Modele","Kilometrage"};	
		
		JTable table= new JTable(ls,columname);
		
	    getContentPane().add(table.getTableHeader(),BorderLayout.NORTH);
	    getContentPane().add(table, BorderLayout.CENTER);
	    Font font = new Font("Arial", Font.BOLD, 12);
	    table.setFont(font);
	    Color.RGBtoHSB(69, 69, 69, hsbValues);
        table.setGridColor(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
        Color.RGBtoHSB(232, 213, 196, hsbValues);
        table.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
        font = new Font("Arial", Font.BOLD, 15);
	     retourButton = new JButton("retourner au Menu");
	     retourButton.setFont(font);
	     Color.RGBtoHSB(0, 0, 0, hsbValues);
	     retourButton.setForeground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	       Color.RGBtoHSB(255, 241, 220, hsbValues);
	       retourButton.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	 
	     add(retourButton,BorderLayout.SOUTH);
	     RetourHoma b1= new RetourHoma(pp);
	        retourButton.addActionListener(b1); 
	        }
	 public void  setTableData(Object[][] l) {
		   ls=l;
		}

}
		      
		      
		      
		      
		  