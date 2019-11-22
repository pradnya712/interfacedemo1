package simple;
import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Calculation
{
    void calculate(); 

}
class  multiplication implements Calculation
{
     
    public void calculate()
     {
      int c; 
      try {
     
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of a=");
        String s1=br.readLine();
        int a=Integer.parseInt(s1);
        System.out.println("Enter the value of b=");
        String s2=br.readLine();
        int b=Integer.parseInt(s2);
         c=a*b;
         System.out.println(c);
     
 } 
 catch (Exception e)
    {
 
     System.out.println(e);
    }
 }
 }
 class division implements Calculation
   {
     public void calculate()
     {
         int c;
         try{
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Entry the value of a=");
             String s1=br.readLine();
             int a=Integer.parseInt(s1);
             System.out.println("Entry the value of b=");
             String s2=br.readLine();
             int b=Integer.parseInt(s2);
             c=a/b;
             System.out.println(c);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
   }
public class ResultAB {

	public static void main(String[] args) {
		 
	           Calculation cal=new multiplication();
	           cal.calculate();
	           Calculation cals=new division();
	           cals.calculate();
	       	}

}
