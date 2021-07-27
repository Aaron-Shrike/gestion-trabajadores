package entidades;

import java.util.Scanner;

public class Persona {
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String DNI;
    private int edad;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void leer(){
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Nombres : ");
        this.nombres = lector.next();
        System.out.print("Apellido Paterno : ");
        this.apellidoPaterno = lector.next();
        System.out.print("Apellido Materno : ");
        this.apellidoMaterno = lector.next();
        do{
            System.out.print("DNI(8 digitos) : ");
            this.DNI = lector.next();
        }while((this.DNI).length() != 8);
        do{
            System.out.print("Edad[18-65] : ");
            this.edad = lector.nextInt();
        }while((this.edad) < 18 || (this.edad) > 65);
    }
    
    public void mostrar(){
        System.out.println("Nombres: " + this.nombres);
        System.out.println("Apellido Paterno: " + this.apellidoPaterno);
        System.out.println("Apellido Materno: " + this.apellidoMaterno);
        System.out.println("DNI: " + this.DNI);
    }
}
