package DSA_Assignment;
import java.util.Scanner;

public class stack {
    static int top = -1;
    static int[] arr;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter 1 to Create Stack:");
            System.out.println("Enter 2 to Push:");
            System.out.println("Enter 3 to Pop:");
            System.out.println("Enter 4 to Peek:");
            System.out.println("Enter 5 to Check if Empty:");
            System.out.println("Enter 6 to Check if Full:");
            System.out.println("Enter 7 to Display Stack:");
            System.out.println("Enter 8 to Exit:");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the size of the stack:");
                    int len = sc.nextInt();
                    createStack(len);
                    break;
                case 2:
                    System.out.println("Enter the key to push:");
                    int key = sc.nextInt();
                    push(key);
                    break;
                case 3:
                    if (isEmpty()) {
                        System.out.println("Stack is empty. Cannot pop.");
                    } else {
                        pop();
                    }
                    break;
                case 4:
                    if (!isEmpty()) {
                        System.out.println("Top element: " + peek());
                    } else {
                        System.out.println("Stack is empty. Peek cannot be performed.");
                    }
                    break;
                case 5:
                    System.out.println(isEmpty());
                    break;
                case 6:
                    System.out.println(isFull());
                    break;
                case 7:
                    display();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (n != 8);
        sc.close();
    }
    
    public static void createStack(int len) {
        arr = new int[len];
        top = -1;
    }
    
    public static void push(int key) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
        } else {
            arr[++top] = key;
            System.out.println("Key pushed successfully.");
        }
    }
    
    public static void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            System.out.println("Element popped: " + arr[top--]);
        }
    }
    
    public static int peek() {
        return arr[top];
    }
    
    public static void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    
    public static boolean isEmpty() {
        return top == -1;
    }
    
    public static boolean isFull() {
        return top == arr.length - 1;
    }
}
