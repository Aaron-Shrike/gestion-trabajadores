package polimorfismo;

import entidades.Trabajador;
import entidades.TrabajadorTC;
import entidades.TrabajadorTP;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Polimorfismo {
    
    public static List<Trabajador> trabajadores = new ArrayList<>();

    public static void main(String[] args){
        int opcion;
       
        do{
            opcion = pedirOpcion();
            switch(opcion){
                case 1: registrarTrabajador(); break;
                case 2: listarTrabajadores(); break;
                case 3: presentarResumen(); break;
                case 4: modificarTrabajador(); break;
            }
        }while(opcion != 5);
    }
   
    private static int pedirOpcion(){
        Scanner lector = new Scanner(System.in);
       
        int op;
       
        System.out.println("\n\n-------- MENU PRINCIPAL --------");
        System.out.println("1. Registrar trabajador");
        System.out.println("2. Listado de trabajadores");
        System.out.println("3. Resumen de pagos por tipo");
        System.out.println("4. Modificar nombre de trabajador");
        System.out.println("5. Salir");
        System.out.print(" Opcion : ");
        op = lector.nextInt();
       
        return op;  
    }

    private static void registrarTrabajador() {
        Trabajador trab;
        int tipo;
        
        tipo = leerTipo();
        trab = crearTrabajador(tipo);
        trab.leer();
        trabajadores.add(trab);
    }

    private static void listarTrabajadores() {
        if(trabajadores.size() > 0){
            for(int i=0; i<trabajadores.size();i++){
                System.out.println("\n - Trabajador Nro. "+(i+1)+" -\n");
                ((Trabajador) trabajadores.get(i)).mostrar();
            }
        }else{
            System.out.println("\n\t* No hay trabajadores registrados");
        }   
    }
    
    private static void modificarTrabajador() {
        Scanner lector = new Scanner(System.in);
        
        String DNI;
        String nombre;
        Trabajador trab;
        int tipo;
        boolean encontrado = false;
        
        System.out.println("");
        do{
            System.out.print("Ingrese DNI del trabajador a modificar(8 digitos) : ");
            DNI = lector.next();
        }while((DNI).length() != 8);
        
        for(int i=0; i<trabajadores.size();i++){
            if(((Trabajador) trabajadores.get(i)).getDNI().equalsIgnoreCase(DNI)){
                System.out.print("Ingrese nuevo nombre : ");
                nombre = lector.next();
               ((Trabajador) trabajadores.get(i)).setNombres(nombre);
               encontrado = true;
            }
        }
        
        if(!encontrado){
            System.out.println("\n\t* Trabajador no encontrado");
        }
    }

    private static void presentarResumen() {
        int tipo = 0;
        
        for (int i = 0; i <trabajadores.size(); i++) {
            if (((Trabajador) trabajadores.get(i)).getTipo() == 1) {
                tipo +=1;
            }
        }
        System.out.println("");
        System.out.println(" ( "+tipo+ " ) Trabajadores de Tiempo Parcial");
        System.out.println(" ( "+(trabajadores.size() - tipo)+" ) Trabajadores de Tiempo Completo");
    }

    private static int leerTipo() {
        Scanner lector = new Scanner(System.in);
       
        int op;
        
        System.out.println("\n- TIPO DE TRABAJADOR -");
        System.out.println(" (1) Trabajador por tiempo completo");
        System.out.println(" (2) Trabajador por tiepo parcial");
        System.out.print("Tipo[1-2] : ");
        op = lector.nextInt();
       
        return op;
    }

    private static Trabajador crearTrabajador(int tipo) {
        Trabajador trab = null;
       
        switch(tipo){
            case 1: trab = new TrabajadorTC(); break;
            case 2: trab = new TrabajadorTP(); break;
        }
       
        return trab;
    }
}
