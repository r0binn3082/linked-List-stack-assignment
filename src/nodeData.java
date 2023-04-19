public class nodeData {
    
    private int x;
    
    public nodeData (int number){
        x = number;
    }

    public void set_node(int number) {
        x = number;
    }

    public int get_node(){
        return x;
    }

    public int combareTo( nodeData n1){
        if (n1.x == x) return 0 ;
        else if (n1.x < x) return (-1) ;
        return 1 ;
    }

    public String toString(){
        return ""+x ;
    }
}
