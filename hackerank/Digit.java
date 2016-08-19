package hackerank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Digit {
 static int d=0;
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
       String string = s.nextLine();
      int k= pangram(string);
      System.out.println(k);
       
    }
    
    static int pangram(String s)
        {
    	int h=0;
    	boolean b=false;
    	int j=65;
    	while(j<=90)
        {
        
    		
    		for(int i=0;i<s.length();i++)
            {
             if(s.charAt(i)!=' ')
                {	 
                 if((j == (int) s.charAt(i))|| (j+32 ==(int) s.charAt(i)) )
                     {     
              		b=true;	        	
                 }    
             }
             
             }
    		if(b==true)
    			{h=h+j;
    			b=false;
    			}
    		
    		else
    		return 0;
    		
    		
         j++;
  
        }
    	return h;
        
    }
}
