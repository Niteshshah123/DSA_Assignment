package DSA_Assignment;

public class queuelinkedlist {
    private static node head;
    private static node tail;

    private static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next =null;
        }
    }

    private void enque(int data){
        node temp = new node(data);
        if (isEmpty()) {
            head=temp;
            tail = head;
        }
        else{
            tail.next=temp;
            tail= tail.next;
        }
    }

    private int denque(){
        int result =0;
        if (isEmpty()) {
            System.out.println("LinkedList Queue is empty ): cannot pop the element.");
        } else {
            result = head.data;
            node temp = head.next;
            head.next=null;
            head=temp;
        }
        return result;
    }
    private void peek(){
        int result =0;
        if (isEmpty()) {
            System.out.println("LinkedList Stack is empty ): peek is not Available.");
        } else {
            result = tail.data;
            System.out.println("Peak Element is: "+result);
        }
    }
    private boolean isEmpty(){
        return head==null;
    }

    private void display(){
        node current = head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current= current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        queuelinkedlist ls = new queuelinkedlist();
        ls.enque(58);
        ls.enque(6);
        ls.enque(8);
        ls.denque();
        ls.peek();
        ls.display();
    }
}
