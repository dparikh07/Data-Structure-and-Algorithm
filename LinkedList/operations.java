package LinkedList;

import java.util.Scanner;

public class operations {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void getValueAt() {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Node temp = head;
            if (size == 0) {
                System.out.print("LinkedList is empty");
            } else if (n > size || n < 0) {
                System.out.print("Out of bound you gave the value bigger then linkedlist!!");
            } else {
                for (int i = 0; i < n; i++) {
                    temp = temp.next;
                }
                System.out.print(temp.data);
            }
        }

        public Node getNodeAt(int n) {
            Node temp = head;
            if (size == 0) {
                System.out.print("LinkedList is empty");
            } else if (n > size || n < 0) {
                System.out.print("Out of bound you gave the value bigger then linkedlist!!");
            } else {
                for (int i = 0; i < n; i++) {
                    temp = temp.next;
                }
            }
            return temp;
        }

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            size++;
            if (size == 0) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        public void removeFirst() {
            head = head.next;
            size--;
        }

        public void addAt(int n, int val) {
            Node temp = new Node();
            Node ref = new Node();
            ref = head;
            temp.data = val;
            if (n < 0 || n > size) {
                System.out.print("Invalid entry");
            } else if (n == 0) {
                addFirst(val);
            } else if (n == size) {
                addLast(val);
            } else {
                for (int i = 0; i < n - 1; i++) {
                    ref = ref.next;
                }
                temp.next = ref.next;
                ref.next = temp;
                size++;
            }
        }

        public void removeLast() {
            if (size == 0) {
                System.out.print("LinkedList is already empty");
            } else if (size == 1) {
                head = tail = null;
                size--;
            } else {
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                tail = temp;
                temp.next = null;
                size--;
            }
        }

        public void reverseDataIterative() {
            int l = 0;
            int r = size - 1;
            while (l < r) {
                Node left_Node = getNodeAt(l);
                Node right_Node = getNodeAt(r);

                int temp = left_Node.data;
                left_Node.data = right_Node.data;
                right_Node.data = temp;
                l++;
                r--;
            }
            display();
            // Time complexity=>o(n)
            // Space Complexity=>o(1)
        }

        // ************* My Approach which didn't
        // work********************************************************

        // public void reverseDataPointerIterative() {
        // int last_Index = size - 1;
        // int secondLast_Index = last_Index - 1;
        // while (secondLast_Index >= 0) {
        // if (last_Index < 0) {
        // Node last = getNodeAt(secondLast_Index);
        // last.next = null;
        // tail = last;
        // } else {
        // Node last = getNodeAt(last_Index);
        // Node secondLast = getNodeAt(secondLast_Index);
        // if (last_Index == size - 1) {
        // head = last;
        // }
        // last.next = secondLast;
        // last_Index--;
        // secondLast_Index--;
        // }
        // }
        // display();
        // // Time complexity=>o(n)
        // // Space Complexity=>o(1)
        // }

        // **********************************************************************************************************
        public void reverseDataPointerIterative() {
            Node curr = head;
            Node prev = null;
            while (curr != null) {
                Node temp = curr.next;

                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            Node temp = head;
            head = tail;
            tail = temp;
            display();
        }

        public void removeAt(int n) {
            if (n >= size || n < 0) {
                System.out.print("error: index out");
            } else if (n == 0) {
                removeFirst();
            } else if (n == size - 1) {
                removeLast();
            } else {
                Node prev = head;
                for (int i = 0; i < n - 1; i++) {
                    prev = prev.next;
                }
                prev.next = prev.next.next;
                size--;
            }
            display();
        }
    }

    public static void main(String[] args) {
        System.out.println("Write Down the number of nodes in the linkedlist");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList list = new LinkedList();

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            list.addLast(l);
        }
        list.display();
        // list.reverseDataIterative();
        // list.reverseDataPointerIterative();
        list.removeAt(1);
        // list.getValueAt();
        // list.addFirst(10);
        // list.display();
        // list.addAt(1, 300);
        // list.display();
        // list.removeLast();

    }
}
