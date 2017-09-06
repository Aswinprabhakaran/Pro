package summa;
import java.util.*;
public class summa {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter");
	int size=sc.nextInt();
	int mat[][]=new int[size][size];
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat.length; j++) {
			mat[i][j]=sc.nextInt();
		}
	}
	TreeSet<Integer> t=new TreeSet<Integer>();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if(i<size-1&&j<size-1){
				if(mat[i][j] == 1 && mat[i][j+1] == 1 && mat[i+1][j] == 1 && mat[i+1][j+1] == 1 ){
					t.add((i*10)+j);
					t.add((i*10)+(j+1));
					t.add(((i+1)*10)+j);
					t.add(((i+1)*10)+(j+1));
				}
			}
		}
			}
		System.out.println(t);
}
}
