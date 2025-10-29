public class MetodoInsercion {

    public void sort(int[] numeros, boolean asc, boolean pasos) {
        if (asc) {
            sortAscendente(numeros, pasos);
        } else {
            sortDescendente(numeros, pasos);
        }
    }

    private void sortAscendente(int[] numeros, boolean pasos) {
        int n = numeros.length;
        for (int i = 1; i < n; ++i) {
            int key = numeros[i];
            int j = i - 1;

            while (j >= 0 && numeros[j] > key) {
                numeros[j + 1] = numeros[j];
                j = j - 1;
            }
            numeros[j + 1] = key;
            
            if (pasos) {
                printArray(numeros);
            }
        }
    }

    private void sortDescendente(int[] numeros, boolean pasos) {
        int n = numeros.length;
        for (int i = 1; i < n; ++i) {
            int key = numeros[i];
            int j = i - 1;

            while (j >= 0 && numeros[j] < key) {
                numeros[j + 1] = numeros[j];
                j = j - 1;
            }
            numeros[j + 1] = key;

            if (pasos) {
                printArray(numeros);
            }
        }
    }
    
    private void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}