package Salud;
import java.util.Scanner;
public class Persona {

    //Attributes
    private String tipoDoc;
    private int documento,edad;
    private String nombre,apellido,sexo;
    private double peso,estatura;

    //Methods
    public void pedirDatos(){
        Scanner captureObj=new Scanner(System.in);

        System.out.print("Por favor, digite el tipo de documento: ");
        tipoDoc=captureObj .next();

        System.out.print("Por favor, digite el documento: ");
        documento=captureObj .nextInt();

        System.out.print("Por favor, digite su nombre: ");
        nombre=captureObj .next();

        System.out.print("Por favor, digite su apellido: ");
        apellido=captureObj .next();

        System.out.print("Por favor, digite el peso: ");
        peso=captureObj .nextDouble();

        System.out.print("Por favor, digite su estatura: ");
        estatura=captureObj .nextDouble();

        System.out.print("Por favor, digite edad: ");
        edad=captureObj .nextInt();

        System.out.print("Por favor, digite el sexo: ");
        sexo=captureObj .next();
        System.out.println();
    }

    public void mostrarPersona(){
        System.out.println("El tipo de documento registrado es: "+tipoDoc);

        System.out.println("El documento ingresado es: "+documento);

        System.out.println("El nombre ingresado es: "+nombre);

        System.out.println("El apellido ingresado es: "+apellido);

        System.out.println("El peso ingresado es: "+peso);

        System.out.println("La estatura ingresada es: "+estatura);

        System.out.println("La edad ingresada es: "+edad);

        System.out.println("El sexo ingresado es: "+sexo);
        System.out.println();
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }


    public void calcularImc(){

        double var1,pesoActual;

        var1=estatura*estatura;
        pesoActual=peso/var1;
    
        if (pesoActual<20) {
            System.out.println("El peso está por debajo de lo ideal");
        }
        else if(pesoActual>20 || pesoActual<25){
                System.out.println("El peso es el ideal");
            }else if(pesoActual>25){
                System.out.println("Tiene sobrepeso");
            }
    }

    /*public double calcularImc(double peso,double estatura){

        double var1,pesoActual;

        var1=estatura*estatura;
        pesoActual=peso/var1;
    
        if (pesoActual<20) {
            System.out.println("PESO BAJO");
        }
        else if(pesoActual>20 || pesoActual<25){
                System.out.println("PESO IDEAL");
            }else if(pesoActual>25){
                System.out.println("SOBREPESO");
            }
            System.out.print("Su peso actual es de:"+pesoActual+"\n");
            return pesoActual;
        }*/

    public void mayorEdad(){
        if (edad>=18) {
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}