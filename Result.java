import java.util.Scanner;
class Student{
 int Studid;
 String Name;
 int mark1;
 int mark2;
 Student(int no, String na, int m1, int m2) {
 this.Studid = no;
 this.Name = na;
 this.mark1 = m1;
 this.mark2 = m2;}
}
class Sports extends Student{
String Item;
String Score;
Sports( int no, String na, int m1, int m2,String I, String Sc){
 super(no,na,m1,m2);
 this.Item= I;
this.Score=Sc;
}}
class Result extends Sports{ 
Result( int no, String na, int m1, int m2,String I, String Sc){
super(no,na,m1,m2,I,Sc);}
void display(){
 System.out.println("Student id: "+Studid);
 System.out.println("Name: "+Name);
 System.out.println("Mark1: "+mark1);
 System.out.println("Mark2: "+mark2);
 System.out.println("Sports Item: "+Item);
 System.out.println("Score: "+Score);}
public static void main(String[] args){
 System.out.println("\nEnter the No. of Students");
 Scanner sc1 = new Scanner(System.in);
 int num = sc1.nextInt();
 Result arr[]=new Result[num];
 for(int i =0;i<num;i++){
 Scanner sc =new Scanner(System.in);
 System.out.print("\nEnter Student id: ");
 int Studid=sc.nextInt();
 System.out.print("\nEnter Student Name: ");
 String Name=sc.next();
 System.out.print("\nEnter Mark1: ");
 int mark1=sc.nextInt();
 System.out.print("\nEnter Mark2: ");
 int mark2=sc.nextInt();
 System.out.print("\nEnter Sports Item: ");
 String Item=sc.next();
 System.out.print("\nEnter Score: ");
 String Score=sc.next();
 arr[i]=new Result(Studid,Name,mark1,mark2,Item,Score); }
 System.out.println("\n********Informations of all the Students************");
 for(int i=0;i<num;i++){
 int j=i+1;
 System.out.println("\n"+j+").");
 arr[i].display();}
sc1.close();}
}

