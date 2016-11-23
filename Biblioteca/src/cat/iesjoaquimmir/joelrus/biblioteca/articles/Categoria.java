/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.joelrus.biblioteca.articles;

/**
 *
 * @author alumne
 */
public enum Categoria {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    
    I("Infantil"),
    J("Juvenil"),
    A("Adult");
    
    private final String descr;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructors">
    Categoria(String descr){
        this.descr = descr;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="get">
    public String getDescr() {
        return descr;
    }
//</editor-fold>

    
    
}
