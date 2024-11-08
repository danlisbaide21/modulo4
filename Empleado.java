package helpers;
public class Empleado {
    private String Nombre_del_empleado;
   private int Edad_del_empleado;
   private double Salario_del_empleado;
   
   public Empleado(String nombre, int edad, double salario){
       this.Nombre_del_empleado = nombre;
       this.Edad_del_empleado = edad;
       this.Salario_del_empleado = salario;
   }
   
   public String getNombre(){
       return Nombre_del_empleado;
   }
   
   public void setNombre(String nombre){
       this.Nombre_del_empleado = nombre;
   }
   
   public int getEdad(){
      return Edad_del_empleado; 
   }
   
   public void setEdad(int edad){
       this.Edad_del_empleado = edad;
   }
   
   public double Salario(){
       return Salario_del_empleado;
   }
   
   public void setSalario(double salario){
       this.Salario_del_empleado = salario;
   }
   
            public void imprimirInformacion(){
        System.out.println("Nombre Del Empleado: " + Nombre_del_empleado);
            System.out.println("Edad del empleado: " + Edad_del_empleado);
            System.out.println("Salario Correspondinte: " + Salario_del_empleado);
   }
}
