
package ProyectoFuturo;

public class ProyectoFuturo {

     public static void main(String[] args) {
        // TODO code application logic here
    
     System.out.println("Estudiante "+ args[0] + " " +  args [1] + " : ");
     System.out.println("Tengo " + args[2] + " módulos formativos en este curso");
     System.out.println("Dedico " + args[3] + " horas semanales al estudio");

         System.out.println("\n");
         System.out.println(ProyectoFuturo.veredicto(args[2],args[3]));
         System.out.println("\n");
     } 
        
     public static String veredicto(String valor1, String valor2){
         if (valor1.equals(valor2)) {
             return "Bien. Pero una hora de estudio para cada módulo";
         }
         if(Integer.valueOf(valor1) > Integer.valueOf(valor2)){
             return "Poco tiempo de estudio. Debes dedicar más tiempo.";
         }
         return "Ideal. Trabajas los contenido en casa.";
     }
            
     
     
     
     
    
}
