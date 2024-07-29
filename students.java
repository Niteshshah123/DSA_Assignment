package DSA_Assignment;
import java.util.Scanner;
public class students {
  
    static node head;

    private class node{
        public class studentDetail {
            int rollno;
            String name;
            int age; 

            studentDetail(int rollnos, String name, int age){
                this.rollno = rollnos;
                this.name = name;
                this.age = age;
            }
        }
        node next;
        
        studentDetail sd;

        node(int rollnos, String name, int age){
            this.sd= new studentDetail(rollnos, name, age);
        }
        
    }
    public static void main(String[] args) {
        students s = new students();
        Scanner sc = new Scanner(System.in);
        int repeat=0;
        int rollno;
        int age;
        String name;
        int choice;

                System.out.println("Enter the Rollno: ");
                rollno = sc.nextInt();
                System.out.println("Enter the Name: ");
                name = sc.next();
                System.out.println("Enter the Age: ");
                age = sc.nextInt();
                s.add_detail(rollno, name, age);

                
            do {
                System.out.println("enter 1 to add and 0 to delete:");
                choice = sc.nextInt();
            if (choice==1) {
                System.out.println("Enter the Rollno: ");
                rollno = sc.nextInt();
                System.out.println("Enter the Name: ");
                name = sc.next();
                System.out.println("Enter the Age: ");
                age = sc.nextInt();
                s.add_detail(rollno, name, age);
            }
            else if (choice==0) {
                System.out.println("Enter the rollno to delete");
                int rolldel = sc.nextInt();
                s.delete(rolldel);
                System.out.println("Rollno. "+ rolldel+"Deleted successfully");
            }
            else{
                System.out.println("Invalid Choice ):");
            }
            System.out.println("Do you Want to add more Student Details? ");
            System.out.println("Press 1 to continue!!");
            repeat=sc.nextInt();
        } while (repeat==1);
        System.out.println();
        display();
        
    }

    public node add_detail(int rollno, String name, int age){
        node temp = new node(rollno, name, age);
        if (head==null) {
            head= temp;
            return head;
        }
        node current = head;
        while (current.next!=null) {
            current=current.next;
        }
        current.next = temp;
        return head;
    }

    public  node delete( int rollno){
        node current = head;
        node previous=head;
        while (current!=null) {
            if(current.sd.rollno==rollno){
                previous.next = current.next;
            }
            previous = current;
            current= current.next;
        }
        return head;
    }

    public static void display(){
        node current = head;
        while (current!=null) {
            System.out.println("Roll No. :"+ current.sd.rollno);
            System.out.println("Name:- :"+ current.sd.name);
            System.out.println("Age :"+ current.sd.age);
            System.out.println();
            current= current.next;
        }
    }

}
