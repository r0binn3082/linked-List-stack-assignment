public class app {
    public static void main(String[] args) {
        Stack s  = new Stack();
        nodeData nd = new nodeData(10);
        s.push(nd);
        System.out.println(s.pop() + " ");
        /*
         * expected output 
         * 10 
         */
        nodeData nd1 = new nodeData(15);
        s.push(nd1);
        System.out.println(s.pop());
        
        
    }
}