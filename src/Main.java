public class Main {
    public static void main(String [] args) {
        Sort sort = new Sort(generateRandomArray());
        System.out.println("Before selection sort method \n" + sort.toString());
        sort.selectionSort();
        System.out.println("After selection sort method \n" + sort.toString());
    }

    public static int[] generateRandomArray() {
        int arrayLength = 1 + (int) (Math.random() * 15);
        int[] array = new int[arrayLength];

        for (int i=0; i < array.length; i++)
            array[i] = (int) (Math.random() * 100);

        return array;
    }
}