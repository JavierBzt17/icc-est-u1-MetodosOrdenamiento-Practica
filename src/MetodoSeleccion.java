public class MetodoSeleccion {

    public void sort(int[] numeros, boolean asc, boolean pasos) {
        if (asc){
            sortAscendente(numeros, pasos);
        }else{
            sortDescendente(numeros, pasos);
        }
    }

    private void sortAscendente(int[] numeros, boolean pasos){
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros[j] < numeros[min_idx]) {
                    min_idx = j;
                }
            }
            swap(numeros, min_idx, i);
            if (pasos) {
                printArray(numeros);
            }
        }
    }

    private void sortDescendente(int[] numeros, boolean pasos){
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros[j] > numeros[max_idx]) {
                    max_idx = j;
                }
            }
            swap(numeros, max_idx, i);
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