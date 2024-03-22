package vue;
import Main.Main;
import vue.Windoww.windowJP;
import controleurs.*;
import model.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class LouScowin extends JFrame{
	Parc p;
	    JPanel Panel;
	     JPanel scooterPanel;
         JLabel Forum;
	     JLabel lblCustomerId;
	     JTextField txtCustomerId;
	     JLabel lblStartDate;
	     JLabel lblEndDate;
	     JDateChooser dtStartDate;
	     JDateChooser dtEndDate;

	public LouScowin(Parc pp) {
		p=pp;
		conte(p); 
	}
	 public void conte (Parc pp) { 
		    setTitle("LOUSCOOT - Louer Scooter");
		    float[] hsbValues = new float[3];
	        Panel = new JPanel();
	        Panel.setLayout(null);   
	        Color.RGBtoHSB(232, 213, 196, hsbValues);
	        Panel.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
  
	        lblCustomerId = new JLabel("ID client :");
	        lblCustomerId.setBounds(60,60,130,30);
	        Color.RGBtoHSB(0,0 , 0, hsbValues);
	        lblCustomerId.setForeground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        lblCustomerId.setFont(new Font("Arial",Font.BOLD,15));
	        txtCustomerId = new JTextField();
	        txtCustomerId.setBounds(170,60,130,25);
               
	        Panel.add(lblCustomerId);
	        Panel.add(txtCustomerId);
	        lblStartDate = new JLabel("Date de début :");
	        Color.RGBtoHSB(0,0 , 0, hsbValues);
	        lblStartDate.setForeground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        lblStartDate.setBounds(60,120,130,30);
	        lblStartDate.setFont(new Font("Arial",Font.BOLD,15));
	        dtStartDate=new JDateChooser();
	        dtStartDate.setMinSelectableDate(new Date());
	        dtStartDate.setDateFormatString("dd/MM/yyyy"); 
	        dtStartDate.setBounds(200,120,150,25); 
	        
	        lblEndDate = new JLabel("Date de fin :");
	        lblEndDate.setBounds(380,120,130,30);
	        Color.RGBtoHSB(0,0 , 0, hsbValues);
	        lblEndDate.setForeground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        lblEndDate.setFont(new Font("Arial",Font.BOLD,15));
	        dtEndDate=new JDateChooser();
	        dtEndDate.setMinSelectableDate(new Date());
	 
	        dtEndDate.setDateFormatString("dd/MM/yyyy"); 
	        dtEndDate.setBounds(520,120,150,25);
	       
	        JButton Back = new JButton("Retour Au Menu ");
	        Back.setBounds(50, 200, 200, 30);
	        Back.setFont(new Font("Arial",Font.BOLD,15));
	        Color.RGBtoHSB(0, 0, 0 , hsbValues);
	        Back.setForeground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        Color.RGBtoHSB(255, 241, 220, hsbValues);
	        Back.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        //_________________________________________________________________
	        JButton SDispoB = new JButton("Rechercher Les Scooters Disponible ");
	        SDispoB.setBounds(400, 200, 350, 30);
	        SDispoB.setFont(new Font("Arial",Font.BOLD,15));
	        ScoDispoButton b= new ScoDispoButton (pp,dtStartDate,dtEndDate,txtCustomerId);
	       
	        Color.RGBtoHSB(0, 0, 0 , hsbValues);
	        SDispoB.setForeground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        Color.RGBtoHSB(255, 241, 220, hsbValues);
	        SDispoB.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        RetourHoma r= new RetourHoma (pp);
	        SDispoB.addActionListener(b);
	        Back.addActionListener(r);
	        Panel.add(lblStartDate);
	        Panel.add(lblStartDate);
	        Panel.add(dtStartDate);
	        Panel.add(lblEndDate);
	        Panel.add( dtEndDate);
	        Panel.add(SDispoB);
	        Panel.add(Back);
	        add(Panel);
	      
		 }
		
}