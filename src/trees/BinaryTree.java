package trees;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root = null;
    private int size;

    public void insert(T value) {
        if (isEmpty()) {
            Node<T> node = new Node<T>(value);
            this.root = node;
            return;
        }

        insert(root, value);
        this.size++;
    }

    private void insert(Node node, T value) {
        if (value.compareTo((T) node.getValue()) < 0) {
            if (node.getLeft() == null)
                node.setLeft(new Node(value));
            else
                insert(node.getLeft(), value);
        } else {
            if (node.getRight() == null)
                node.setRight(new Node(value));
            else
                insert(node.getRight(), value);
        }
    }

    public T search(T value) {
        return search(root, value);
    }

    private T search(Node node, T value) {
        if (node == null)
            return null;

        if (value == node.getValue())
            return value;

        if (value.compareTo((T) node.getValue()) < 0)
            return search(node.getLeft(), value);

        return search(node.getRight(), value);
    }

    public void remove(T value) {
        remove(root, value);
    }

    private void remove(Node node, T value) {
        System.out.println("value " + value + " NODE " + node.getValue());
        if (value.compareTo((T) node.getValue()) == 0) {
            Node right = node.getRight();
            Node left = node.getLeft();

            root = left;
            root.setRight(right);
            return;
        }

        if (value.compareTo((T) node.getValue()) < 0) {
            if (node.getLeft().getValue().compareTo(value) == 0) {
                if (node.getLeft().getLeft() == null && node.getLeft().getRight() == null)
                    node.setLeft(null);
            } else
                remove(node.getLeft(), value);
        } else {
            if (node.getRight().getValue() == value) {
                if (node.getRight().getLeft() != null && node.getRight().getRight() == null) {
                    Node left = node.getRight().getLeft();
                    node.setRight(left);
                    return;
                }
                if (node.getRight().getLeft() == null && node.getRight().getRight() == null)
                    node.setRight(null);
            } else
                remove(node.getRight(), value);
        }
    }

    public void toStringTree() {
        this.toString(root);
    }

    private void toString(Node node) {
        if (node != null) {
            toString(node.getLeft());
            System.out.println(node.getValue().toString());
            toString(node.getRight());
        }
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int size() {
        return size;
    }

    public Node<T> getRoot() {
        return root;
    }
}
