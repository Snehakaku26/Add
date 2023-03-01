
import java.util.*;
class Constructor{
    public static void main(String args[]){
        Load p= new Load("sneha");
        System.out.println(p.s);
    }     
}
class Load{
    String s;
 Load(String s){
        this.s="hello"+" "+ s;
       
    }
    
}