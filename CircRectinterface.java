import java.util.Scanner;
interface Properties{
	void getdata();
	void area();
	void perimeter();
}
class Circle implements Properties{
	double pi=3.14;
	double r;
	Scanner sc=new Scanner(System.in);
    public void getdata(){
		System.out.println("Enter the radius of circle");
		r=sc.nextDouble();
	}
    public void perimeter(){
		System.out.println("Perimeter of circle:"+(2*pi*r));}
    public void area(){
		System.out.println("Aea of circle:"+(pi*r*r));}
}
class Rectangle implements Properties{
	double l,b;
	Scanner sc=new Scanner(System.in);
    public void getdata(){
		System.out.println("Length of rectangle:");
		l=sc.nextDouble();
		System.out.println("Breadth of rectangle:");
		b=sc.nextDouble();
	}
    public void area(){
		System.out.println("Area of rectangle:"+(l*b));}
    public void perimeter(){
		System.out.println("Perimeter of rectangle:"+(2*(l+b)));}
}
public class CircRectinterface{
	public static void main(String[] args){
		int ch;
		Scanner sc=new Scanner(System.in);
	Rectangle obj=new Rectangle();
		do{
			System.out.println("\n1.Circle \n2.Rectangle \n3.Exit");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch){
				case 1: ob.getdata();
				ob.area();
				ob.perimeter();
				break;
				case 2: obj.getdata();
				obj.area();
				obj.perimeter();
				break;
				case 3: System.out.println("Exit...");
				System.exit(0);}
		}while(true);
	}
}
	Rectangle obj=new Rectangle();
		do{
			System.out.println("\n1.Circle \n2.Rectangle \n3.Exit");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch){
				case 1: ob.getdata();
				ob.area();
				ob.perimeter();
				break;
				case 2: obj.getdata();
				obj.area();
				obj.perimeter();
				break;
				case 3: System.out.println("Exit...");
				System.exit(0);}
		}while(true);
	}
}
