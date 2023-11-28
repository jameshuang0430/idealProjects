import java.io.FileNotFoundException;
import java.io.PrintStream;

public class CH2Q4_1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream("aaa.txt"); //constructor
        System.out.println("一串文字" );//literal
        String a = "this" ;
        String b = "is" ;
        String c = "java" ;

        String d = a +" "+ b +" "+ c;
        System.out.println(  d  );
        System.out.println( "Yes," + d);
        System.out.println(  d + "?");

        System.out.print( "Yes," + d +"\n");
        System.out.print(  d + "?\n" );

        System.out.print( a +"\t"+ b +"\t\t"+c+"\n");
        System.out.print( b +"\t\t"+ a +"\t"+c+"\n");

    }
}
