
package model;

import java.time.LocalDate;
/**
 * 
 */
public class Location {

    /**
     * Default constructor
     */
    public Location() {
    }
    /**
     * 
     */
    public static int idLstat=0;
    private int idL;

    /**
     * 
     */
    private LocalDate dateD;

    /**
     * 
     */
    private LocalDate dateF;
    public boolean isIntersect(LocalDate d, LocalDate f) 
    {
        if(d.isEqual(dateD)) {return true;}
        if(f.isEqual(dateF)) {return true;}
        if(d.isAfter(dateD)&&d.isBefore(dateF)){return true;}
        if(f.isBefore(dateF)&&f.isAfter(dateD)){return true;}
        if(dateD.isAfter(d)&&dateD.isBefore(f)){return true;}
        if(dateF.isBefore(f)&&dateF.isAfter(d)){return true;}
        return false;
    }
    public Location( LocalDate datea  ,LocalDate dateb ) {idL=idLstat;dateD=datea;dateF=dateb;idLstat++;}
    public Location(LocalDate deb) {idL=idLstat;dateD=deb;idLstat++;}
    public Client client;
    public void set_Client(Client c) {client=c;}
    /**
     * 
     */
    public Scooter scooter;
    public void set_Scooter(Scooter sc) {scooter=sc;}
    
    /* methode pour les variables internes de Location*/   
    public int get_idL() {return idL;}
    public LocalDate get_dateD() {return dateD;}
    public LocalDate get_dateF() {return dateF;}
    public void set_idL(int id) {idL=id;}
    public void set_dateD(LocalDate datea) {dateD=datea;}
    public void set_dateF(LocalDate dateb) {dateF=dateb;}
    
}