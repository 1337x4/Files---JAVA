import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class subFile {
    Scanner kbd;
    
    public void openFile()
    {
        try 
        {
            kbd = new Scanner(new File("YOUR_PATH"));
        }
        catch (FileNotFoundException e) 
        {
            System.out.println("Couldn't find file");   
        }
    }
    public void readFile()
    {
        
        while (kbd.hasNext()) 
        {
            String a = kbd.next();
            String b = kbd.next();
            String c = kbd.next();
            
            System.out.print(a);
            System.out.print(" "+b);
            System.out.print(" "+c);
            
            if (kbd.hasNextLine()) 
            {
                System.out.println();
            }
        }
    }

    public void closeFile()
    {
        kbd.close();
    }

}
