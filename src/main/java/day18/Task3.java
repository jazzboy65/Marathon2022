package day18;


public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);

        int[] numbers = {14,23,11,16,22,27,5,15,18,24,159,8};
            for(int number: numbers) {
                addNode(number,root);
            }
            dfs(root);
    }

    private static void addNode(int valueInput, Node root) {
        if(root == null) {
            throw new IllegalArgumentException("Корневой узел = null");
        }
        Node nextNode = root;
        Node currentNode = null;

        while (nextNode != null) {
            currentNode = nextNode;

            if(valueInput < currentNode.getValue()) {
                nextNode = currentNode.getLeftValue();
            } else {
                nextNode = currentNode.getRightValue();
            }
        }

        if(valueInput < currentNode.getValue()) {
            currentNode.setLeftValue(new Node(valueInput));
        } else {
            currentNode.setRightValue(new Node(valueInput));
        }
    }

    private static void dfs(Node node) {
        if(node == null) {
            return;
        }
        dfs(node.getLeftValue());
        System.out.print(node.getValue()+ " ");
        dfs(node.getRightValue());
    }
}

class Node {
    private final int value;
    private Node leftValue;
    private Node rightValue;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftValue() {
        return leftValue;
    }

    public Node getRightValue() {
        return rightValue;
    }

    public void setLeftValue(Node leftValue) {
        this.leftValue = leftValue;
    }

    public void setRightValue(Node rightValue) {
        this.rightValue = rightValue;
    }
}
