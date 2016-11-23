/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.joelrus.biblioteca.articles.publicacio;
import cat.iesjoaquimmir.joelrus.biblioteca.articles.Article;
import cat.iesjoaquimmir.joelrus.biblioteca.articles.Categoria;

/**
 *
 * @author alumne
 */
public abstract class Publicacio extends Article {


//<editor-fold defaultstate="collapsed" desc="atributs">
    private int num_pagines;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Contructors">
    public Publicacio(String nom, String autor, Categoria categoria, int num_pagines) {
        super(nom, autor, categoria);
        this.setNum_pagines(num_pagines);
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="get/set">

    /**
     * @return the num_pagines
     */
    public int getNum_pagines() {
        return num_pagines;
    }

    /**
     * @param num_pagines the num_pagines to set
     */
    private void setNum_pagines(int num_pagines) {
        this.num_pagines = num_pagines;
    }
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="operacions">
    @Override
    public String toString() {
        return String.format("%s"
                + "Numero de pagines: %d\n"
                ,super.toString(),getNum_pagines()
        );
    }
//</editor-fold>
    
    
    
}
