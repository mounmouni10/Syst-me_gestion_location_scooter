package vue;

import java.awt.*;
import javax.swing.*;
import model.*;
import controleurs.*;



public class Windoww extends JFrame{
	Parc p;
	public Windoww(Parc pp) {
		p=pp;
		contenu(); 
	}
	public static class windowJP extends JPanel{
		Parc pa;
		public windowJP(Parc pp) {pa=pp;};
		protected void paintComponent(Graphics g) {
		      Graphics2D g2d = (Graphics2D) g;
		      Image backgroundImage = new ImageIcon("Model/vue/scooter.jpg").getImage();
		      g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
		      setLayout(null);
		      
		      // Créer les boutons et les ajouter au JPanel
		        JButton louerButton = new JButton("Louer un scooter");
		        JButton rendreButton = new JButton("Rendre un scooter");
		        JButton listeButton = new JButton("Liste des scooters ");//resume du parc
		        JButton AjoutCButton = new JButton("Ajouter un client");
		        JButton AjoutSButton = new JButton("Ajouter un scooter");
				louerButton.setPreferredSize(new Dimension(150, 30));
		        rendreButton.setPreferredSize(new Dimension(150, 30));
		        listeButton.setPreferredSize(new Dimension(150, 30));
		        AjoutCButton.setPreferredSize(new Dimension(150, 30));
		        AjoutSButton.setPreferredSize(new Dimension(150, 30));
		        louerButton.setBackground(Color.LIGHT_GRAY);
		        rendreButton.setBackground(Color.LIGHT_GRAY);
		        listeButton.setBackground(Color.LIGHT_GRAY);
		        AjoutCButton.setBackground(Color.LIGHT_GRAY);
		        AjoutSButton.setBackground(Color.LIGHT_GRAY);
		        Font font = new Font("Arial", Font.PLAIN, 14);
		        louerButton.setFont(font);
		        rendreButton.setFont(font);
		        listeButton.setFont(font);
		        AjoutCButton.setFont(font);
		        AjoutSButton.setFont(font);
		        louerButton.setBounds(280, 80,400, 50);
		        rendreButton.setBounds(280, 160,400, 50);
		        listeButton.setBounds(280, 240,400, 50);
		        AjoutCButton.setBounds(280, 320, 400, 50); 
		        AjoutSButton.setBounds(280, 400, 400, 50); 
		        add(louerButton);
		        add(rendreButton);
		        add(listeButton);
		        add(AjoutCButton);
		        add(AjoutSButton);
		        
		     // declaration button en action 
			      ListButton b1= new ListButton(pa);
		          listeButton.addActionListener(b1);
		         
		          LouScoButton b2=new LouScoButton(pa);
		          louerButton.addActionListener(b2);
		           
		          AddClientButton b3=new AddClientButton(pa);
                  AjoutCButton.addActionListener(b3);
                
                  AddScooterButton b4=new AddScooterButton(pa);
                  AjoutSButton.addActionListener(b4);
		        
                  BoutonRetour b5=new BoutonRetour(pa);
                  rendreButton.addActionListener(b5);
		        
		    }
	}
	public javax.swing.JPanel jp1;
	public void contenu () { 
	   jp1= new windowJP(p); 
	   add(jp1);
	}
}
	