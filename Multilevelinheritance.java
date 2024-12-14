/* Hello Student
Hello Teacher
Hello Professors  */
import java.util.*;
class a{
    public void p1()
    {
        System.out.println("Hello Student");
    }
}
class b extends a{
public void r(){
    System.out.println("Hello Teacher");
}
}
class c extends b{
public void r1(){
    System.out.println("Hello Professors");
}
}
public class Multilevelinheritance{
    public static void main(String args[]){
        c h=new c();
        h.p1();
        h.r();
        h.r1();
    }
}