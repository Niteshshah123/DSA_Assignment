package DSA_Assignment;

public class stackLinkedlist {
    private static node head;
    private static node top;

    private static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next =null;
        }
    }

    private void push(int data){
        node temp = new node(data);
        if (isEmpty()) {
            head=temp;
            top = head;
        }
        else{
            temp.next=top;
            top=temp;
        }
    }

    private int pop(){
        int result =0;
        if (isEmpty()) {
            System.out.println("LinkedList Stack is empty ): cannot pop the element.");
        } else {
            node temp = top;
            top = top.next;
            result = temp.data;
        }
        return result;
    }
    private void peek(){
        int result =0;
        if (isEmpty()) {
            System.out.println("LinkedList Stack is empty ): peek is not Available.");
        } else {
            result = top.data;
            System.out.println("Peak Element is: "+result);
        }
    }
    private boolean isEmpty(){
        return top==null;
    }

    private void display(){
        node current = top;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current= current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        stackLinkedlist ls = new stackLinkedlist();
        ls.push(58);
        ls.push(6);
        ls.push(8);
        ls.push(7);
        ls.pop();
        ls.pop();
        ls.display();
        ls.peek();
    }
}
