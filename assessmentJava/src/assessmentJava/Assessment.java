package assessmentJava;
import java.io.*;
import java.util.Scanner;

public class Assessment {
	
	
	public  static String getString() {
		
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(100);

            for (int i = 0; i < 100; i++) {
            	
            	int index = (int)(alphabets.length()* Math.random());
            	sb.append(alphabets.charAt(index));
                       }

         return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		int lines = s.nextInt();
		
		
        FileWriter fs = new FileWriter("output.txt");
        
        BufferedWriter writer = new BufferedWriter(fs);
        
        for(int i=0;i<lines;i++) {
        	
        	writer.write(getString());
        	writer.newLine();
        }
        
        writer.close();
        fs.close();
        s.close();
        
        
        
        
        
        
			

	}

}
