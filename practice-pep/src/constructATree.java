import java.util.*;

public class constructATree {

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {

        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, 75};

        Node root = new Node(arr[0], null, null);
        Pair rp = new Pair(root, 1);

        Stack<Pair> stack = new Stack<>();
        stack.push(rp);

        int idx = 0;

        while (stack.size() > 0) {

            Pair top = stack.peek();

            // LEFT CHILD
            if (top.state == 1) {
                idx++;

                if (idx < arr.length && arr[idx] != null) {
                    Node leftNode = new Node(arr[idx], null, null);
                    top.node.left = leftNode;

                    Pair lp = new Pair(leftNode, 1);
                    stack.push(lp);
                }

                top.state++;
            }

            // RIGHT CHILD
            else if (top.state == 2) {
                idx++;

                if (idx < arr.length && arr[idx] != null) {
                    Node rightNode = new Node(arr[idx], null, null);
                    top.node.right = rightNode;

                    Pair rp2 = new Pair(rightNode, 1);
                    stack.push(rp2);
                }

                top.state++;
            }

            // DONE
            else {
                stack.pop();
            }
        }

        display(root);
    }

    public static void display(Node node) {
        if (node == null) return;

        String left = (node.left == null) ? "." : node.left.val + "";
        String right = (node.right == null) ? "." : node.right.val + "";

        System.out.println(left + " <- " + node.val + " -> " + right);

        display(node.left);
        display(node.right);
    }
}
