/* A program to generate Random Numbers */


public class randomNumber  
{  
public static void main( String args[] )   
{  
int min = 100;  
int max = 600;  
//Generate random double value from minmum to maximum   
System.out.println("Random value of type double between "+min+" to "+max+ ":");  
double a = Math.random()*(max-min+1)+min;   
System.out.println(a);  
//Generate random int value from minmum  to maximum   
System.out.println("Random value of type int between "+min+" to "+max+ ":");  
int b = (int)(Math.random()*(max-min+1)+min);  
System.out.println(b);  
}  
}  