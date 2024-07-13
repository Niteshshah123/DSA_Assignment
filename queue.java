package DSA_Assignment;
import java.util.Scanner;
public class queue {
    static int[] arr;
    static int right;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter 1 to Create Queue:");
            System.out.println("Enter 2 to Push:");
            System.out.println("Enter 3 to Pop:");
            System.out.println("Enter 4 to Peek:");
            System.out.println("Enter 5 to buttom:");
            System.out.println("Enter 6 to Check if Empty:");
            System.out.println("Enter 7 to Check if Full:");
            System.out.println("Enter 8 to Display Queue:");
            System.out.println("Enter 9 to Exit:");
            n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter the length of Queue: ");
                    int len = sc.nextInt();
                    create(len);
                    break;
                case 2:
                    System.out.println("Enter the Key to push");
                    int key = sc.nextInt();
                    push(key);
                    break;
                case 3:
                    pop();
                    break;
                case 4:
                    peek();
                    break;
                case 5:
                    buttom();
                    break;
                case 6:
                    System.out.println(isEmpty());
                    break;
                case 7:
                    System.out.println(isFull());
                    break;
                case 8:
                    display();
                    break;
                case 9:
                    System.out.println("You are exiting the loop.!!");
                    break;
                default:
                    System.out.println("Invalid NUmber!!.");
                    break;
            }
        } while (n<9);
        sc.close();
    }
    public static void create(int len){
        arr = new int[len];
        right=-1;
    }
    public static void push(int key){
        if (isFull()) {
            System.out.println("Queue is full. Cannot Push!!.");
        } else {
            arr[++right]=key;
            System.out.println("Key Pushed successfully.!!");
        }
    }
    public static void pop(){
        if (isEmpty()) {
            System.out.println("Queue is Empty. Cannot Pop the element!!.");
        } else {
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            right--;
            System.out.println("Key Poped successfully.!!");
        }
    }
    public static void display(){
        for (int i = 0; i <= right; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static boolean isEmpty(){
        return right<0;
    }
    public static boolean isFull(){
        return right==arr.length-1;
    }
    public static void peek(){
        System.out.println(arr[right]);
    }
    public static void buttom(){
        System.out.println(arr[0]);
    }
    
}
