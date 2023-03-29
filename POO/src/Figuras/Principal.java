package Figuras;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        float base,altura;
        double r,p;
        String answer="Si";
        int queFigura;
        Scanner capture =new Scanner(System.in);

        //create the object of my subclass
        
        System.out.println("Desea calcular el área de una figura?");
        answer=capture .next();

        while (answer.equals("Si")) {

            System.out.println("¿Qué figura desea calcular?,"+"\n1.Triangulo"+"\n2.Rectangulo"+"\n3.Circulo");
            queFigura=capture .nextInt();

            switch (queFigura) {
                case 1:
                System.out.print("Ingrese el valor de la base del triángulo:");
                base=capture .nextFloat();
        
                System.out.print("Ingrese el valor de la altura del triángulo:");
                altura=capture .nextFloat();
        
                Triangulo tri1=new Triangulo(base,altura);
                tri1.calcularArea();
                    break;

                    case 2:
                    System.out.print("Ingrese el valor de la base del rectángulo:");
                    base=capture .nextFloat();

                    System.out.print("Ingrese el valor de la altura del rectángulo:");
                    altura=capture .nextFloat();

                    Rectangulo r1=new Rectangulo(base,altura); //This is an objetc
                    r1.calcularArea(); 
                        break;

                        case 3:
                        System.out.print("Ingrese el valor del perímetro del círculo:");
                        r=capture .nextFloat();

                        System.out.print("Ingrese el valor del radio del círculo:");
                        p=capture .nextFloat();

                        Circulo cir1=new Circulo(r,p);
                        cir1.calcularArea();
                            break;
            
                default:
                System.out.println("El número ingresado, no está dentro de las opciones");
                    break;
            }

        System.out.println("Desea ealizar más cálculos?");
        answer=capture .next();

        }System.out.println("Gracias...");
        capture.close();
    }
}