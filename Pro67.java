	package PRO;
	import java.util.*;
	public class Pro67 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the other number of students in class Except Alex");
		int Students=sc.nextInt();
		System.out.println("Enter the Alex's Number of friends in his class");
		int friends=sc.nextInt();
		int FriendsRollno[]=new int[friends];
		for(int i=0;i<friends;i++){
		System.out.println("Enter the alex's Friends Roll number");
		FriendsRollno[i]=sc.nextInt();
		}
		System.out.println("Enter the Students activity");
		int students[]=new int[Students];
		for (int i = 0; i < Students; i++) {
			students[i]=sc.nextInt();
		}
		int count=0;
		for (int i = 0; i < friends; i++) {
			int c=FriendsRollno[i];
			System.out.println("Friends Id ="+FriendsRollno[i] + " Activity is = " +students[c-1]);	
			if(students[c-1]==0){
					System.out.println("yes,ALex can get Notes from his friends");
				count++;
			}
		}
		if(count==0){
			System.out.println("No,Alex can't Get Notes from any of his friends");
		}
		}
		}
