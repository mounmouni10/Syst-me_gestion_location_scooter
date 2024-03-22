package vue;
import Main.Main;
import vue.Windoww.windowJP;
import controleurs.*;
import model.*;
import java.awt.*;
import java.util.*;
import java.time.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ListScoDispowin extends JFrame{
	Parc p;
	JTable table;
	Object[][] ls= {} ;
	LocalDate db ; 
	LocalDate df;
	int idc;
	JScrollPane scrollPane ;
    JButton selectButton;
	public ListScoDispowin(Parc pp , LocalDate d ,LocalDate f, int idC) {
		p=pp;
		db=d;
		df=f;
		idc=idC;
		unit(p,d,f,idc); 
	}
	 public void unit (Parc pp,LocalDate dd,LocalDate ff,int idd) { 
		 float[] hsbValues = new float[3];
		 setTitle("LOUSCOOT - Louer Scooter - Liste Scooters Disponibles ");
		 Color.RGBtoHSB(232, 231, 196, hsbValues);
	        this.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
			setTableData(pp.toTable(pp.getListFreeScoot(dd, ff)));
		  String[] columname ={"ID", "Modele","Kilometrage","Disponible"};
		  
		  JTable table= new JTable(ls,columname);
	      getContentPane().add(table.getTableHeader(),BorderLayout.NORTH);
	      getContentPane().add(table, BorderLayout.CENTER);
	      Font font = new Font("Arial", Font.BOLD, 12);
	      table.setFont(font);
	      Color.RGBtoHSB(69, 69, 69, hsbValues);
	        table.setGridColor(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        Color.RGBtoHSB(58, 152, 185, hsbValues);
	        table.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	      
	      // Ajouter la table dans un JScrollPane pour permettre le défilement
	        font = new Font("Arial", Font.BOLD, 20);
	       selectButton = new JButton("Séléctionner un scooter ");
	       selectButton.setFont(font);
	       Color.RGBtoHSB(0, 0, 0, hsbValues);
	        selectButton.setForeground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	       Color.RGBtoHSB(255, 241, 220, hsbValues);
	        selectButton.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	       scrollPane = new JScrollPane(table);
	   
	       add(selectButton,BorderLayout.SOUTH);
	       add(scrollPane, BorderLayout.CENTER);
	       SelectScoButton b1= new SelectScoButton(pp,table,dd,df,idd);
	          selectButton.addActionListener(b1); 
		}
	 
	 public void  setTableData(Object[][] l) {
		   ls=l;
		}

}
		      
		      
		      
		      
		  