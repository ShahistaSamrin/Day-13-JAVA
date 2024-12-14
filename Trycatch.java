/* bad request
catch block is running
finally is running  */
public class Trycatch
{
    public static void main(String args[]){
        //try-catch
        try{
            int d=90/0;
        }catch(ArithmeticException v)
        {
            System.out.println("bad request");
        }
        //try-catch & finally
        try{
            int d=90/0;
        }catch(ArithmeticException v){
            System.out.println("catch block is running");
        }finally{
            System.out.println("finally is running");
        }
    }
}

