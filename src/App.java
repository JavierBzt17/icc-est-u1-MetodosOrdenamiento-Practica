public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();

        int[] numeros = new int[] {1, 3, -3, 2, 23};
        MetodoSeleccion sortSelection = new MetodoSeleccion();
        MetodoInsercion sortInsercion = new MetodoInsercion();
        MetodoBurbuja sortBubble = new MetodoBurbuja();


        while (true) {
            view.showMenu();
            int option = view.inputOption(4);
            
            view.showOrderMenu();
            int orden = view.inputOption(2);
            boolean ordenOpt = orden == 1;
            view.showPasosMenu();
            int pasos = view.inputOption(2);


            switch (option) {
                case 1:
                    System.out.println("Metodo Seleccion");
                    sortSelection.sort(numeros, ordenOpt, pasos == 1);
                    break;

                case 2:
                    System.out.println("Metodo Insercion");
                    break;

                case 3:
                    System.out.println("Metodo Bubble");
                    break;

                case 4:
                    System.out.println("Adios");
                    System.exit(4);
                    break;

                default:
                    break;
            }
        }
    }
}
