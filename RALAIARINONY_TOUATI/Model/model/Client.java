package model;
import java.util.*;

/**
 * 
 */
public class Client {

    /**
     * Default constructor
     */
    public Client() {
    }
    /**
     * 
     */
    public static int idCstat=0;
    private int idC;

    /**
     * 
     */
    private String nomC;
/*
 * 
 * */
    private String prenomC;
    /*
     * 
     * */
//Constructeur 
    public Client(String nom , String prenom) {
    	idC=idCstat ; nomC=nom; prenomC=prenom;idCstat++;
    }
    //les vecteurs
    public Vector<Parc> listparc=new  Vector <Parc>() ;
    public void ajouterParc(Parc p) 
    {
    	listparc.add(p);
    }
    public Vector<Location> listloc=new Vector<Location>();
    public void ajouterLocation(Location l) 
    {
    	listloc.add(l);
    }
    
/* methode pour les variables internes de Client*/
    public int get_idC() {return idC;}
    public String get_nomC() {return nomC;}
    public String get_prenomC() {return prenomC;}
    public void set_idC(int id) {idC=id;}
    public void set_nomC(String nom) {nomC=nom;}
    public void set_prenomC(String prenom) {prenomC=prenom;}
}