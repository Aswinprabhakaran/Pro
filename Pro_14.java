package zoomrx;
import java.util.*;
public class Pro_14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string ");
	String str=sc.nextLine();
	System.out.println("Enter the size of words you wish to enter in the disctionary");
	int dsize=sc.nextInt();
	TreeSet<String> t=new TreeSet<String>(); 
	System.out.println("Enter the word you wish to enter in the disctionary");
	for(int i=0;i<dsize;i++) {
		t.add(sc.next());
	}
	int poscount=0;
	String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++) {
		String summa=arr[i];
		if(t.contains(summa))
		{
			poscount++;
		}
		else {
			Iterator<String> s=t.iterator();
			while(s.hasNext()) {
				int count=0;
				String poda=s.next();
				if(poda.charAt(0)==summa.charAt(0)){
					int l=summa.length();
					int h=poda.length();
					for(int k=0 ; k<l ; k++) {
						for(int y=0;y<h;y++) {
							if(summa.charAt(k)==poda.charAt(y))
							count++;	
						}	
					}
				}
			if(count>=3) {
System.out.println("Sugested word with highest matching for the word "+summa +" is " +poda);
			}
			}
		}
	}
					}
						}