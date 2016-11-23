/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.joelrus.biblioteca.articles.multimedia;
import cat.iesjoaquimmir.joelrus.biblioteca.articles.Article;
import cat.iesjoaquimmir.joelrus.biblioteca.articles.Categoria;

/**
 *
 * @author alumne
 */
public abstract class Multimedia extends Article  {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private String durada;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
    public Multimedia(String nom, String autor, Categoria categoria, String durada) {
        super(nom, autor, categoria);
        this.setDurada(durada);
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="get/set">

    /**
     * @return the durada
     */
    public String getDurada() {
        return durada;
    }

    /**
     * @param aDurada the durada to set
     */
    private void setDurada(String aDurada) {
        this.durada = durada;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacions">
    @Override
    public String toString() {
        return String.format("%s"
                + "Durada: %s\n"
                ,super.toString(),getDurada() 
        );
    }
//</editor-fold>
}
