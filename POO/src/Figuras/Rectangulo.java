package Figuras;

public class Rectangulo extends Figura {

    //attributes

    private float base;
    private float altura;

    //methods

    public Rectangulo(float base, float altura){
        this.base=base;
        this.altura=altura;
    }


    //métodos accesores

    public float getBase() {
        return base;
    }


    public void setBase(float base) {
        this.base = base;
    }


    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }

    //método de una subclass

    public void calcularArea(){
        float area=0;
        area=base*altura;
        System.out.println("La base del rectángulo es "+base+" y su altura es: "+altura+" y el área es: "+area);
    }
    
}
