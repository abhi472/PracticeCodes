package hackerank;

import java.util.*;


public class Utopian {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int b [] = new int[t];
        for(int i = 0; i < t; i++){
            b[i] = in.nextInt();
        }
         for(int i = 0; i < t; i++){
           System.out.println( countfunc(b[i])+"");
            
         }   
         in.close();
    }
     public static int countfunc(int a)
             {
    	  int counter = 0;
             int b =1;
             if(a == 0)
                 {
                 return 1;
             }
             else
             for(int i=0;i<a;i++)
                 {
                 if(counter == 0)
                     {
                     b*=2;
                     counter = 1;
                 }
                 else
                     if(counter == 1)
                     {
                     b+=1;
                     counter = 0;
                 }
                     
             }
             return b;
         }
}