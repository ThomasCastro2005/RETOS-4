package Figur;
import java.util.Scanner;

public class Cilindro extends Figuras{
    private double altura;
    private double radio;

    public Cilindro(){
    }


    public Cilindro(double altura, double radio){
        this.altura = altura;
        this.radio = radio;
    }


    public void datosAreaCilindro(){
        Scanner capturar = new Scanner(System.in);
        System.out.print("Ingrese la Altura: ");
        altura = capturar.nextDouble();
        System.out.print("Ingrese el radio: ");
        radio = capturar.nextDouble();
    }


    public double calcularArea(double radio, double altura){
        final double pi = 3.14;
        double areaCilindro = ((2*pi*radio)*altura) + ((2*pi)*(radio*radio));
        return areaCilindro;
    }

    public void mostrarArea(){
        final double pi = 3.14;
        System.out.println("El area del cilindro es de: " + ( ((2*pi*radio)*altura) + ((2*pi)*(radio*radio)) ) );
    }



    public double calcularPerimetro(double radio){
        final double pi = 3.14;
        double perimetroCilindro = (2*pi*radio);
        return perimetroCilindro;
    }


    public void mostrarDatosPerimetro(){
        final double pi = 3.14;
        System.out.println("El perimetro del cilindro es de: " + (2*pi*radio));
    }
























    //GETTERS Y SETTERS


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getRadio() {
        return radio;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
    }


    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPerimetro'");
    }


    




}
