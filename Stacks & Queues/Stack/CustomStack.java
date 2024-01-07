public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){ // if user does not specify a size for stack
        this(DEFAULT_SIZE);
    }
    
    public CustomStack(int size) { // if user specifies a size for the stack
        this.data = new int[size];
    }

    public boolean push(int item){ 
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception{ // see top element
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    private boolean isFull(){
        return ptr == data.length -1 ; // ptr at last index
    }

    private boolean isEmpty(){
        return ptr ==-1 ; // ptr at last index
    }
}
