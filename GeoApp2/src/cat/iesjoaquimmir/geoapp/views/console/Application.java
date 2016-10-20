/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.views.console;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Rectangle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Cercle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Sphere;
import java.util.Scanner;
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
        //<editor-fold defaultstate="collapsed" desc="menu">
        System.out.printf("1.Cuadrat\n2. Rectangle(base)\n3. Rectangle complet\n4. Cercle\n5. Esfera\n");
       int menu = input.nextInt();
        switch (menu) {
            case 1 :
                squareMethod();
                 break;
            case 2 :
                rectangleMethod();
                 break;
            case 3 :
                rectangleMethod2();
                break;
            case 4 :
                cercleMethod();
                 break;
            case 5 :
                sphereMethod();
                 break;
            default:
                System.out.printf("La opcio que has escollit no es correcta ");
        }
//</editor-fold>
        

    }
    private static void squareMethod() {
        //<editor-fold defaultstate="collapsed" desc="square">
       Scanner input = new Scanner(System.in);
       double costat = 0;
       do{
        System.out.printf("Digues el costat en cm: ");
        costat = input.nextDouble();
        if(costat<=0){
            System.out.printf("Error, el numero ha de ser mayor que 0");
        }
       }while(costat<=0);
       Square c1 = new Square(costat);
       c1.setSide (costat);
        System.out.printf("L'area és: %.2f cm\n",c1.AreaSquare(costat));
        System.out.printf("El perimetre és: %.2f cm\n",c1.PerimeterSquare(costat));
//</editor-fold>
    }
    private static void rectangleMethod(){
        //<editor-fold defaultstate="collapsed" desc="rectangle">
       Scanner input = new Scanner(System.in);
       double base = 0;
       do{
        System.out.printf("Digues només la base en cm: ");
        base = input.nextDouble();
        if(base<=0){
            System.out.printf("Error, el numero ha de ser mayor que 0");
        }
       }while(base<=0);
       Rectangle r1 = new Rectangle(base);
       r1.setBase (base);
        System.out.printf("L'area és: %.2f cm\n",r1.AreaRectangle());
        System.out.printf("El perimetre és: %.2f cm\n",r1.PerimeterRectangle());
//</editor-fold>
    }
    private static void rectangleMethod2(){
        //<editor-fold defaultstate="collapsed" desc="rectangle">
       Scanner input = new Scanner(System.in);
       double base = 0;
       double altura = 0;
       do{
        System.out.printf("Digues la base en cm: ");
        base = input.nextDouble();
        System.out.printf("Digues la altura en cm: ");
        altura = input.nextDouble();
        if(base<=0 && altura<=0){
            System.out.printf("Error, el numero ha de ser mayor que 0");
        }
       }while(base<=0);
       Rectangle r1 = new Rectangle(base,altura);
       r1.setBase (base);
       r1.setAltura (altura);
        System.out.printf("L'area és: %.2f cm\n",r1.AreaRectangle());
        System.out.printf("El perimetre és: %.2f cm\n",r1.PerimeterRectangle());
//</editor-fold>
    }
    private static void cercleMethod(){
        //<editor-fold defaultstate="collapsed" desc="cercle">
Scanner input = new Scanner(System.in);
       double radi = 0;
       do{
        System.out.printf("Digues el radi en cm: ");
        radi = input.nextDouble();
        if(radi<=0){
            System.out.printf("Error, el numero ha de ser mayor que 0");
        }
       }while(radi<=0);
       Cercle ce1 = new Cercle(radi);
       ce1.setRadi (radi);
        System.out.printf("L'area és: %.2f cm\n",ce1.AreaCercle());
        System.out.printf("El perimetre és: %.2f cm\n",ce1.PerimeterCercle());
//</editor-fold>
    }
    private static void sphereMethod(){
        //<editor-fold defaultstate="collapsed" desc="sphere">
Scanner input = new Scanner(System.in);
       double radi2 = 0;
       do{
        System.out.printf("Digues el radi en cm: ");
        radi2 = input.nextDouble();
        if(radi2<=0){
            System.out.printf("Error, el numero ha de ser mayor que 0");
        }
       }while(radi2<=0);
       Sphere sp1 = new Sphere(radi2);
       sp1.setRadi (radi2);
        System.out.printf("El volum és: %.2f cm\n",sp1.AreaSphere());
        System.out.printf("El perimetre és: %.2f cm\n",sp1.PerimeterSphere());
//</editor-fold>
    }
    
}
