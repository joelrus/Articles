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
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color;
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
        System.out.printf("1.Cuadrat\n2. Rectangle(base)\n3. Rectangle complet\n4. Cercle\n5. Esfera\n6. Color\n7. String Color\n8. Color aleatori\nResposta: ");
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
            case 6 :
                colorMethod();
                break;
            case 7 :
                stringMethod();
                break;
            case 8 :
                aleatoriMethod();
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
    
    
    private static void colorMethod(){
        //<editor-fold defaultstate="collapsed" desc="color">
        Scanner input = new Scanner(System.in);
        System.out.printf("Digues el valor del red: ");
        int red = input.nextInt();
        System.out.printf("Digues el valor del green: ");
        int green = input.nextInt();
        System.out.printf("Digues el valor del blue: ");
        int blue = input.nextInt();
       Color col1 = new Color(red,green,blue);
        System.out.printf("El color final és R:%d G:%d B:%d\n",col1.getRed(),col1.getGreen(),col1.getBlue());
        Color col2 = new Color();
        System.out.printf("El color sense parametres és R:%d G:%d B:%d\n",col2.getRed(),col2.getGreen(),col2.getBlue());
        System.out.printf("Colors creats: %d",col1.getCounter());
//</editor-fold>
    }
    private static void stringMethod(){
        //<editor-fold defaultstate="collapsed" desc="color">
        Scanner input = new Scanner(System.in);
        System.out.printf("Digues el color en hexadecimal: ");
        String hexadecimal = input.next();
       Color col1 = Color.fromHexString(hexadecimal);
        System.out.printf("Color R:%d G:%d B:%d\n",col1.getRed(),col1.getGreen(),col1.getBlue());
        System.out.printf("Colors creats: %d",col1.getCounter());

//</editor-fold>
    }
    private static void aleatoriMethod(){
        //<editor-fold defaultstate="collapsed" desc="color">
       Color col1 = Color.getRandom();
        System.out.printf("El color aleatori  és R:%d G:%d B:%d\n",col1.getRed(),col1.getGreen(),col1.getBlue());
        System.out.printf("Color Hexadecimal(upper): %s\n",col1.toHexString(true));
        System.out.printf("Color Hexadecimal(lower): %s\n",col1.toHexString(false));
        System.out.printf("Color Hexadecimal(sobrecarrega): %s\n",col1.toHexString());
        System.out.printf("Color RGB(upper): %s\n",col1.toRGBString(true));
        System.out.printf("Color rgb(lower): %s\n",col1.toRGBString(false));
        System.out.printf("Color RGB(sobrecarrega): %s\n",col1.toRGBString());
        System.out.printf("Colors creats: %d\n",col1.getCounter());
//</editor-fold>
    }
}
