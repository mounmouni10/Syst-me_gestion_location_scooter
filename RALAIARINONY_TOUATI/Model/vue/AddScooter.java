package vue;
import Main.Main;
import vue.Windoww.windowJP;
import controleurs.*;
import model.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
public class AddScooter extends JFrame{
		Parc p;
		 DoneAddS das;
		 JButton doneB;
		 JPanel scooterPanel;
		 JPanel Panel;
		
	   
	     JLabel lblScooterkm;
	     JLabel lblScooterModele;
	   
	     JTextField txtScooterkm;
	     JTextField txtScooterModele;
	     Object[][] ls= {} ;
	public AddScooter(Parc pp) {
		p=pp;
		conte(p); 
	}
	 public void conte (Parc pp) { 
		    float[] hsbValues = new float[3];

		    setTitle("LOUSCOOT - Ajouter Scooter");
		    setLayout(new GridLayout(1,2));
		
	        scooterPanel = new JPanel();
	        scooterPanel.setLayout(null);
	        Color.RGBtoHSB(232, 213, 196, hsbValues);
	        scooterPanel.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	  	        
			
	        
	        lblScooterkm = new JLabel("Kilometrage effectué : ");
	        lblScooterkm.setBounds(30,120,180,30);
	        lblScooterkm.setFont(new Font("Arial",Font.BOLD,15));
	        txtScooterkm = new JTextField();
	        txtScooterkm.setBounds(220,120,115,25);
	        Color.RGBtoHSB(0, 0, 0, hsbValues);
	        lblScooterkm.setForeground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        
	  	        
			
	        lblScooterModele = new JLabel("Modele :");
	        lblScooterModele.setBounds(30,90,150,30);
	        lblScooterModele.setFont(new Font("Arial",Font.BOLD,15));
	        txtScooterModele = new JTextField();
	        txtScooterModele.setBounds(220,90,115,25);
	        Color.RGBtoHSB(0,0 , 0, hsbValues);
	        lblScooterModele.setForeground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        
	  	        
	        doneB=new JButton("Ajouter ");
	        doneB.setBounds(240,200,150,30);
	        doneB.setFont(new Font("Arial",Font.BOLD,15));
	        Color.RGBtoHSB(0, 0, 0, hsbValues);
	        doneB.setForeground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        das=new DoneAddS(p,txtScooterkm,txtScooterModele);
	        doneB.addActionListener(das);
	        JButton Back = new JButton("Retour Au Menu ");
	        Back.setBounds(40, 200, 160, 30);
	        Back.setFont(new Font("Arial",Font.BOLD,15));
	        Color.RGBtoHSB(0, 0, 0 , hsbValues);
	        Back.setForeground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        
	       RetourHoma dacc=new RetourHoma(pp);
	        Back.addActionListener(dacc);
	        Color.RGBtoHSB(255, 241, 220, hsbValues);
	        doneB.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        
	        Color.RGBtoHSB(255, 241, 220, hsbValues);
	        Back.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	       
	        
	        scooterPanel.add(Back);
	        scooterPanel.add(doneB);
	       
	        
	        scooterPanel.add(lblScooterkm);
	        scooterPanel.add(txtScooterkm);
	        
	        scooterPanel.add(lblScooterModele);
	        scooterPanel.add(txtScooterModele);
 //_________________________________________________________________________________________
  //-------------------------------------------------------------------------------------------------------
	        Panel = new JPanel();
	        Panel.setBounds(201,0,500, 700);;
	        Panel.setLayout(new BorderLayout());
	        Panel.setBorder(new EmptyBorder(10, 10, 10, 10));
	        Color.RGBtoHSB(232, 213, 196, hsbValues);
	        Panel.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
//-------------------------------------------------------------------------------------------------------
	        setTableDatas(pp.toTable(pp.listsct));
	        String[] columname ={"ID","Modele","Kilometrage"};
	        JTable table= new JTable(ls,columname);
	        JScrollPane scrollPane = new JScrollPane(table);
	       
	        Panel.add(scrollPane, BorderLayout.CENTER);
	        Font font = new Font("Arial", Font.BOLD, 12);
	        table.setFont(font);
	        Color.RGBtoHSB(69, 69, 69, hsbValues);
	        table.setGridColor(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        Color.RGBtoHSB(58, 152, 185, hsbValues);
	        table.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
//-------------------------------------------------------------------------------------------------------
	       
	       add(scooterPanel);
	       add(Panel);
		 }
	 public void  setTableDatas(Object[][] l) {
		 ls=l;}
		
}