import java.util.Stack;

public class ReverseDLL{
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void convertToDLL(int val){

        Node newNode = new Node(val);
        if( head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while( temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void printDLL(){

        Node temp = head;

        while( temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void revDLL(){
        Node curr = head;
        Node temp = null;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }

    }

    public void naive(){
        Stack<Integer> st = new Stack<>();

        Node temp = head;

        while( temp != null){
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            temp.data = st.pop();
            temp = temp.next;
        }
        
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        ReverseDLL rev = new ReverseDLL();

        for(int val : arr){
            rev.convertToDLL(val);
        }

        System.out.println("Before reversing: ");
        rev.printDLL();

        System.out.println("Links Approach: ");
        rev.revDLL();
        rev.printDLL();

        System.out.println("Naive Solution: ");
        rev.naive();
        rev.printDLL();


    }
}