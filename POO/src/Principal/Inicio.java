package Principal;
import Salud.Empleado;
public class Inicio {
    //CLASS OF EXECUTION - PERSONA
    public static void main(String[] args) {

        Empleado meineObj=new Empleado(null, 0, 0, null, null, null, 
        0, 0, 0, 0, null, null, 0, 0);
    
    meineObj.pedirDatos();

    meineObj.pedirDatosE();

    meineObj.mostrarEmple();

    meineObj.calcularHonorarios();
    }
}