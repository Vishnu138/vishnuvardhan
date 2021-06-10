 // Question 1
 public class main {
	public static  void main(string[] args)
	{
		
		class Pattern
		 {
		  public static void main(String args[]) 
		  {
		   //loop for rows
		   for (int i = 1; i <=5; i++) 
		   {
		     //loop for columns
		     for (int j = 1; j <=5; j++) 
		     {
		      if(i>=j)
		      System.out.print("* "); 
		      else
		      System.out.print("  ");//two space
		     }	
		     {
		    	 class Pattern
				 {
				  public static void main(String args[]) 
		     }
		   //loop for rows
		   for (int i = 1; i <=5; i++) 
		   {
		     //loop for columns
		     for (int j = 1; j <=5; j++) 
		     {
		      if(i>=j)
		      System.out.print("* "); 
		      else
		      System.out.print("  ");//two space
		      {
		      class Pattern
		 {
		  public static void main(String args[]) 
		  {
		   //loop for rows
		   for (int i = 1; i <=5; i++) 
		   {
		     //loop for columns
		     for (int j = 1; j <=5; j++) 
		     {
		      if(i>=j)
		      System.out.print("* "); 
		      else
		      System.out.print("  ");//two space
		     }
		      System.out.println("");
		   }
		  }
		 }
		
		
		class Pattern
		 {
		  public static void main(String args[]) 
		  {
		   //loop for rows
		   for (int i = 1; i <=5; i++) 
		   {
		     //loop for columns
		     for (int j = 1; j <=5; j++) 
		     {
		      if(i<=j)
		      System.out.print("* "); 
		      else
		      System.out.print("  ");//two space
		     }
		      System.out.println("");
		   }
		  }
		}
		
		
		class pattern
		{
			public static void main(string args[])
			{
				//loop for rows
				for(int i=1;i<=5;i++)
				{
					if(i<=j)
						system.out.print("*")
						else
						system.out.print("")
				{
					if(i>=j)
					system.out.print("*")
					else
					system.out.print("")
				}	
			
				}
					
				}
		}
		
		
		
		class Pattern
		 {
		  public static void main(String args[]) 
		  {
		   //loop for rows
		   for (int i = 1; i <=5; i++) 
		   {
		     //loop for columns
		     for (int j = 1; j <=5; j++) 
		     {
		      if((i+j)>=6)
		      System.out.print("* "); 
		      else
		    	  System.out.print("  ");//two space
		     }
		      System.out.println("");
		   }
		  }
		}
		 
		class Pattern
		 {
		  public static void main(String args[]) 
		  {
		   //loop for rows
		   for (int i = 1; i <=5; i++) 
		   {
		     //loop for columns
		     for (int j = 1; j <=5; j++) 
		     {
		      if((i+j)>=6)
		      System.out.print("* "); 
		      else
		      System.out.print(" ");//one space
		     }
		      System.out.println("");
		   }
		  }
		}
		

		class Pattern
		 {
		  public static void main(String args[]) 
		  {
		   //loop for rows
		   for (int i = 1; i <=5; i++) 
		   {
		     //loop for columns
			   for (int i = 1; i <=5; i++) 
			   {
			     //loop for columns
			     for (int j = 1; j <=5; j++) 
			     {
			      if(i>=j)
			      System.out.print(j+" "); 
			      else
			      System.out.print("  ");//two space
	
			}
			      System.out.println("");
			   }
			  }
			}
		  
		  
		  class pattern
		  {public static void main(string args[])
			  {
			  //loop for rows
			  for (int i = 1; i <= row; i++)
			  {
				  //loop for columns 
					for (int j = 1; j <= i; j++) {
						count++;
						System.out.print(count);
					}
					System.out.println();
				}
			}

		}
			  
		  }
		     
}
// Question 2
public class PatternStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0,count=1;
		System.out.println("Enter the size of figure");
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int limit=size;
		if(size>0) {
		//upper line
		System.out.print("+");
		for(i=0; i<size; i++)   
		{ 
			System.out.print("--");
		}
		System.out.print("+");
		System.out.println();
		//full body part
		for(i=0;i<(2*size)-1;i++) {
			System.out.print("|");//left frame
			if(i<=limit-2&&i%2==0) {//one line coding for even before half
				for(j=0;j<size-i-1;j++) {
					System.out.print(" ");
				}
				System.out.print("/");
				for(j=0;j<i;j++) {
					System.out.print("==");
				}
				System.out.print("\\");
				for(j=limit-i-1;j>0;j--) {
					System.out.print(" ");
				}
			}
			if(i<=limit-2&&i%2==1) {//one line coding for odd before half
				for(j=0;j<size-i-1;j++) {
					System.out.print(" ");
				}
				System.out.print("/");
				for(j=0;j<i;j++) {
					System.out.print("--");
				}
				System.out.print("\\");
				for(j=limit-i-1;j>0;j--) {
					System.out.print(" ");
				}
			}
			if(i==limit-1&&i%2==0) {//middle line for even
				System.out.print("<");
				for(j=0;j<(size-1)*2;j++) {
					System.out.print("=");
				}
				System.out.print(">");
			}
			if(i==limit-1&&i%2==1) {//middle line for odd
				System.out.print("<");
				for(j=0;j<(size-1)*2;j++) {
					System.out.print("-");
				}
				System.out.print(">");
			}
			if(i>=limit&&i%2==0) {//one line coding for even after half
				for(j=0;j<i-size+1;j++) {
					System.out.print(" ");
				}
				System.out.print("\\");
				for(j=limit-1-count;j>0;j--) {
					System.out.print("==");
				}
				System.out.print("/");
				for(j=i-limit;j>=0;j--) {
					System.out.print(" ");
				}
				count++;
			}
			if(i>=limit&&i%2==1) {//one line coding for odd after half
				for(j=0;j<i-size+1;j++) {
					System.out.print(" ");
				}
				System.out.print("\\");
				for(j=limit-1-count;j>0;j--) {
					System.out.print("--");
				}
				System.out.print("/");
				for(j=i-limit;j>=0;j--) {
					System.out.print(" ");
				}
				count++;
			}
			System.out.print("|");//right frame
			System.out.println();
		}
		//lower line
		System.out.print("+");
		for(i=0; i<size; i++)   
		{ 
			System.out.print("--");
		}
		System.out.println("+");
		}
	}
 }