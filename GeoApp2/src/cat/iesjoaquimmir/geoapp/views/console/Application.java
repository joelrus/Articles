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
        System.out.printf("Digues el costat en cm: ");
        double costat = input.nextDouble();
       Square c1 = new Square(costat);
        System.out.printf("L'area és: %.2f cm\n",c1.AreaSquare());
        System.out.printf("El perimetre és: %.2f cm\n",c1.PerimeterSquare());
//</editor-fold>
    }
    private static void rectangleMethod(){
        //<editor-fold defaultstate="collapsed" desc="rectangle">
       Scanner input = new Scanner(System.in);
        System.out.printf("Digues només la base en cm: ");
        double base = input.nextDouble();
       Rectangle r1 = new Rectangle(base);
        System.out.printf("L'area és: %.2f cm\n",r1.AreaRectangle());
        System.out.printf("El perimetre és: %.2f cm\n",r1.PerimeterRectangle());
//</editor-fold>
    }
    private static void rectangleMethod2(){
        //<editor-fold defaultstate="collapsed" desc="rectangle">
       Scanner input = new Scanner(System.in);
        System.out.printf("Digues la base en cm: ");
        double base = input.nextDouble();
        System.out.printf("Digues la altura en cm: ");
        double altura = input.nextDouble();

       Rectangle r1 = new Rectangle(base,altura);
        System.out.printf("L'area és: %.2f cm\n",r1.AreaRectangle());
        System.out.printf("El perimetre és: %.2f cm\n",r1.PerimeterRectangle());
//</editor-fold>
    }
    private static void cercleMethod(){
        //<editor-fold defaultstate="collapsed" desc="cercle">
       Scanner input = new Scanner(System.in);
        System.out.printf("Digues el radi en cm: ");
        double radi = input.nextDouble();
       Cercle ce1 = new Cercle(radi);
        System.out.printf("L'area és: %.2f cm\n",ce1.AreaCercle());
        System.out.printf("El perimetre és: %.2f cm\n",ce1.PerimeterCercle());
//</editor-fold>
    }
    private static void sphereMethod(){
        //<editor-fold defaultstate="collapsed" desc="sphere">
       Scanner input = new Scanner(System.in);

        System.out.printf("Digues el radi en cm: ");
        double radi2 = input.nextDouble();
       Sphere sp1 = new Sphere(radi2);
        System.out.printf("El volum és: %.2f cm\n",sp1.AreaSphere());
        System.out.printf("El perimetre és: %.2f cm\n",sp1.PerimeterSphere());
//</editor-fold>
    }
    
}
