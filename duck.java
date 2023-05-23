import java.util.Scanner;
class duck
{
	public static void main(String[] args)
	 {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("enter a num");
	   int num = sc.nextInt();
	   boolean a=false;

	   
	   

	   while(num!=0)
	   {

	    int rem = num%10;
	   
	   if(rem==0)
	    {
	    	a=true;
	    	break;
	   
	    }
	   
	    num=num/10;
	  }	
	  System.out.println(a==true?"it is duck number":"it is not duck number");
	}

}