/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.joelrus.biblioteca.articles.publicacio;

import cat.iesjoaquimmir.joelrus.biblioteca.articles.Categoria;

/**
 *
 * @author alumne
 */
public class Llibre extends Publicacio {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private String isbn;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructors">
     public Llibre(String nom, String autor, Categoria categoria, int num_pagines, String isbn) {
        super(nom,autor,categoria,num_pagines);
        this.setIsbn(isbn);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="get/set">
    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    private void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacion">
    @Override
    public String toString() {
        return String.format("Llibre:\n----------\n"
                + "%s"
                + "Isbn: %s\n"
                ,super.toString(),getIsbn()
        );
    }
//</editor-fold>
}
