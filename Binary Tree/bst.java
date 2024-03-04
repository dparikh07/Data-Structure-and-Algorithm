public class bst {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(Node left, int data, Node right) {
            this.left = left;
            this.data = data;
            this.right = right;
        }
    }

    public static int mid(int low, int high) {
        int mid = (int) Math.floor((low + high) / 2);
        return mid;
    }

    public static Node construct(int[] a, int low, int high) {
        if (low > high) {
            Node root = null;
            return root;
        }
        int mid = mid(low, high);
        Node left = construct(a, low, mid - 1);
        Node right = construct(a, mid + 1, high);
        Node root = new Node(left, a[mid], right);
        return root;
    }

    public static void display(Node root) {
        if (root == null) {
            return;
        }
        String str = "";
        str += root.left == null ? "Null" : root.left.data;
        str += "<--" + root.data + "-->";
        str += root.right == null ? "Null" : root.right.data;

        display(root.left);
        display(root.right);

        System.out.println(str);
    }

    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        int left = size(root.left);
        int right = size(root.right);
        return left + right + 1;
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int sum = root.data;
        sum += sum(root.left) + sum(root.right);
        return sum;
    }

    public static int min(Node root) {
        if (root.left == null) {
            return root.data;
        }
        int min = min(root.left);
        return min;
    }

    public static int max(Node root) {
        if (root.right == null) {
            return root.data;
        }
        int max = max(root.right);
        return max;
    }

    public static Node add(Node root, int i) {
        // if (root.left == null && i < root.data) {
        // Node newNode = new Node(null, i, null);
        // root.left = newNode;
        // return;
        // }
        // if (root.right == null && i > root.data) {
        // Node newNode = new Node(null, i, null);
        // root.right = newNode;
        // return;
        // }
        // if (i < root.data) {
        // add(root.left, i);
        // } else {
        // add(root.right, i);
        // }
        if (root == null) {
            Node newNode = new Node(null, i, null);
            return newNode;
        }
        if (i < root.data) {
            root.left = add(root.left, i);
        } else if (i > root.data) {
            root.right = add(root.right, i);
        }
        return root;
    }

    // public static Node get(Node root, int n) {
    // if (root.data == n || root.left.data == n || root.right.data == n) {
    // return root;
    // }
    // if (n < root.data && root.left != null) {
    // return get(root.left, n);
    // } else if (n > root.data && root.right != null) {
    // return get(root.right, n);
    // }
    // return null;
    // }

    // public static Node find(Node root, int n) {
    // if (root == null) {
    // return null; // Value not found in the tree
    // }

    // if (root.data == n) {
    // return root;
    // } else if (n < root.data) {
    // return find(root.left, n);
    // } else { // n > root.data
    // return find(root.right, n);
    // }
    // }

    public static Node maxNode(Node root) {
        if (root.right == null) {
            return root;
        }
        Node max = maxNode(root.right);
        return max;
    }

    public static Node remove(Node root, int n) {
        if (root == null) {
            return null;
        }
        if (n < root.data) {
            root.left = remove(root.left, n);
        } else if (n > root.data) {
            root.right = remove(root.right, n);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int left_max = max(root.left);
                remove(root.left, left_max);
                return maxNode(root.left);
            }
        }
        return root;
    }

    public static void larger_sum(Node root) {
        int sum = 0;
        if (root == null) {
            return;
        }

        larger_sum(root.right);

        sum += root.data;
        root.data = sum;

        larger_sum(root.left);

    }

    public static void main(String args[]) {
        int[] a = { 12, 25, 37, 50, 62, 75, 87 };
        Node root = construct(a, 0, a.length - 1);
        System.out.println("--------------------------------");
        display(root);
        System.out.println("--------------------------------");
        // System.out.println("Size : " + size(root));
        // System.out.println("Sum : " + sum(root));
        // System.out.println("Min : " + min(root));
        // System.out.println("Max : " + max(root));
        // add(root, 55);
        // display(root);
        // remove(root, 55);
        // display(root);
        larger_sum(root);
        display(root);
    }
}
