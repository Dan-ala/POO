package Figuras;

public class Circulo  extends Figura{

    //CREATE ATTRIBUTES
    private double r,div,p;

    //metodo constructor

    public Circulo(double r, double p){
        this.r=r;
        this.div=2;
        this.p=3.1416;
    }

        //métodos accesores
        public double getR() {
            return r;
        }
    
        public void setR(float r) {
            this.r = r;
        }
    
        public double getDiv() {
            return div;
        }
    
        public void setDiv(float div) {
            this.div = div;
        }
    
        public double getPi() {
            return p;
        }
        


    //método de una subclase

    public void calcularArea(){
        double area=0;
        area=p*r/div;
        System.out.println("El perímetro es "+p+" el radio es "+r+" y el área es de: "+area);
    }


}