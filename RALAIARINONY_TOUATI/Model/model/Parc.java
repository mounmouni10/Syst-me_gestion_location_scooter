
package model;
/**
 * 
 */
import java.util.*;
import java.time.LocalDate;

public class Parc {
	public static int id=0;
    /**
     * Default constructor
     */
    public Parc() {
    }
    /**
     * 
     */
    private String nomp;
    public Vector<Scooter> listsct=new Vector<Scooter>();
    public void ajouterScooter(Scooter sc) 
    {
    	listsct.add(sc);
    }
    /**
     * 
     */
    public Vector<Client> listeclient=new Vector<Client>();
    public void ajouterClient(Client c ) 
    {
    	listeclient.add(c);
    }
    public Parc(String nom) {nomp=nom;}
    			/* methode pour les variables internes de parc*/
    public String get_nomp() {return nomp;}
    public void set_nomp(String nom) {nomp=nom;}


    public void loue_Scooter(int idS,int idC,LocalDate d,LocalDate f) {
    	Vector<Scooter> vs=new Vector<Scooter>();
    	vs=getListFreeScoot(d,f);
   	 for(Scooter sc:vs) 
   	 {
   		 if(sc.get_idSC()==idS) 
   		 {
   			 sc.set_etat(false);
   			 Location l=new Location(d,f);
   			 for(Client cl:listeclient) {if(cl.get_idC()==idC) {cl.listloc.add(l);}}
   			 sc.listloc.add(l);
   			 id++;
   		 }
   	 }
    }
    
    public void retour_Scooter(int idS) {
    	for(Scooter sc:listsct) 
      	 {
      		 if(sc.get_idSC()==idS) 
      		 {
      			 if(sc.get_etat()==false) {sc.set_etat(true);}
      		 }
      	 }
    }
    public Vector<String> get_etat_scooter(int idS)
    {
    	Vector<String> records=new Vector<String>();
    	for(Scooter sc:listsct) 
     	 {
     		 if(sc.get_idSC()==idS) 
     		 {
     			records.add(sc.get_modele());
     			records.add(sc.get_idSC()+"");
     			records.add(sc.get_km()+"");
     			records.add(sc.get_etat()+"");
     			return records;
     		 }
     	 }
    	records.add("erreur");
    	return records;
    }
    public Vector<String> get_etat_parc()
    {
    	Vector<String> records=new Vector<String>();
    	for(Scooter sc:listsct) 
    	 {
    	
    			records.add(sc.get_modele());
    			records.add(sc.get_idSC()+"");
    			records.add(sc.get_km()+"");
    			records.add(sc.get_etat()+"");
    	 }
   	return records;
    }
    public Vector<String> get_resumer_parc()
    {
    	int a=0;
    	int b=0;
    	Vector<String> records=new Vector<String>();
    	records.add(listsct.size()+"");
    	for(Scooter sc:listsct) 
    	 {
    			if(sc.get_etat()) {a++;records.add(sc.get_idSC()+"");}
    	 }
    	records.add("-");
    	records.add(a+"");
    	for(Scooter sc:listsct) 
   	 {
   			if(sc.get_etat()) {b++;records.add(sc.get_idSC()+"");}
   	 }
    	records.add("-");
    	records.add(b+"");
   	return records;
    }
    
    public Vector<Scooter> getListFreeScoot(LocalDate d, LocalDate f)
    	{
    		Vector<Scooter> vs=new Vector<Scooter>();
    		for(Scooter c :listsct) 
    		{
    			if(c.isFree(d, f)) 
    			{
    				vs.add(c);
    			}
    		}
    	 return vs; 	
    	}
    public Vector<Location> getListLocation()
    {
    	Vector<Location> vl=new Vector<Location>();
    	for(Scooter c: listsct) 
    	{
    		for(Location l :c.listloc) {vl.add(l);}
    	}
    	return vl;
    }
    public Scooter getScoot(Location l) 
    
    {
    	for(Scooter c: listsct) 
    	{
    		for(Location li :c.listloc) {if(li.get_idL()==l.get_idL()) {return c;}}
    	}
    	return null;
    }
    public Location getLocation(int i) {	
    	for(Location l:this.getListLocation()) {if( i==l.get_idL()) {return l;}}
    	return null;	}
    public Vector<Scooter> getListNoFree()
 	{
 		Vector<Scooter> vs=new Vector<Scooter>();
 		for(Scooter c :listsct) 
 		{
 			if(!c.get_etat()) 
 			{
 				vs.add(c);
 			}
 		}
 	 return vs; 	
 	}
    
    
    
   public Object[][] toTable(Vector <Scooter> v){
	   Object [][] l= new Object [v.size()][4]; 
	   for (int i = 0; i < v.size(); i++) {
	        Scooter scooter = v.get(i);
	        l[i][0] = scooter.get_idSC();
	        l[i][1] = scooter.get_modele();
	        l[i][2] = scooter.get_km();
	        l[i][3] = scooter.get_etat();
	    }
	   
	   return l;
   }
   
   public Object[][] toTablelocation(Vector <Location> vl){
	   Object [][] l= new Object [vl.size()][5]; 
	   for (int i = 0; i < vl.size(); i++) {
	        Location location = vl.get(i);
	        l[i][0] = location.get_idL();
	        l[i][1] = location.get_dateD();
	        l[i][2] = location.get_dateF();
	        l[i][3] = this.getScoot(location).get_idSC();
	        l[i][4] = this.getScoot(location);
	    }
	   
	   return l;
   }
   
   public Object[][] VCtoTable(Vector <Client> v){
	   Object [][] l= new Object [v.size()][3]; 
	   for (int i = 0; i < v.size(); i++) {
	        Client C = v.get(i);
	        l[i][0] = C.get_idC();
	        l[i][1] = C.get_nomC();
	        l[i][2] = C.get_prenomC();  
	    } 
	   return l;
   }
    
}
