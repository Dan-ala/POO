package Salud;
import java.util.Scanner;
public class EjecucionPersona {
    public static void main(String[] args) {
        //Se crea un objeto, es la instancia de una clase

        double peso,estatura;

        Persona person=new Persona();

        Scanner hola=new Scanner(System.in);
            System.out.print("Plz. Igrese su estatura:");
            estatura=hola .nextDouble();

            System.out.print("Plz. Ingrese su peso:");
            peso=hola .nextDouble();

        //Estoy invocando un método
        person.pedirDatos();
        person.mostrarPersona();
        person.calcularImc(peso, estatura);
        /*person.calcularImc();*/
        person.mayorEdad();

        hola.close();
     }
}