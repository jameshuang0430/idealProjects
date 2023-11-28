import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class CH2Q4_2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream("index.html");
        out.println("<table>");
        out.println("<tr><td>1</td></tr>");
        out.println("<tr><td>2</td></tr>");
        out.println("<tr><td>3</td></tr>");
        out.println("<tr><td>4</td></tr>");
        out.println("<tr><td>5</td></tr>");
        out.println("<tr><td>6</td></tr>");
        out.println("<tr><td>7</td></tr>");
        out.println("<tr><td>8</td></tr>");
        out.println("</table>");
        
        Scanner scanner = new Scanner(new FileInputStream("index.html"));
        while (scanner.hasNext())
        {
            String str = scanner.nextLine();
            System.out.println("str = " + str);
        }
    }
}
