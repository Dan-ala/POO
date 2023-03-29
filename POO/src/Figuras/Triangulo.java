package Figuras;

public class Triangulo extends Figura {
//CREATE ATTRIBUTES
    private float base,altura,div;

    //methods

    public Triangulo(float base,float altura){
        this.base=base;
        this.altura=altura;
        this.div=2;
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

    public float getDiv() {
        return div;
    }

    public void setDiv(float div) {
        this.div = div;
    }

    //método de una subclase

    public void calcularArea(){
        float area=0;
        area=base*altura/div;
        System.out.println("La base del triángulo es "+base+" la altura del triángulo es "+altura+" y el área es de: "+area);
    }
    
}
