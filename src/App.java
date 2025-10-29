public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();

        final int[] numerosOriginal = new int[] {1, 3, -3, 2, 23};
        
        MetodoSeleccion sortSelection = new MetodoSeleccion();
        MetodoInsercion sortInsercion = new MetodoInsercion();
        MetodoBurbuja sortBubble = new MetodoBurbuja();


        while (true) {
            view.showMenu();
            int option = view.inputOption(4);
            
            if (option == 4) {
                System.out.println("Adios");
                System.exit(0); 
                break;
            }

            view.showOrderMenu();
            int orden = view.inputOption(2);
            boolean ordenOpt = orden == 1; 

            view.showPasosMenu();
            int pasos = view.inputOption(2);
            boolean mostrarPasos = pasos == 1; 

            int[] numerosParaOrdenar = numerosOriginal.clone();

            System.out.println("\nArreglo Original:");
            printArray(numerosParaOrdenar);

            switch (option) {
                case 1:
                    System.out.println("--- Metodo Seleccion ---");
                    sortSelection.sort(numerosParaOrdenar, ordenOpt, mostrarPasos);
                    System.out.println("--- Resultado Seleccion ---");
                    printArray(numerosParaOrdenar);
                    break;

                case 2:
                    System.out.println("--- Metodo Insercion ---");
                    sortInsercion.sort(numerosParaOrdenar, ordenOpt, mostrarPasos);
                    System.out.println("--- Resultado Insercion ---");
                    printArray(numerosParaOrdenar);
                    break;

                case 3:
                    System.out.println("--- Metodo Bubble ---");
                    sortBubble.sort(numerosParaOrdenar, ordenOpt, mostrarPasos);
                    System.out.println("--- Resultado Bubble ---");
                    printArray(numerosParaOrdenar);
                    break;

                default:
                    break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}