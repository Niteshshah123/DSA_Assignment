package DSA_Assignment;
public class linkedlist {
    private static node head;

    private static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next =null;
        }
    }

    public void add(int data){
        node temp = new node(data);
        if (head==null) {
            head=temp;
        }
        else{
            node current = head;
            while (current.next!=null) {
                current=current.next;
            }
            current.next = temp;
        }
    }

    public int remove(){
        node previous =null;
        int result=0;
        node current = head;
        if (head==null) {
            System.out.println("Stack is Empty. Cannot remove the element ):");
        }
        else if (current.next == null) {
            result = current.data;
            head = null;
            return result;
        }
        else{
        while (current.next!=null) {
            previous=current;
            current = current.next;
        }
        result = previous.data;
        previous.next = null;
    }
        return result;
    }

    public void display(){
        if (head==null) {
            System.out.println();
        } else {
            node current = head;
            while (current!=null) {
            System.out.print(current.data+"-->");
            current= current.next;
        }
        System.out.println("null");
        }
    }
    public static void main(String[] args) {
        linkedlist ls = new linkedlist();
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(45);
        ls.add(34);
        ls.add(82);
        ls.display();
        ls.remove();
        ls.display();
    }

}
