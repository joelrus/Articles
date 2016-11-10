/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.alumnes.entities;
import cat.iesjoaquimmir.alumnes.entities.Domicili;
import cat.iesjoaquimmir.alumnes.entities.Modul;
import java.util.ArrayList;
/**
 *
 * @author alumne
 */
public class Alumne {
    //<editor-fold defaultstate="collapsed" desc="Estat: atribut">
    //Atributs
    
    private String nom;
    private String cognom;
    private String cognom2;
    private String dni;
    private ArrayList<String> telefon;
    private ArrayList<Modul> modul;
    private int edat;
    private Domicili domicili;
   
    private static final int EDAT_DEFECTE=99;
    private static final String NOM_DEFECTE="Anonymous";
    private static final String DNI_DEFECTE="00000000A";
    
    //</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="Comportament: metodes">

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Alumne(String nom, String cognom, String cognom2, String dni, ArrayList<String> telefon, ArrayList<Modul> modul, int edat, Domicili domicili){
        this.setNom(nom);
        this.setCognom(cognom);
        this.setCognom2(cognom2);
        this.setDni(dni);
        this.setTelefon(telefon);
        this.setModul(modul);
        this.setEdat(edat);
        this.setDomicili(domicili);
    }
    public Alumne(String nom, String cognom, String cognom2, String dni, ArrayList<String> telefon,ArrayList<Modul> modul, int edat){
        this(nom,cognom,cognom2,dni,telefon,modul,edat,null);
    }
    public Alumne(int edat, String nom, String dni) {
        this(nom,null,null,dni,null,null,edat);
    }
    public Alumne(int edat,String nom){
        this(edat,nom,DNI_DEFECTE);
    }
    //Cambiem el ordre dels parametres per poder fer aquest constructor
    public Alumne(String dni,int edat){
        this(edat,NOM_DEFECTE,dni);
    }
    public Alumne(String nom,String dni){
        this(EDAT_DEFECTE,nom,dni);
    }
    public Alumne(String dni){
        this(NOM_DEFECTE,dni);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
   /**
     * @return the modul
     */
    public ArrayList<Modul> getModul() {
        return modul;
    }

    /**
     * @param modul the modul to set
     */
    public void setModul(ArrayList<Modul> modul) {
        this.modul = modul;
    }
    /**
     * @return the edat
     */
    public int getEdat() {
        return edat;
    }

    /**
     * @param edat the edat to set
     */
    public void setEdat(int edat) {
        if (edat<=3){
            throw new IllegalArgumentException(
                String.format("valor %f no valid",edat));
        }
        this.edat = edat;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        if (nom==null){
            throw new NullPointerException("Es obligatori indicar una cadena de text");
        }
        if (!nom.matches("[a-zA-Z]+\\.?")){
            throw new IllegalArgumentException(
                    String.format("El nom %s no te format de lletres", nom));
        }
        this.nom = nom;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        if (dni==null){
            throw new NullPointerException("Es obligatori indicar una cadena de text");
        }
        
        this.dni = dni;
    }
    
    /**
     * @return the cognom
     */
    public String getCognom() {
        return cognom;
    }

    /**
     * @param cognom the cognom to set
     */
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    /**
     * @return the cognom2
     */
    public String getCognom2() {
        return cognom2;
    }

    /**
     * @param cognom2 the cognom2 to set
     */
    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

   /**
     * @return the telefon
     */
    public ArrayList<String> getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(ArrayList<String> telefon) {
        this.telefon = telefon;
    }

    /**
     * @return the domicili
     */
    public Domicili getDomicili() {
        return domicili;
    }

    /**
     * @param domicili the domicili to set
     */
    public void setDomicili(Domicili domicili) {
        this.domicili = domicili;
    }
    //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Metodes d'objecte">
    public String getSalutacio(){
        return String.format("\nHola, sóc en/la %s amb identificacio %s i tinc %d anys\n",
                getNom(),getDni(),getEdat());
    }
    public String getNomComplert(){
        return String.format("\nHola, sóc en/la %s %s, %s\n",
                getCognom(),getCognom2(),getNom());
    }
    public void getTel(){
        for (int i = 0; i < getTelefon().size(); i++) {
            System.out.printf("El telefon %d: %s",i,getTelefon().get(i));
        }
    }
    public String getMayor(){
        if(getEdat()>=18){
            return String.format("\nHola, sóc en/la %s amb identificacio %s i tinc %d anys\n",
                getNom(),getDni(),getEdat());
        }else{
            return String.format("\nL'alumne %s %s, %s és mayor d'edat\n",
                getCognom(),getCognom2(),getNom());
        }
        
    }
//</editor-fold>
    //</editor-fold>

    
}
