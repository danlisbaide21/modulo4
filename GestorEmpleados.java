package helpers;

import java.util.ArrayList;
public class GestorEmpleados {
    private ArrayList<Empleado> lista_Empleados;
    
    public GestorEmpleados(){
        this.lista_Empleados = new ArrayList<>();
    }
    
    public void agragarEmpleado(Empleado empleado){
        lista_Empleados.add(empleado);
        System.out.println("Listo, Empleado Agregado : ");
    }
    
    public void mostrarEmpleados(){
        if(lista_Empleados.isEmpty()){
            System.out.println("ERROR, NO HAY EMPLEADO EN LA LISTA.");
            
        }else{
            for(Empleado empleado : lista_Empleados){
                empleado.imprimirInformacion();
               System.out.println("_-__-__-__-__-__-__-__-__-__-__-__-__-__-_");
            }
        }
    }
}
