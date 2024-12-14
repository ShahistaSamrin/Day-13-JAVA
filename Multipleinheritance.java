/*  Hello Teachers
Hello Professor  */
import java.util.*;
interface a{
    public void r();  
}
interface b{
    public void r1();
}
class c implements a,b{
    public void r(){
        System.out.println("Hello Teachers");
    }
    public void r1(){
        System.out.println("Hello Professor");
    }
}
public class Multipleinheritance{
    public static void main(String args[]){
        c h1=new c();
        h1.r();
        h1.r1();
    }
}