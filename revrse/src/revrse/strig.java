package revrse;

import java.util.Scanner;

public class strig {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
        String st;
        st=s.nextLine();
         String c[]=st.split(" ");
        
        for(int i=0;i<st.length();i++)
        {
        	 boolean _is=false;
            char ch[]=c[i].toCharArray();
            char  ca[]=c[i].toCharArray();
           int j=ch.length-1;
           int k=0;
          
          while(k<ch.length&& j>=0)
          {
        	  
        	  if(ch[k]!=ca[j])
        	     { 
        		  _is=true;
        	     } 
        	  k++;j--;
          }
          if(c[i].length()==1 ||_is==true)
        	  System.out.print(c[i] +" ");   
       	  
        }
        
	}

}
