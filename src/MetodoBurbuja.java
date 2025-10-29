public class MetodoBurbuja {

    public void sort(int[] numeros, boolean asc, boolean pasos) {
        if (asc) {
            sortAscendente(numeros, pasos);
        } else {
            sortDescendente(numeros, pasos);
        }
    }

    private void sortAscendente(int[] numeros, boolean pasos) {
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    swap(numeros, j, j + 1);
                }
            }
            if (pasos) {
                printArray(numeros);
            }
        }
    }

    private void sortDescendente(int[] numeros, boolean pasos) {
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    swap(numeros, j, j + 1);
                }
            }
            if (pasos) {
                printArray(numeros);
            }
        }
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}