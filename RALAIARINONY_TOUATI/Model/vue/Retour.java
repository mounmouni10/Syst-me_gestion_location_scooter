package vue;
import vue.Windoww.windowJP;
import controleurs.*;
import model.*;
import java.awt.*;
import java.time.LocalDate;

import javax.swing.*;

import java.util.*;
public class Retour extends JFrame {
 Parc p;
 JTable table;
 Object[][] ls= {} ;
 JScrollPane scrollPane ;
 JButton selectButton;
public Retour(Parc pp) 
{	
	p=pp;
	 float[] hsbValues = new float[3];
	 setTitle("LOUSCOOT - Rendre Scooter ");
	setTableData(pp.toTablelocation(pp. getListLocation()));
	
	String[] columname ={"Id Location", "Date Debut","Date fin ","Id Scooter"};	
	
	JTable table= new JTable(ls,columname);
   Font font = new Font("Arial", Font.BOLD, 12);
    table.setFont(font);
	 table.setFont(font);
     Color.RGBtoHSB(69, 69, 69, hsbValues);
     table.setGridColor(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
     Color.RGBtoHSB(58, 152, 185, hsbValues);
     table.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
    getContentPane().add(table.getTableHeader(),BorderLayout.NORTH);
    getContentPane().add(table, BorderLayout.CENTER);
    
    
    font = new Font("Arial", Font.BOLD, 20);
     selectButton = new JButton("Sélectionner La location a supprimer");
     selectButton.setFont(font);
     Color.RGBtoHSB(0, 0, 0, hsbValues);
     selectButton.setForeground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
    Color.RGBtoHSB(255, 241, 220, hsbValues);
     selectButton.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
     scrollPane = new JScrollPane(table);
     add(selectButton,BorderLayout.SOUTH);
     add(scrollPane, BorderLayout.CENTER);
     
     Retourner b1= new Retourner(pp,table);
        selectButton.addActionListener(b1); 
}
public void  setTableData(Object[][] l) {
	   ls=l;
	}
}


