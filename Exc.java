import java.util.Scanner;
public class Exc{
 public static class InvalidUserException extends Exception{
 public InvalidUserException(){
 super("Invalid username / password provided!");
 }}
 public static void main(String[] args){
 String name,pass;
 Scanner sc = new Scanner(System.in);
 String username,password;
 System.out.println("enter the admin username:");
 username=sc.next();
 System.out.println("enter the admin password:");
 password=sc.next();
 System.out.println("enter the username:");
 name=sc.next();
 System.out.println("enter the password;");
 pass=sc.next();
 try{
 if (username.equals(name) && password.equals(pass)){
 System.out.println("Authenticated successfully!");}
 else {
 throw new InvalidUserException();
 } }
 catch (InvalidUserException e) {
 System.out.println(e); } } }
