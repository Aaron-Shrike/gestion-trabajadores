package entidades;

import java.util.Scanner;

public  class TrabajadorTC extends Trabajador{
    private double sueldoBase;
    private double descuento;
    private double bono;

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    @Override
    public int getTipo(){
        return 2;
    }

    @Override
    public double getSueldoNeto() {
        return((this.sueldoBase - this.descuento) + this.bono); 
    }

    @Override
    public void leer() {
        Scanner lector = new Scanner(System.in);
        
        super.leer();
        System.out.print("Sueldo Base : ");
        this.sueldoBase = lector.nextDouble();
        System.out.print("Descuento : ");
        this.descuento = lector.nextDouble();
        System.out.print("Bono : ");
        this.bono = lector.nextDouble();
    }

    @Override
    public void mostrar() {
        super.mostrar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Sueldo Base: " + this.sueldoBase);
        System.out.println("Descuento: " + this.descuento);
        System.out.println("Bono: " + this.bono);
        System.out.println("Sueldo Neto: " + this.getSueldoNeto());
    }
    
    
    
}
