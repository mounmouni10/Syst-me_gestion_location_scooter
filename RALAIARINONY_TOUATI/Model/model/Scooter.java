
package model;
import java.util.*;
import java.time.*;
public class Scooter {

    public Scooter() {
    }
    
    public static int idSCstat=0;
    
    private int idSC;

    private float km;

    private boolean etat;

    private String modele;

    public Parc parc;
    
    public void setParc(Parc p) {parc=p;}

    public Vector<Location> listloc=new Vector<Location>();
    public void ajouterLocation(Location l ) 
    {
    	listloc.add(l);
    }
    public Scooter( float kmm , String model){idSC=idSCstat;km=kmm;etat=true ;modele=model;idSCstat++;}
    public Scooter( float kmm , boolean eta, String model) {idSC=idSCstat;km=kmm;etat=eta;modele=model;idSCstat++;}
    
    public int  get_idSC() {return idSC;}
    public void set_idSC(int id) {idSC=id;}
    
    public float  get_km() {return km;}
    public void set_km(float kmm) {km=kmm;}
    
    public boolean  get_etat() {return etat;}
    public void set_etat(boolean eta) {etat=eta;}
    
    public String  get_modele() {return modele;}
    public void set_modele(String model) {modele=model;}

    public boolean isFree(LocalDate d, LocalDate f) {
    	for(Location l:listloc) {
    		if(l.isIntersect(d, f)) {return false;}
    	}
    	return true;
    }
    
}