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
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Shape;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.AlphaColor;
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
        int menu=0;
        do{
        System.out.printf("\n1.Cuadrat\n2. Cuadrat amb color random\n3. Rectangle(base)\n4. Rectangle complet\n5. Cercle\n6. Esfera\n7. Color\n8. String Color\n9. Color aleatori\n10. Surt\nResposta: ");
        menu = input.nextInt();
         switch (menu) {
            case 1 :
                squareMethod();
                break;
            case 2 :
                squareColor();
                break;
            case 3 :
                rectangleMethod();
                break;
            case 4 :
                rectangleMethod2();
                break;
            case 5 :
                cercleMethod();
                break;
            case 6 :
                sphereMethod();
                break;
            case 7 :
                colorMethod();
                break;
            case 8 :
                stringMethod();
                break;
            case 9 :
                aleatoriMethod();
                break;
         }
        }while(menu!=10);
//</editor-fold>
        

    }
    private static void squareMethod() {
        //<editor-fold defaultstate="collapsed" desc="square">
       Scanner input = new Scanner(System.in);
        System.out.printf("Digues el costat en cm: ");
        double costat = input.nextDouble();
       Square c1 = new Square(costat);
        System.out.printf("El color de fons és: %s\n",c1.getBackgroundColor().toHexString());
        System.out.printf("El color de la vora és: %s\n",c1.getForegroundColor().toHexString());
        System.out.printf("L'area és: %.2f cm\n",c1.AreaSquare());
        System.out.printf("El perimetre és: %.2f cm\n",c1.PerimeterSquare());
        System.out.printf("El contador és: %d cm\n",Shape.getCounter());
//</editor-fold>
    }
    private static void squareColor() {
        //<editor-fold defaultstate="collapsed" desc="square">
       Scanner input = new Scanner(System.in);
        System.out.printf("Digues el costat en cm: ");
        double costat = input.nextDouble();

        AlphaColor acb = AlphaColor.getRandom();
        AlphaColor acf = new AlphaColor(234,123,21,0.9);
       Square c1 = new Square(costat,acb,acf);
        System.out.printf("%s",c1.toString());
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
        System.out.printf("El contador és: %d cm\n",Shape.getCounter());
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
        System.out.printf("El contador és: %d cm\n",Shape.getCounter());
//</editor-fold>
    }
    private static void cercleMethod(){
        //<editor-fold defaultstate="collapsed" desc="cercle">
       Scanner input = new Scanner(System.in);
        System.out.printf("Digues el radi en cm: ");
        double radi = input.nextDouble();
       Cercle ce1 = new Cercle(radi,null,null);
        System.out.printf("L'area és: %.2f cm\n",ce1.AreaCercle());
        System.out.printf("El perimetre és: %.2f cm\n",ce1.PerimeterCercle());
        System.out.printf("El contador és: %d cm\n",Shape.getCounter());
//</editor-fold>
    }
    private static void sphereMethod(){
        //<editor-fold defaultstate="collapsed" desc="sphere">
       Scanner input = new Scanner(System.in);

        System.out.printf("Digues el radi en cm: ");
        double radi2 = input.nextDouble();
       Sphere sp1 = new Sphere(radi2,null,null);
        System.out.printf("El volum és: %.2f cm\n",sp1.AreaSphere());
        System.out.printf("El perimetre és: %.2f cm\n",sp1.PerimeterSphere());
        System.out.printf("El contador és: %d cm\n",Shape.getCounter());
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
       Color col1 = new AlphaColor(red,green,blue);
        System.out.printf("El color final és R:%d G:%d B:%d\n",col1.getRed(),col1.getGreen(),col1.getBlue());
        Color col2 = new AlphaColor(red,green,blue);
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
