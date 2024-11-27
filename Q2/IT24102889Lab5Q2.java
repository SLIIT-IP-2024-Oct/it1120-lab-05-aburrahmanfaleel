import java.util.Scanner;
public class IT24102889Lab5Q2 {
public static void main(String[] args){

Scanner prize = new Scanner(System.in);

while (true) {
 System.out.print("Enter the number of new members introduced:");
int members = prize.nextInt();

String.format("No Prize, Pen, Umbrella, Bag, Travelling Chair, Headphone") ;
String result = (members == 0) ? "No Prize" :
                (members == 1) ? "Pen"  :
                (members == 2) ? "Umbrella"  :
                (members == 3) ? "Bag"  :
                (members == 4) ? "Travelling Chair"  :
                (members >= 5) ? "Headphone"  :
                                 "Input must be a number 0 or greater"  ;
System.out.println("Prize is a:" +result);
System.out.println(" ");
}}}