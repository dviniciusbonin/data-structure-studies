package sort;

public class Sort {
    private int[] array;

    public Sort(int[] array) {
        this.array = array;
    }
    public void setArray(int[] array) {
        this.array = array;
    }
    public void selectionSort() {
        int c = 0, t = 0;
        for (int i=0; i < array.length - 1; i++) {
            int indexSmaller = i;

            for(int j=i+1; j < array.length; j++) {
                c++;
                if(array[indexSmaller] > array[j])
                    indexSmaller = j;
            }

            if(i != indexSmaller) {
                t++;
                int aux = array[i];
                array[i] = array[indexSmaller];
                array[indexSmaller] = aux;
            }
        }
        System.out.println("comparacoes = " + c + "trocas = " + t);
    }

    public void bubbleSort() {
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < (array.length - i - 1); j++) {
                if(array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    public void insertionSort() {
        int newArray[] = new int[array.length], i, j;
        for (i = 0; i < array.length; i++) {
            for (j = i; j > 0 && array[i] < newArray[j-1]; j--)
                newArray[j] = newArray[j-1];

            newArray[j] = array[i];
        }
        setArray(newArray);
    }

    @Override
    public String toString() {
        String result = "";
        for (int item : array)
            result += item + "\t";

        return result;
    }
}
