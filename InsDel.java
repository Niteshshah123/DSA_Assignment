package DSA_Assignment;

import java.util.Scanner;

public class InsDel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr = new int[0];
        do {
            System.out.println("Enter 1 for Create:");
            System.out.println("Enter 2 for insert:");
            System.out.println("Enter 3 for delete:");
            System.out.println("Enter 4 for search:");
            System.out.println("Enter 5 for display:");
            System.out.println("Enter 6 for exit:");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the length of the array:");
                    int len = sc.nextInt();
                    arr = createArray(len);
                    System.out.println("You have successfully created the Array");
                    break;
                case 2:
                    System.out.println("Enter the index no.");
                    int ind = sc.nextInt();
                    if (ind<arr.length) {
                        System.out.println("Enter the key: ");
                        int key = sc.nextInt();
                        arr = insertelement(arr, ind, key);
                        System.out.println("You have inserted the element successfully");   
                    } else {
                       System.out.println("Invalid Index."); 
                    }
                    break;
                case 3:
                    System.out.println("Enter the index: ");
                    ind = sc.nextInt();
                    if (ind<arr.length) {
                        arr = deleteElement(arr, ind);                        
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    System.out.println("Enter the element to search: ");
                    int ele = sc.nextInt();
                    search(arr, ele);
                    break;
                case 5:
                    System.out.println("Displaying the Element: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println("You are exiting");
                    n=6;
                    break;
            
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        } while (n<6);
    }
    public static int[] createArray(int len){
        Scanner sc = new Scanner(System.in);
        int[] res = new int[len];
        for (int i = 0; i < res.length; i++) {
            System.out.println("Enter the "+(i+1)+" value: ");
            res[i]= sc.nextInt();
        }
        return res;
    }
    public static int[] insertelement(int[] arr, int index, int key){
        int[] res = new int[arr.length+1];
        for (int i = 0; i < res.length; i++) {
            if (i<index) {
                res[i] = arr[i];
            }
            else if (i==index) {
                res[i] = key;
            }
            else{
                res[i] = arr[i-1];
            }
        }
        return res;
    }
    public static int[] deleteElement(int[] arr, int index){
        int[] res = new int[arr.length-1];
        for (int i =0; i < res.length; i++) {
            if (i<index) {
                res[i] = arr[i];
            }
            else if (i>=index) {
                res[i] = arr[i+1];
            }
        }
        return res;
    }
    public static void search(int[] arr,int ele){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== ele) {
                System.out.println("Element is present at index: "+i);
                break;
            }
            else{
                System.out.println("Element is not present in the given array.");
            }
        }
    }
}
