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
public abstract class Article implements InAtricle {
    private String nom;
    private String autor;
    private Categoria categoria;
    
    //<editor-fold defaultstate="collapsed" desc="constructors">
    public Article(String nom, String autor, Categoria categoria) {
        this.nom = nom;
        this.autor = autor;
        this.categoria = categoria;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Get/set">
    


    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    private void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    private void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    private void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacions">
    @Override
    public String toString() {
        return String.format("Nom: %s\n"
                + "Autor: %s\n"
                + "Categoria: %s\n"
                ,getNom(),getAutor(),getCategoria().getDescr()
        );
    }
//</editor-fold>

   
    
}
