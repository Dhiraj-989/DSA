public class DLL{
    Node head;

    public class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

    }

    public void printDLL(){
        Node curr = head;

        while( curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public Node deleteHead(){
        if(head == null || head.next == null){
            return null;
        }
        Node prev = head;
        head = head.next;
        
        head.prev = null;
        prev.next = null;
        
        return head;
    }

    public Node deleteTail(){
        Node tail = head;

        while( tail.next != null){
            tail = tail.next;
        }

        Node prev = tail.prev;
        prev.next = null;
        tail.prev = null;

        return tail;
        
    }

    public Node deleteK(int k){
        if( head == null){
            return null;
        }
        Node temp = head;
        int count = 0;

        while( temp != null){
            count++;

            if( count == k){
                break;
            }
            temp = temp.next;
        }
        Node prev = temp.prev;
        Node next = temp.next;

        if( prev == null && next == null){
            return null;
        }else if( prev == null){
            return deleteHead();  
        }else if( next == null){
            return deleteTail();  
        }

        // link changes
        prev.next = next;
        next.prev = prev;

        temp.prev = null;
        temp.next = null;

        return head;

    }

    public Node insertBeforeHead(int val){
        Node newNode = new Node(val);
        Node next = head;

        newNode.next = head;
        newNode.prev = null;
        
        next.prev = newNode;
        head = newNode;


        return head;
    }

    public Node insertBeforeTail(int val){

        Node tail = head;

        while( tail.next != null){
            tail = tail.next;
        }

        Node newNode = new Node(val);

        Node prev = tail.prev;

        prev.next = newNode;
        tail.prev = newNode;

        newNode.prev = prev;
        newNode.next = tail;

        return head;

        
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2};

        DLL dll = new DLL();

        for( int val : arr){
            dll.insertEnd(val);
        }

        dll.printDLL();

        dll.deleteHead();
        dll.printDLL();

        dll.deleteTail();
        dll.printDLL();

        dll.deleteK(2);
        dll.printDLL();

        dll.insertBeforeHead(7);
        dll.printDLL();

        dll.insertBeforeTail(9);
        dll.printDLL();
    }
}