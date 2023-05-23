package Step4;

import java.io.*;
import java.util.Scanner;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            // Print out a running total of all the
            // values in the input file.

            try {
                Scanner in = new Scanner(new File("/Users/kellsbells/Projects/zcw/FileIOJava/Step4/input.txt"));
                PrintWriter outLine = new PrintWriter(new File("/Users/kellsbells/Projects/zcw/FileIOJava/Step4/output.txt"));
                int total = 0;
                while (in.hasNext()) {
                    String line = in.nextLine();
                    total += Integer.parseInt(line);
                    String out = "Running total = " + total;
                    System.out.println(out);
                    outLine.println(out);
                }
                outLine.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
            }


        }
}