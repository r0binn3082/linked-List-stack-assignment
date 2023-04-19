public class app {
    public static void main(String[] args) {
        Stack s  = new Stack();
        nodeData nd = new nodeData(10);
        s.push(nd);
        System.out.print(s.pop() + " ");
        /*
         * expected output 
         * 10 
         */
    }
}