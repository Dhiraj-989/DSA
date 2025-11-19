
import java.util.HashMap;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LoopLengthFinder {

    // Detect loop and return its length
    public boolean detectLoop(Node head){
        if(head == null){
            return false;
        }

        Node hare = head;
        Node turtle = head;

        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle){
                return true;
            }
            
        }
        return false;

    }
    public int countLoopLength(Node head) {
        // You will implement this

        Node curr = head;
        
            HashMap<Node, Integer> map = new HashMap<>();
            
            int t = 1;
            int value = 1;

            while( curr != null){
                if(map.containsKey(curr)){
                    value = map.get(curr);
                    return t - value;
                }

                map.put(curr, t);
                t++;
                curr = curr.next;
            }
            return 0;
    }
}


public class LinkedListWithLoop {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void createLoop(int pos) {
        if (pos <= 0) return;
        Node loopNode = head;
        for (int i = 1; i < pos && loopNode != null; i++) {
            loopNode = loopNode.next;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = loopNode; // create loop
    }

    public void display(int count) {
        Node current = head;
        int c = 0;
        while (c < count && current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
            c++;
        }
        System.out.println("...");
    }

    public static void main(String[] args) {
        LinkedListWithLoop list = new LinkedListWithLoop();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.createLoop(2);

        list.display(15);

        // Use LoopLengthFinder
        LoopLengthFinder finder = new LoopLengthFinder();
        System.out.println("Loop : " + finder.detectLoop(list.head));

        int length = finder.countLoopLength(list.head);
        System.out.println("Length of loop: " + length);
    }
}
