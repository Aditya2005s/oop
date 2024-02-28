import java.util.Scanner;
class practicalNo_2
{

    public static void main(String[ ] args)

   {
       System.out.println("Enter the number:");
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
     if(r<=0)
     {

         System.out.println("please enter non zero positive number");
    

      }
      else
      {
      
       double perimeter=2*Math.PI*r;
       double area=Math.PI*r*r;
       System.out.println("Perimeter of circle is"+perimeter);
         System.out.println("Area of circle is"+area);


     }
     sc.close();
   }



}