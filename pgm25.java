import java.util.*;
public class pgm25{
	public static void main(String args[]){
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of words:");
		int num = sc.nextInt();
		String [] word = new String[num];
		sc.nextLine();
		for(i=0;i<num;i++) {
			System.out.println("Enter the words");
			word[i] =sc.nextLine();
		}
		
		for(i=0;i<num;i++) {
			for(j=i+1;j<num;j++) {
				if(word[i].compareTo(word[j])>0) {
					String temp = word[i];
					word[i]= word[j];
					word[j] = temp;
				}
			}
		}
		System.out.println("Sorted String: "+ Arrays.toString(word)); }
}
