/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.joelrus.biblioteca.articles.multimedia;

import cat.iesjoaquimmir.joelrus.biblioteca.articles.Categoria;
import cat.iesjoaquimmir.joelrus.biblioteca.articles.multimedia.Multimedia;

/**
 *
 * @author alumne
 */
public class DiscCompacte extends Multimedia {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private String ismn;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructors">
    public DiscCompacte(String nom, String autor, Categoria categoria, String durada, String ismn) {
        super(nom,autor,categoria,durada);
        this.setIsmn(ismn);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="get/set">
    /**
     * @return the isbn
     */
    public String getIsmn() {
        return ismn;
    }

    /**
     * @param ismn the isbn to set
     */
    private void setIsmn(String isbn) {
        this.ismn = ismn;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacion">
    @Override
    public String toString() {
        return String.format("CD:\n----------\n"
                + "%s"
                + "Ismn: %s\n"
                ,super.toString(),getIsmn()
        );
    }
//</editor-fold>
}
