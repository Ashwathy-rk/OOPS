import java.util.Scanner;
class Employee {
    protected int empId;
    protected String name;
    protected double salary;
    protected String address;
    public Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}
class Teacher extends Employee {
    private String department;
    private String subjectsTaught;
    
    public Teacher(int empId, String name, double salary, String address, String department, String subjectsTaught) {
        super(empId, name, salary, address);
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + subjectsTaught);
        System.out.println("-----------------------");
    }
}
public class teacherdetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of teachers: ");
        int n = scanner.nextInt();
        Teacher[] teachers = new Teacher[n]; 

  for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Teacher " + (i + 1) + ":"); 
            System.out.print("Employee ID: ");
            int empId = scanner.nextInt(); 
            System.out.print("Name: ");
            String name = scanner.next(); 
            System.out.print("Salary: ");
            double salary = scanner.nextDouble(); 
            System.out.print("Address: ");
            String address = scanner.next(); 
            System.out.print("Department: ");
            String department = scanner.next(); 
            System.out.print("Subjects Taught: ");
            String subjectsTaught = scanner.next(); 
            teachers[i] = new Teacher(empId, name, salary, address, department, subjectsTaught);
            System.out.println("-----------------------");
        } 
        System.out.println("Teacher Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Teacher " + (i + 1) + ":");
            teachers[i].display();
        }
        scanner.close();
    }
}

