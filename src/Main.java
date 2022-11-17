import sort.*;
import trees.BinaryTree;

public class Main {
    public static void main(String [] args) {
        /*

        ----------------------- Sample sorting methods ----------------------------

        Sort sort = new Sort(new int[]{10, 9, 8, 7, 6 , 5, 5, 3, 2, 1});
        System.out.println("Before selection sort method \n" + sort.toString());
        sort.selectionSort();
        System.out.println("After selection sort method \n" + sort.toString());

        System.out.println("\n");
        sort.setArray(generateRandomArray());

        System.out.println("Before bubble sort method \n" + sort.toString());
        sort.bubbleSort();
        System.out.println("After bubble sort method \n" + sort.toString());

        System.out.println("\n");
        sort.setArray(generateRandomArray());

        System.out.println("Before insertion sort method \n" + sort.toString());
        sort.insertionSort();
        System.out.println("After insertion sort method \n" + sort.toString());

        sort.selectionSort();
         */


        /*
            Binary Tree
         */

        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        System.out.println(tree.isEmpty());
        tree.insert(8);
        System.out.println("Depois de inserir uma string na arvore " + tree.isEmpty());

        tree.insert(10);
        tree.insert(9);
        tree.insert(3);
        tree.insert(14);
        System.out.println("Depois de inserir mais uma string na arvore " + tree.isEmpty());
        System.out.println(tree.size());
        System.out.println();
        System.out.println();
        tree.toStringTree();

        System.out.println("pesquisei por 10 achei = " + tree.search(10));
        tree.remove(10);
        System.out.println("Lista");
        tree.toStringTree();
    }

    public static int[] generateRandomArray() {
        int arrayLength = 1 + (int) (Math.random() * 15);
        int[] array = new int[arrayLength];

        for (int i=0; i < array.length; i++)
            array[i] = (int) (Math.random() * 100);

        return array;
    }
}