package Figur;

import java.util.Scanner;

public class Triangulo extends Figuras{
    private double base;
    private double altura2;
    private double lado1;
    private double lado2;
    private double lado3;


    public Triangulo(){
    }
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3){
        this.base = base;
        this.altura2 = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }





    public void datosAreaTriangulo(){
        Scanner capturar=new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        base = capturar.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura2 = capturar.nextDouble();
    }

    public double calcularArea(double base, double altura2){
        double areaTriangulo = base*altura2/2;
        return areaTriangulo;
    }

    public void mostrarDatosArea(){
        System.out.print("El area del Triangulo es de: " + base*altura2/2);
    }



    public void datosPerimetroTriangulo(){
        Scanner capturar =new Scanner(System.in);
        System.out.print("ingrese el lado 1: ");
        lado1 = capturar.nextDouble();
        System.out.print("ingrese el lado 2: ");
        lado2 = capturar.nextDouble();
        System.out.print("ingrese el lado 3: ");
        lado3 = capturar.nextDouble();
    }

    public double calcularPerimetro(double lado1,double lado2,double lado3){
        double perimetroTriangulo = lado1+lado2+lado3;
        return perimetroTriangulo;
    }

    public void mostrarDatosPerimetro(){
        System.out.println("El perimetro del Triangulo es de: " + (lado1+lado2+lado3));
    }























    //GETTERS Y SETTERS
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura2;
    }
    public void setAltura(double altura) {
        this.altura2 = altura;
    }
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
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
