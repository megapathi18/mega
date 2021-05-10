package maze;
import java .util.LinkedList;
public class cheese {
	  static int mze[][]= {
			  {2,0,0,1},
			  {1,1,1,1},
			  {1,1,0,1}};
	   static LinkedList<position>list= new LinkedList <position>();
	
 public static void main(String[] args) {
  
		  position p=new position(0,3);
             list.push(p); 
             
     while(true)
          {
    	      int y=list.peek().y;
              int x= list.peek().x;
               mze[y][x]=0;  	 
               System.out.println( y +" "+x); 
        	if(ischeck(y+1,x))
        	 {
	            if(mze[y+1][x]==2)
	              {
	        	    System.out.println(" you won!!");
	        	    return ;
	              }
	         else if(mze[y+1][x]==1)
	           {
	        	     System.out.println(" move down!!");
	        		  list.push(new position (y+1,x));
	        		  continue;
	            }
             }
        	 
          if(ischeck(y,x-1))
       	   {
	         if(mze[y][x-1]==2)
	          {
	        	  System.out.println(" you won!!");
	        	  return ;
	          }
	         else if(mze[y][x-1]==1)
	           {
	        	     System.out.println(" move left!!");
	        		  list.push(new position (y,x-1));
	        		  continue;
	            }
            }
        if(ischeck(y-1,x))
   	    {
          if(mze[y-1][x]==2)
           {
       	     System.out.println(" you won!!");
       	      return ;
            }
        else if(mze[y-1][x]==1)
          {
       	     System.out.println(" move up!!");
       		  list.push(new position (y-1,x));
       		  continue;
           }
        }
        
        if(ischeck(y,x+1))
   	     {
           if(mze[y][x+1]==2)
             {
       	       System.out.println(" you won!!");
       	        return ;
         }
        else if(mze[y][x+1]==1)
          {
       	     System.out.println(" move right!!");
       		  list.push(new position (y,x+1));
       		  continue;
           }
        }
        	
                 
	         
	              list.pop();
	               if(list.size()<=0)
	               {
	            	   System.out.println(" no path!!");
	            	   return ;
	               }
	
           }
             
	}
	  
	public static boolean ischeck(int a,int b)
	    {
		  if(a<0  || a>=mze.length  ||  b<0 || b>=mze[a].length)
		         {
			        return false; 
		         }
		   return true;
		  
	  }

}
