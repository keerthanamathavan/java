import java.util.*;
import java.lang.*;
import java.io.*;
class large
{
  public static void main(String args[])
  {
     int num[]=new int[]{20,70,10,5,60};
     int largest=num[0];
     for(int i=0;i<num.length;i++)
     {
        if(num[i]>largest)
        largest=num[i];
     }
     System.out.println("Largest Number is : " + largest);
   }
  }
     
