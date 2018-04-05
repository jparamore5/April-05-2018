package newjavaclass;

public class aprilfith {
public static void main(String[]args) {
int even = 0;
int odd = 0;
	
int [] numbers = {6,18,21,1,72,133};
for (int i= 0; i<5;i++) {
	if (numbers[i]%2==0) {
	even ++;
	}
	else {
		odd++;
	
}
	
}
System.out.println(even);
System.out.println(odd);
}
}
