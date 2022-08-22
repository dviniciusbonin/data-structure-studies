public class Sort {
    private int[] array;

    public Sort(int[] array) {
        this.array = array;
    }
    public void setArray(int[] array) {
        this.array = array;
    }
    public void selectionSort() {
        for (int i=0; i < array.length - 1; i++) {
            int indexSmaller = i;

            for(int j=i+1; j < array.length; j++) {
                if(array[indexSmaller] > array[j])
                    indexSmaller = j;
            }

            if(i != indexSmaller) {
                int aux = array[i];
                array[i] = array[indexSmaller];
                array[indexSmaller] = aux;
            }
        }
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

    @Override
    public String toString() {
        String result = "";
        for (int item : array)
            result += item + "\t";

        return result;
    }
}
