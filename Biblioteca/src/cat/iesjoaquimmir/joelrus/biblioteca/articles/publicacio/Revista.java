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
public class Revista extends Publicacio {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private String issn;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructor">
    public Revista(String nom, String autor, Categoria categoria, int num_pagines, String issn) {
        super(nom,autor,categoria,num_pagines);
        this.setIssn(issn);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="get/set">
     /**
     * @return the issn
     */
    public String getIssn() {
        return issn;
    }

    /**
     * @param issn the issn to set
     */
    private void setIssn(String issn) {
        this.issn = issn;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacion">
    @Override
    public String toString() {
        return String.format("Revista:\n----------\n"
                + "%s"
                + "Issn: %s\n"
                ,super.toString(),getIssn()
        );
    }
//</editor-fold>

   
}
