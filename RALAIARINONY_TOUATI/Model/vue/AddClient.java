package vue;
import controleurs.*;
import model.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddClient extends JFrame{
		Parc p;
		 
		JButton doneB;
		JPanel Panel;
	    JPanel Panelt;
        
	    JLabel lblCustomerName;
	     JLabel lblCustomerSurname;
	    
	     Object[][] ls= {} ;
	    
	public AddClient(Parc pp) {
		p=pp;
		conte(p); 
	}
	 public void conte (Parc pp) { 
		    setTitle("LOUSCOOT - Ajouter Client");
		    setLayout(new GridLayout(1,2));
		    float[] hsbValues = new float[3];
		     JTextField txtCustomerName;
		     JTextField txtCustomerSurname;
		    JTable table;
	        Panel = new JPanel();
	        Panel.setLayout(null);
	        Panel.setPreferredSize(new Dimension(200, 300));
	     
	        
			
	        
	        
	        lblCustomerName = new JLabel("Nom :");
	        lblCustomerName.setBounds(60,90,130,30);
	        lblCustomerName.setFont(new Font("Arial",Font.BOLD,15));
	        txtCustomerName = new JTextField();
	        txtCustomerName.setBounds(170,90,100,25);
	      	        
	       
	        
	        lblCustomerSurname = new JLabel("Prénom :");
	        lblCustomerSurname.setBounds(60,120,130,30);
	        lblCustomerSurname.setFont(new Font("Arial",Font.BOLD,15));
	        txtCustomerSurname = new JTextField();
	        txtCustomerSurname.setBounds(170,120,100,25);
	      	        
	        doneB=new JButton("Ajouter ");
	        doneB.setBounds(250,200,150,30);
	        doneB.setFont(new Font("Arial",Font.BOLD,15));
	        JButton Back = new JButton("Retour Au Menu ");
	        Back.setBounds(50, 200, 160, 30);
	        Back.setFont(new Font("Arial",Font.BOLD,15));
	        Color.RGBtoHSB(0, 0, 0 , hsbValues);
	        Back.setForeground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        Color.RGBtoHSB(255, 241, 220, hsbValues);
	        Back.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        Color.RGBtoHSB(0, 0, 0, hsbValues);
	        doneB.setForeground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        Color.RGBtoHSB(255, 241, 220, hsbValues);
	        doneB.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));

	       RetourHoma dacc=new RetourHoma(pp);
	       DoneAddC  dac=new DoneAddC(pp,txtCustomerName,txtCustomerSurname);
	        doneB.addActionListener(dac);
	        Back.addActionListener(dacc);
	        
	        Panel.add(doneB);
	        Panel.add(Back);
	        
	        Panel.add(lblCustomerName);
	        Panel.add(txtCustomerName);
	        
	        Panel.add(lblCustomerSurname);
	        Panel.add(txtCustomerSurname);
//-------------------------------------------------------------------------------------------------------
	        Panelt = new JPanel();
	        Panelt.setBounds(201,0,500, 700);;
	        Panelt.setLayout(new BorderLayout());
	        Panelt.setBorder(new EmptyBorder(10, 10, 10, 10));
//-------------------------------------------------------------------------------------------------------
	        setTableDataC(pp.VCtoTable(pp.listeclient));
	        String[] columname ={"ID", "Nom","Prénom"};
	        table= new JTable(ls,columname);
	        JScrollPane scrollPane = new JScrollPane(table);
	        Panelt.add(scrollPane, BorderLayout.CENTER);
	        Font font = new Font("Arial", Font.BOLD, 12);
	        table.setFont(font);
	        Color.RGBtoHSB(69, 69, 69, hsbValues);
	        table.setGridColor(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        Color.RGBtoHSB(58, 152, 185, hsbValues);
	        table.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
//-------------------------------------------------------------------------------------------------------
	        Color.RGBtoHSB(232, 213, 196, hsbValues);
	        Panel.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	        Color.RGBtoHSB(232, 213, 196, hsbValues);
	        Panelt.setBackground(Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]));
	  	         
	        
	        add(Panel);
	        add(Panelt);
 
	        
		 }
	 public void  setTableDataC(Object[][] l) {
		 ls=l;}
}
