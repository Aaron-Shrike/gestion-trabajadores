package entidades;

import java.util.Scanner;

public class TrabajadorTP extends Trabajador{
    private double pagoHora;
    private int cantidadHoras;

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }
    
    @Override
    public int getTipo(){
        return 1;
    }

    @Override
    public double getSueldoNeto() {
        return(this.cantidadHoras * this.pagoHora);
    }

    @Override
    public void leer() {
        Scanner lector = new Scanner(System.in);
        
        super.leer();
        System.out.print("Pago por hora : ");
        this.pagoHora = lector.nextDouble();
        System.out.print("Cantidad de horas : ");
        this.cantidadHoras = lector.nextInt();
    }

    @Override
    public void mostrar() {
        super.mostrar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Pago por hora: " + this.pagoHora);
        System.out.println("Cantidad de Horas: " + this.cantidadHoras);
        System.out.println("Sueldo Neto: " + this.getSueldoNeto());
    }
    
    
    
    
}
