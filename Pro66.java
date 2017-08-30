package PRO;
import java.util.*;
public class Pro66 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of items they ordered");	
	int number=sc.nextInt();
	int items[]=new int[number];
	System.out.println("enter the cost of the item one by one");
	for (int i = 0; i < number; i++) {
		items[i]=sc.nextInt();
	}
	System.out.println("Enter numbers of items which anna did not eat");
	int not=sc.nextInt();
	int notitems[]=new int[not]; 
	for (int i = 0; i < not; i++) {
		System.out.println("enter the item index not eaten by anna");
		notitems[i]=sc.nextInt();
	}
	System.out.println("Enter the amount charged by Brian to Anna");
	int charged=sc.nextInt();
	int sum=0;
	int sum1=0;
	for (int i = 0; i < number; i++) {
			sum+=items[i];
			}
	for (int i = 0; i < not; i++) {
		int c=notitems[i];
		sum1+=items[c];
	}
	int f=sum-sum1;
	if((f/2)==charged){
		System.out.println("Bon Appetit");
	}
	else{
		System.out.println("Amount to be returned to anna = "+(charged-(f/2)));
	}
	}
	}