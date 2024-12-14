/*  Hello Teacher
Hello Student
Hello Professors
Hello Student  */
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
public class Hierarchicalinheritance{
    public static void main(String args[]){
        b h=new b();
        h.r();
        h.p1();
        c h1=new c();
        h1.r1();
        h1.p1();
    }
}