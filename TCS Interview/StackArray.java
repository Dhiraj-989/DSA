public class StackArray {
    int top;
    int size;
    int[] stack;

    StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int val){
        if(top == size - 1){
            System.out.println("stack overflow");
            return;
        }
        stack[++top] = val;
    }

    public void pop(){
        if(top == -1){
            System.out.println("stack underflow");
            return;
        }
        top--;
    }

    public int peek(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        return stack[top];
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    

    
    public static void main(String[] args) {
        StackArray st = new StackArray(5);
        st.push(3);
        st.push(4);
        st.push(44);
        st.push(345);
        st.push(321);
        st.push(4);

        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());
    }
}
