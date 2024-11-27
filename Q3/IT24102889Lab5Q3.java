import java.util.Scanner;
public class IT24102889Lab5Q3 {
public static void main(String[] args) {

      Scanner discount = new Scanner( System.in);
while (true) {

  System.out.print("Enter Start Date (1-31):");
int entrydate = discount.nextInt();
if (entrydate > 31) {System.out.println("Error: Days must be between 1 and 31.");
System.exit(0);}
if (entrydate <= 0) {System.out.println("Error: Days must be between 1 and 31.");
System.exit(0);} 

 System.out.print("Enter End date (1-31):");
int enddate = discount.nextInt();
if (enddate > 31) {System.out.println("Error: Days must be between 1 and 31.");
System.exit(0);}
if (enddate <= 0) {System.out.println("Error: Days must be between 1 and 31.");
System.exit(0);}

if (entrydate > enddate) {System.out.print("Error: Start Date must be less than End Date.");
System.exit(0);} 
 System.out.println(" ");

Double roomcharge = 48000.0 ;
System.out.println("Room Charge Per Day: Rs. " +roomcharge);

int reserveddays = (enddate - entrydate);
 System.out.println("Number of Days Reserved:" +reserveddays);

double NoDiscount = 1.0;
double Discount1 = 1.1;
double Discount2 = 1.2; 
double discount0 = (reserveddays < 3) ? NoDiscount :
                  (reserveddays >= 5) ? Discount2  :
                                        Discount1 ;

 
Double totalamount = (roomcharge * reserveddays) * (discount0) ;
 System.out.println("Total Amount to be Paid: " +totalamount);
System.out.println(" ");






}}}


