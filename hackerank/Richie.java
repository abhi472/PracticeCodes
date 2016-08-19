package hackerank;

import java.util.*;

public class Richie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();
        if(n==1)
        {
          if(k>=1)	System.out.println("9");
          else      System.out.println(number);
        }
        else
        {
        if(check(number,n))
        {
        	if(k>0)
        		System.out.println(ops(number,n,k));
        	else
        	
        		System.out.println(number);
        	
        }
        else
        System.out.println(val(number,n,k));
       
        }
        
        in.close();
    }
    
    static public boolean check(String number,int j)
    {
    	
        boolean a=true;
    	for(int i=0;i<j/2;i++)
        {
        if(Character.getNumericValue(number.charAt(i)) != Character.getNumericValue(number.charAt(j-1-i)))
        {
          return false;
        }
     
    }
    	   return a;
    }
    static public String ops(String number,int j,int k)
    {
    	String s="",s2="";
    	for(int i=0;i<j/2;i++)
    	{
    		if(k>1)
    		{
    			if(Character.getNumericValue(number.charAt(i))==9)
    			{s+="9";}
    			else
    			{
    				s+="9";
        			k=k-2;

    			}
    		}
    		else
    		{
    			s+=number.charAt(i);
    		}
    	}
    	 for(int i=s.length()-1;i>=0;i--)
         {
         	s2+=s.charAt(i)+"";
         }
         if(!(j%2==0))
         {
        	 if(k>0)
        		 s+="9";
        	 else
         	s+=number.charAt(j/2)+"";
         	
         }
         s=s+s2;
         return s;
    	
    }
   
    static public String val(String number,int j,int k)
        {
        String s="",s3="",s5="";
        for(int i=0;i<j/2;i++)
            {
            if(Character.getNumericValue(number.charAt(i)) == Character.getNumericValue(number.charAt(j-1-i)))
            {
                s+=number.charAt(i)+"";
           
                	
            } 
            else
            {
                if(k>0)
                    {
                    k--;
                 
                    if(Character.getNumericValue(number.charAt(i))>Character.getNumericValue(number.charAt(j-1-i)))
                      s+=number.charAt(i)+"";
                    else
                        s+=number.charAt(j-1-i);
                }
                else
                    {
                    return "-1";
                }
                
            }
                  
        }
        
        
        for(int l=0;l<j/2;l++)
        {
        	if(k>0)
        	{
        	
        		if(Character.getNumericValue(number.charAt(l)) == Character.getNumericValue(number.charAt(j-1-l)))
        		{if(Character.getNumericValue(number.charAt(l)) == 9)
        		{
        			s3+="9";
        			
        		}
        		else
        		{
        			s3+="9";
        			k=k-2;
        		}
        		 
        		}
        		else
        		{
        			if(Character.getNumericValue(number.charAt(l)) == 9||Character.getNumericValue(number.charAt(j-1-l)) == 9)
        		    {s3+="9";}
        			else
        			{s3+="9"; k--;}	
        	       
        		}
        	}
        	else
        		s3+=Character.getNumericValue(s.charAt(l))+"";
        }
        
        
        for(int i=s3.length()-1;i>=0;i--)
        {
        	s5+=s3.charAt(i)+"";
        }
        if(!(j%2==0))
        {
        	if(k>0)
        		s3+="9";
        	else
        	s3+=number.charAt(j/2)+"";
        	
        }
        
        return s3+s5;
        
    }
}
