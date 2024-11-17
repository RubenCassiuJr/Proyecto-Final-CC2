/**
			 ** Hecho por: Rubén Ariel Ajcú Deras
			 ** Carnet: 21003655
			 ** Seccion: B
**/
/**
 * LA SIGUIENTE CLASE ES LA CLASE PRINCIPAL, EN ELLA IMPLEMENTAREMOS LAS BANDERAS
 * LAS POLÍTICAS, Y LAS LLAMADAS A LOS MÉTODOS
 * 
**/



public class ProcessScheduler {
    public static void main(String[] args){

        String banderas = args[0];

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
        
            







        }



    }
}
