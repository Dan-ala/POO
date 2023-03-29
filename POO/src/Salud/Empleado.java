package Salud;
import java.util.Scanner;

public class Empleado extends Persona{

    //creamos atributos de la subclase
    private String cargo, departamento;
    private double valorhora;
    private double horastrabajadas;

    //creamos el mpetodos contstructor de la subclase y trajimos los atributos de la superclase

    public Empleado(String tipoDoc, int documento, int edad, String nombre, String apellido, String sexo, double peso, 
    double estatura, double var1, double pesoActual ,String cargo, String departamento, double valorhora, double horastrabajadas){
        super();
        this.cargo=cargo;
        this.departamento=departamento;
        this.valorhora=valorhora;
        this.horastrabajadas=horastrabajadas;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    public double getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(double horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public void pedirDatosE(){
        Scanner captureObj=new Scanner(System.in);

        System.out.print("Por favor, digite el cargo del empleado: ");
        cargo=captureObj .next();

        System.out.print("Por favor, digite el departamento: ");
        departamento=captureObj .next();

        System.out.print("Por favor, digite el valor de la hora: ");
        valorhora=captureObj .nextInt();

        System.out.print("Por favor, digite horas trabajadas: ");
        horastrabajadas=captureObj .nextInt();

        System.out.println();
    }
    
    //se crea métodos propios de la subcalse

    public void mostrarEmple(){
        System.out.println("El tipo de documento es: "+getTipoDoc()+" el documento es "+getDocumento()+" el nombre es "+getNombre()
        +" el apellido es "+getApellido()+" el cargo que cumple es "+getCargo()+" las horas trabajadas son "+getHorastrabajadas()+" el valor por hora es "+getValorhora());
    }
    
    public void calcularHonorarios(){
        double reteica;
        double totalAPagar=0;
        totalAPagar=valorhora*horastrabajadas;
        reteica=(0.966*totalAPagar);
        totalAPagar=(totalAPagar-reteica);
        System.out.println("EL TOTAL A PAGAR ES:"+totalAPagar);
    }
}