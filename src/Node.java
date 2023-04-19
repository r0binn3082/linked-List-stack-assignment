public class Node {
    /*ponting */

    private nodeData D1;
    private Node next;

    public Node(nodeData D2){
        next = null; 
        D1 = D2 ; 
    }
    
    public void set_data(nodeData D2){
        D1 = D2;
    }
    
    public void set_next(Node top){
        next = top;
    }
    
    public nodeData getNodeData(){
        return D1;
    }
    
    public Node getNode(){
        return next;
    }
}