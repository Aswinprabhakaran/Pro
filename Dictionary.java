package zoomrx;
import java.util.*;
public class Dictionary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String ar[] =str.split(" ");
	TreeSet <String> t=new TreeSet<String>();
	for(int i=0;i<ar.length;i++) {
		if(ar[i].equals("Eof")) {
			break;
		}
		else 	
		{
			t.add(ar[i].toLowerCase());
					}
				}
			for(String a:t) {
				System.out.println(a);
			}
				
							}
					}