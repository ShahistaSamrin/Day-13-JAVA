/*  Hello Student
Hello Student
Hello Teacher  */
import java.util.*;
class a{//a is parent node
    public void p1()
    {
        System.out.println("Hello Student");
    }
}
class b extends a{//b is the child or sub class
public void r(){
    System.out.println("Hello Teacher");
}
}
public class Singleinheritance{
    public static void main(String args[]){
        a h=new a();
        h.p1();
        b y=new b();
        y.p1();
        y.r();
    }
}