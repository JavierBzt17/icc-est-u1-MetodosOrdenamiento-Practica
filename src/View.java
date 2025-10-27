import java.util.Scanner;

public class View{

    //Variable privada para el scanner
    private final Scanner scanner;

    public View (){
        System.out.println("Metodos de Ordenamiento");
        scanner = new Scanner(System.in);
    }


    public void showMenu(){
        System.out.println(" \n --Menu Metodos--");
        System.out.println("1. -> Selection");
        System.out.println("2. -> Insercion");
        System.out.println("3. -> Bubble");
        System.out.println("4. -> Salir");
        System.out.println("Seleccione una opcion: ");

    }

    public int inputOption(int max){
        int option = -1;
        while (true) {
            if(scanner.hasNextInt()){
                //si ingreso un numero
                option = scanner.nextInt();
                if (option >=1 && option <= max)
                    break;
            }else{
                scanner.next(); 
            }
            System.out.println("Opcion invalida");
            
        }
        return option;
    }

    public void showOrderMenu(){
        System.out.println("--Seleccione el orden--"); 
        System.out.println(" 1. -> Ascendente"); 
        System.out.println(" 2. -> Descendente"); 
        System.out.println("Seleccione una opcion: "); 
    }

    public void showPasosMenu (){
        System.out.println("--Quiere ver los pasos?--"); 
        System.out.println(" 1. -> SI"); 
        System.out.println(" 2. -> No"); 
        System.out.println("Seleccione una opcion: "); 
    }

}