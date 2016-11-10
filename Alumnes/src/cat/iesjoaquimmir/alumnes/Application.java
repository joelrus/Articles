/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.alumnes;
import java.util.Scanner;
import cat.iesjoaquimmir.alumnes.entities.Alumne;
import cat.iesjoaquimmir.alumnes.entities.Domicili;
import cat.iesjoaquimmir.alumnes.entities.Modul;
import java.util.ArrayList;
/**
 *
 * @author alumne
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcio = 0;
        do{
            System.out.printf("\nQue dades coneixes?\n1. Edat,Nom i Dni\n2. Edat i nom\n3. Edat i Dni\n4.Nom i Dni\n5. Només DNI\n6. Tots menys domicili\n7. Tots menys telefon i moduls\nResposta: ");
            opcio = input.nextInt();
            int edat = 0;
            String dni;
            String nom;
            String cognom;
            String cognom2;
            String carrer;
            int numero;
            String pis;
            String codi_postal;
            String poblacio;
            String provincia;
            String nom_modul;
            String descripcio;
            int hores;
            int cont;
            ArrayList<String> telefon = new ArrayList<String>();
            ArrayList<Modul> modul = new ArrayList<Modul>();
            switch (opcio) {
                case 1 :
                    System.out.printf("\nDigues la edat: ");
                    edat = input.nextInt();
                    System.out.printf("\nDigues el Nom: ");
                    nom = input.next();
                    System.out.printf("\nDigues el dni: ");
                    dni = input.next();
                    Alumne al1 = new Alumne(edat,nom,dni);
                    al1.getSalutacio();
                    break;
                case 2 :
                    System.out.printf("\nDigues la edat: ");
                    edat = input.nextInt();
                    System.out.printf("\nDigues el Nom: ");
                    nom = input.next();
                    Alumne al2 = new Alumne(edat,nom);
                    al2.getSalutacio();
                    break;
                case 3 :
                    System.out.printf("\nDigues la edat: ");
                    edat = input.nextInt();
                    System.out.printf("\nDigues el Dni: ");
                    dni = input.next();
                    Alumne al3 = new Alumne(dni,edat);
                    al3.getSalutacio();
                    break;
                case 4 :
                    System.out.printf("\nDigues el Nom: ");
                    nom = input.next();
                    System.out.printf("\nDigues el Dni: ");
                    dni = input.next();
                    Alumne al4 = new Alumne(nom,dni);
                    al4.getSalutacio();
                    break;
                case 5 :
                    System.out.printf("\nDigues el Dni: ");
                    dni = input.next();
                    Alumne al5 = new Alumne(dni);
                    al5.getSalutacio();
                    break;
                case 6 :
                    System.out.printf("\nDigues el Nom: ");
                    nom = input.next();
                    System.out.printf("\nDigues el Cognom: ");
                    cognom = input.next();
                    System.out.printf("\nDigues el Cognom2: ");
                    cognom2 = input.next();
                    System.out.printf("\nDigues el dni: ");
                    dni = input.next();
                    System.out.printf("\nDigues el telefon: ");
                    telefon.add(input.next());
                    System.out.printf("\nDigues el telefon: ");
                    telefon.add(input.next());
                    System.out.printf("\nDigues la edat: ");
                    edat = input.nextInt();
                    modul.add(new Modul("M02","Sistemes operatius",200));
                    modul.add(new Modul("M03","Programació",324));
                    modul.add(new Modul("M04",180));
                    Alumne al6 = new Alumne(nom,cognom,cognom2,dni,telefon,modul,edat);
                    System.out.printf("%s",al6.getSalutacio());
                    for (int i = 0; i < al6.getTelefon().size(); i++) {
                        System.out.printf("\nEl telefon %d: %s",i,al6.getTelefon().get(i));
                    }
                    for (int i = 0; i < al6.getModul().size(); i++) {
                        System.out.printf("\nEl modul %d és %s",i,
                                al6.getModul().get(i).getModulComplet());
                    }
                    
                    
                    break;
                case 7 :
                    System.out.printf("\nDigues el Nom: ");
                    nom = input.next();
                    System.out.printf("\nDigues el Cognom: ");
                    cognom = input.next();
                    System.out.printf("\nDigues el Cognom2: ");
                    cognom2 = input.next();
                    System.out.printf("\nDigues el dni: ");
                    dni = input.next();
                    System.out.printf("\nDigues la edat: ");
                    edat = input.nextInt();
                    System.out.printf("\nDigues el carrer: ");
                    carrer = input.next();
                    System.out.printf("\nDigues el numero: ");
                    numero = input.nextInt();
                    System.out.printf("\nDigues el pis: ");
                    pis = input.next();
                    System.out.printf("\nDigues el codi postal: ");
                    codi_postal = input.next();
                    System.out.printf("\nDigues la poblacio: ");
                    poblacio = input.next();
                    System.out.printf("\nDigues la provincia: ");
                    provincia = input.next();
                    Domicili dom1 = new Domicili(carrer,numero,pis,codi_postal,poblacio,provincia);
                    Alumne al7 = new Alumne(nom,cognom,cognom2,dni,null,null,edat,dom1);
                    System.out.printf("\nEl Domicili és %s",
                                al7.getDomicili().getDomiciliAmigable());
                    break;
            }
        
        }while(opcio>5);
        
        
    }
    
}
