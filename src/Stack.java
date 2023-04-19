public class Stack {
    
    private Node top;

    public Stack(){
        top = null;
    }

    public boolean isEmpty(){
        return (top == null);
    }

    public void push(nodeData data) {
        Node node1  = new Node(data);
        node1.set_next(top);
        top = node1;
    }

    public nodeData pop() {
        if (isEmpty()) System.out.println("the Stack is already empty");
        
        return top.getNodeData() ;
    }
}