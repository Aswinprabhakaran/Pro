package PRO;
import java.util.*;
public class Pro25 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int size=sc.nextInt();
	int integer=(int) Math.pow(2,size);
	String result="";
	HashSet <String> a0=new HashSet<String>();
	HashSet <String> a1=new HashSet<String>();
	HashSet <String> a2=new HashSet<String>();
	HashSet <String> a3=new HashSet<String>();
	HashSet <String> a4=new HashSet<String>();
	for(int i=0;i<integer;i++){
		String summa=Integer.toBinaryString(i);
		int l=summa.length();
		if(l<size){
			String zero="";
			for(int j=0;j<size-l;j++){
				zero+=0;
			}
			result=zero+summa;
		}
		else{
			result=summa;
		}
	int l1=result.length();
	int count=0;
	for (int j = 0; j < l1; j++) {
		int c=Integer.parseInt(String.valueOf(result.charAt(j)));
		if(c==1){
			count++;
		}
		}
		if(count==0){
			a0.add(result);
		}
		else if(count==1){
			a1.add(result);
		}
		else if(count==2){
			a2.add(result);
		}
		else if(count==3){
			a3.add(result);
		}
		else {
			a4.add(result);
		}
				}
	for(String c: a0){
		System.out.println(c);
	}
	for(String c: a1){
		System.out.println(c);
	}
	for(String c: a2){
		System.out.println(c);
	}
	for(String c: a3){
		System.out.println(c);
	}
	for(String c: a4){
		System.out.println(c);
	}
													}
															}