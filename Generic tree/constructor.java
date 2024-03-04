import java.util.*;

public class constructor {
    private static class Node {
        int data;
        ArrayList<Node> child = new ArrayList<>();
    }

    public static void display(Node r) {
        String s = r.data + " -> ";
        for (Node child : r.child) {
            s += child.data + ", ";
        }
        System.out.println(s + ".");
        for (Node child : r.child) {
            display(child);
        }
    }

    public static int size(Node root) {
        int size = 0;

        for (Node child : root.child) {
            size = size + size(child);
        }

        return size + 1;
    }

    public static int max(Node root) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(root.data);
        for (Node child : root.child) {
            a.add(max(child));
        }
        int max = root.data;
        for (Integer i : a) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] a = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
        Stack<Node> st = new Stack<>();
        Node root = null;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                // Create Node
                Node t = new Node();
                // Set Node
                t.data = a[i];
                if (st.size() == 0) {
                    // Set Root
                    root = t;
                } else {
                    // Set assign a parent (set a children)
                    st.peek().child.add(t);
                }
                // Finally Push it
                st.push(t);
            } else {
                st.pop();
            }
        }
        display(root);
        System.out.println(size(root));
        System.out.println(max(root));
    }
}