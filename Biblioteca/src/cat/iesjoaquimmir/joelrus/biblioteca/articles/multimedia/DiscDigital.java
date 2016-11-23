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
public class DiscDigital extends Multimedia {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private String isan;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructors">
    public DiscDigital(String nom, String autor, Categoria categoria, String durada, String isan) {
        super(nom,autor,categoria,durada);
        this.setIsan(isan);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="get/set">
    /**
     * @return the isbn
     */
    public String getIsan() {
        return isan;
    }

    /**
     * @param ismn the isbn to set
     */
    private void setIsan(String isbn) {
        this.isan = isan;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacion">
    @Override
    public String toString() {
        return String.format("DVD:\n----------\n"
                + "%s"
                + "Isan: %s\n"
                ,super.toString(),getIsan()
        );
    }
//</editor-fold>
}
