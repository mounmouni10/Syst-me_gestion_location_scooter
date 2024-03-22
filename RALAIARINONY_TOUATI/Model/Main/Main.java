package Main;
import vue.*;
import model.*;


public class Main {
	

	public static void main (String[] args) {
		Parc p=new Parc("LooScoot");
		Scooter s1=new Scooter(400,"XP400 ALLURE");
		Scooter s2=new Scooter(1345,"PEUGEOT METROPOLIS 400 ACTIVE");
		Scooter s3=new Scooter(1890,"XP400 GT");
		Scooter s4=new Scooter(500,"PEUGEOT TWEET 125");
		Scooter s5=new Scooter(231,"XP400 ALLURE");
		
		Client c1 = new Client("TOUATI","Mounia");
		Client c2 = new Client("MELLITI","Tarek");
		Client c3 = new Client("BAYATI","Léa");
		Client c4 = new Client("Ralaiarinony Mirindra ","Johan");
		Client c5 = new Client("KHUN","Hugo");
		Client c6 = new Client("Franco Alves","José");
	
		p.ajouterClient(c1);
		p.ajouterClient(c2);
		p.ajouterClient(c3);
		p.ajouterClient(c4);
		p.ajouterClient(c5);
		p.ajouterClient(c6);
		
		p.ajouterScooter(s1);
		p.ajouterScooter(s2);
		p.ajouterScooter(s3);
		p.ajouterScooter(s4);
		p.ajouterScooter(s5);
		
		
		Windoww w = new Windoww(p);
		w.setVisible(true);
		w.setSize(900,600);
		w.setResizable(false); //pour que la fenetre ne peut pas se redimenssionnée
		w.setLocationRelativeTo(null);
		w.setTitle("LOUSCOOT ");
		 
	}
	
}