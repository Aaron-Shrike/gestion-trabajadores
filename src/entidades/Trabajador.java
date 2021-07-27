package entidades;

import java.util.Scanner;

public abstract class Trabajador extends Persona{
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public abstract int getTipo();
    public abstract double getSueldoNeto();

    @Override
    public void leer() {
        Scanner lector = new Scanner(System.in);
        
        super.leer();
        System.out.print("Cargo : ");
        this.cargo = lector.next();
    }

    @Override
    public void mostrar() {
        super.mostrar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Cargo: " + this.cargo);
    }
    
    
}
