import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class construction {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
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

    public static void display(Node root) {
        if (root == null) {
            return;
        }
        // ----------------My
        // Code-----------------------------------------------------------------------
        // if (root.left != null & root.right != null) {
        // System.out.println(root.left.data + " <- " + root.data + " -> " +
        // root.right.data);
        // } else if (root.left != null) {
        // System.out.println(root.left.data + " <- " + root.data + " -> " + "Null");
        // } else if (root.right != null) {
        // System.out.println("Null" + " <- " + root.data + " -> " + root.right.data);
        // } else {
        // System.out.println("Null" + " <- " + root.data + " -> " + "Null");
        // }

        String str = "";
        str += root.left == null ? "null" : root.left.data;
        str += "<- " + root.data + "->";
        str += root.right == null ? "null" : root.right.data;

        System.out.println(str);

        display(root.left);
        display(root.right);
    }

    public static int sum(Node root) {
        int sum = root.data;
        if (root.left != null) {
            sum += sum(root.left);
        }
        if (root.right != null) {
            sum += sum(root.right);
        }
        return sum;
    }

    public static int size(Node root) {
        int size = 0;
        if (root == null) {
            return size;
        } else {
            size++;
        }
        if (root.left != null) {
            size += size(root.left);
        }
        if (root.right != null) {
            size += size(root.right);
        }

        return size;
    }

    public static int max(Node root) {
        int max = root.data;
        if (root.left != null) {
            max = Math.max(max, max(root.left));
        }
        if (root.right != null) {
            max = Math.max(max, max(root.right));
        }
        return max;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        // coded in leet code
        return 0;
    }

    public static void traversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.println("Pre : " + root.data);
        traversal(root.left);
        System.out.println("In : " + root.data);
        traversal(root.right);
        System.out.println("Post : " + root.data);
    }

    static ArrayList<Integer> g = new ArrayList<>();

    public static boolean NodetoRootPath(Node root, int i) {
        ///////////////// MY WAYYYYY ////////////////////////

        // if (root == null) {
        // System.out.println("Tree is Empty");
        // return;
        // }
        // Stack<Pair> st = new Stack<>();
        // Pair p = new Pair(root, 1);
        // st.add(p);
        // while (st.size() > 0) {
        // System.out.println(st.peek().node.data);
        // if (st.peek().node.data == i) {
        // System.out.println("true");
        // int z = st.size();
        // for (int j = 0; j < z; j++) {
        // System.out.println(st.peek().node.data);
        // st.pop();
        // }
        // return;
        // }
        // if (st.peek().state == 1) {
        // st.peek().state++;
        // if (st.peek().node.left != null) {
        // Pair pr = new Pair(st.peek().node.left, 1);
        // st.add(pr);
        // }

        // } else if (st.peek().state == 2) {
        // st.peek().state++;
        // if (st.peek().node.right != null) {
        // Pair pr = new Pair(st.peek().node.right, 1);
        // st.add(pr);
        // }

        // } else {
        // st.pop();
        // }
        // }

        ////////////////////////// Other Way //////////////////////////////////////
        if (root == null) {
            return false;
        }
        if (root.data == i) {
            g.add(root.data);
            return true;
        }
        if (root.left != null) {
            if (NodetoRootPath(root.left, i) == true) {
                g.add(root.data);
                return true;
            }
        }
        if (root.right != null) {
            if (NodetoRootPath(root.right, i) == true) {
                g.add(root.data);
                return true;
            }
        }
        return false;
    }

    public static void kLevelsDown(Node root, int i) {
        // ---------------------My Code-----------------------------

        // if (root == null) {
        // System.out.println("Its empty");
        // }
        // Queue<Node> nodes = new ArrayDeque<>();
        // nodes.offer(root);
        // System.out.println(root.data + " added");
        // for (int k = 0; k < i; k++) {
        // for (int z = nodes.size(); z > 0; z--) {
        // Node temp = nodes.poll();
        // System.out.println(temp.data + " removed");

        // if (temp.left != null) {
        // nodes.offer(temp.left);
        // System.out.println(temp.left.data + " added");
        // }
        // if (temp.right != null) {
        // nodes.offer(temp.right);
        // System.out.println(temp.right.data + " added");
        // }
        // }
        // }
        // ArrayList<Integer> ans = new ArrayList<>();
        // System.out.println(nodes.size());
        // for (int j = nodes.size(); j > 0; j--) {
        // int val = nodes.poll().data;
        // System.out.println(val + " added");
        // ans.add(val);
        // }
        // System.out.println(ans);

        // --------------------recursion------------------------------------
        if (root == null || i < 0) {
            return;
        }
        if (i == 0) {
            System.out.println(root.data);
        }
        kLevelsDown(root.left, i - 1);
        kLevelsDown(root.right, i - 1);
    }

    public static void kLevelFar(Node root, int d, int i) {
        ArrayList<Integer> list = NodetoRootPath2(root, i);

    }

    public static ArrayList<Integer> NodetoRootPath2(Node root, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root.data == i) {
            list.add(root.data);
            return list;
        }
        if (root.left != null) {

            if (!NodetoRootPath2(root.left, i).isEmpty()) {
                list.add(root.data);
            }

        }
        if (root.right != null) {
            if (!NodetoRootPath2(root.right, i).isEmpty()) {
                list.add(root.data);
            }
        }
        return list;
    }

    public static void main(String args[]) {
        Integer[] a = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };
        Stack<Pair> st = new Stack<>();

        Node root = new Node(a[0], null, null);
        Pair p = new Pair(root, 1);
        st.push(p);

        int i = 0;
        while (st.size() != 0) {
            if (st.peek().state == 1) {
                i++;
                if (a[i] != null) {

                    Node temp = new Node(a[i], null, null);
                    st.peek().node.left = temp;
                    st.peek().state++;
                    Pair pair = new Pair(temp, 1);
                    st.push(pair);
                } else {
                    st.peek().state++;
                }

            } else if (st.peek().state == 2) {
                i++;
                if (a[i] != null) {

                    Node temp = new Node(a[i], null, null);
                    st.peek().node.right = temp;
                    st.peek().state++;
                    Pair pair = new Pair(temp, 1);
                    st.push(pair);
                } else {
                    st.peek().state++;
                }

            } else {
                st.pop();
            }
        }
        System.out.println("------------------------------------------------------------");
        display(root);
        System.out.println("------------------------------------------------------------");
        // System.out.println("Size = " + size(root));
        // System.out.println("Sum = " + sum(root));
        // System.out.println("height = " + height(root));// **************in leetcode
        // System.out.println("Max = " + max(root));
        // traversal(root);

        // boolean c = NodetoRootPath(root, 70);
        // System.out.println(c);
        // System.out.println(g);
        // kLevelsDown(root, 3);
        // kLevelFar(root, d, i);
        System.out.println(NodetoRootPath2(root, 70));
    }
}
