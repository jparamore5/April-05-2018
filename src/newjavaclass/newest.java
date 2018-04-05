package newjavaclass;
import java.util.Scanner;

public class newest {
public static void main(String[]args) {
Scanner scan = new Scanner(System.in);
System.out.print("Write numbers for array");

double num = 0;
int [] scoolio = new int[4];
for (int i = 0; i<4; i++) {
	scoolio [i]= scan.nextInt();
	num = scoolio [i] + num;

}
double ave = num / scoolio.length; 

System.out.println(ave);

}

}
