/**
			 ** Hecho por: Rubén Ariel Ajcú Deras
			 ** Carnet: 21003655
			 ** Seccion: B
**/

import javax.annotation.processing.SupportedOptions;

/**
 * LA SIGUIENTE CLASE ES LA CLASE PRINCIPAL, EN ELLA IMPLEMENTAREMOS LAS BANDERAS
 * LAS POLÍTICAS, Y LAS LLAMADAS A LOS MÉTODOS
 * 
**/



public class ProcessScheduler {
    public static void main(String[] args){

        String banderas = args[0];
        String inputFileName = (args.length >= 2) ? args[1] : "";

        switch(banderas){

            case"-fcfs":
                System.out.println("La política seleccionada es First-Come First-Served. ");
                break;

            case"-lcfs":
                System.out.println("La política seleccionada es Last-come Fist-Served. ");    
                break;

            case"-pp":
                System.out.println("La política seleccionada es Priority Policy. ");
                break; 

            case"-rr":
                System.out.println("La política seleccionada es Round-Robin. ");
                break; 
            case"-help":
                System.out.println("LA UTILIZACIÓN DE LAS BANDERAS ES LA SIGUIENTE: ");
                System.out.println();
                System.out.println("----> java ProcessScheduler -fcfs rango_tiempo_ingreso arith io cond loop  o");
                System.out.println("----> java ProcessScheduler -lcfs rango_tiempo_ingreso arith io cond loop  o");
                System.out.println("----> java ProcessScheduler -pp   rango_tiempo_ingreso arith io cond loop  o");
                System.out.println("----> java ProcessScheduler -rr   rango_tiempo_ingreso arith io cond loop  quantum ");
                System.out.println();
                break; 

            default:
                System.out.println("Bandera no válida. Consulta la ayuda con '-help'.");

                

        
            







        }



    }
}
