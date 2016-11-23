/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.joelrus.biblioteca;
import cat.iesjoaquimmir.joelrus.biblioteca.articles.Article;
import cat.iesjoaquimmir.joelrus.biblioteca.articles.Categoria;
import cat.iesjoaquimmir.joelrus.biblioteca.articles.publicacio.Publicacio;
import cat.iesjoaquimmir.joelrus.biblioteca.articles.publicacio.Llibre;
import cat.iesjoaquimmir.joelrus.biblioteca.articles.publicacio.Revista;
import cat.iesjoaquimmir.joelrus.biblioteca.articles.multimedia.Multimedia;
import cat.iesjoaquimmir.joelrus.biblioteca.articles.multimedia.DiscCompacte;
import cat.iesjoaquimmir.joelrus.biblioteca.articles.multimedia.DiscDigital;
import java.util.ArrayList;
/**
 *
 * @author alumne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Article> vectorArticles = new ArrayList<Article>();
        Llibre l1 = new Llibre("Detectiu conan", "will backer", Categoria.I, 342, "34513");
        vectorArticles.add(l1);
        Revista r1 = new Revista("Interviu", "Angelina ewrwer", Categoria.A, 41, "23199");
        vectorArticles.add(r1);
        DiscCompacte c1 = new DiscCompacte("Raperos", "Invert", Categoria.J, "28:21", "34513");
        vectorArticles.add(c1);
        DiscDigital d1 = new DiscDigital("Buscando a nemo", "Berto tilcon", Categoria.J, "110:22", "85326");
        vectorArticles.add(d1);

        /*for(int i=0; i<vectorArticles.size(); i++){
            System.out.printf("%s\n",vectorArticles.get(i));
        }*/
        
        for(Article i : vectorArticles) System.out.printf("%s\n",i);
        
    }
    
}
