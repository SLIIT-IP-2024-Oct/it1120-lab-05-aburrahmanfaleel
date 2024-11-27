import java.util.Scanner;
public class IT24102889Lab5Q1{
public static void main(String[] args){

Scanner num = new Scanner(System.in);

while (true){
System.out.print("Enter the first integer:");
int numberone = num.nextInt();

System.out.print("Enter the second integer:");
int numbertwo = num.nextInt();

System.out.print("Enter the third integer:");
int numberthree = num.nextInt();

int smallest = numberone;
int largest = numberone;

if (numbertwo < smallest){smallest = numbertwo;}
if (numbertwo > largest){largest = numbertwo;}

if (numberthree < smallest){smallest = numberthree;}
if (numberthree > largest){largest = numberthree;}

System.out.println(" ");
System.out.println("User entered numbers are : "+numberone +" " +numbertwo +" " +numberthree);
System.out.println(" ");
System.out.println("The Smallest number is: "+smallest);
System.out.println("The Largest number is: "+largest);
System.out.println(" ");


}}}