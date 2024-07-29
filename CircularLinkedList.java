package DSA_Assignment;

public class CircularLinkedList {
    private node head;
    private node last;

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
            head = temp;
            last = head;
        }
        else{
            last.next=temp;
            temp.next = head;
            last=temp;
        }
    }

    public int remove(){
        node previous =null;
        int result=0;
        node current = head;
        if (head==null) {
            System.out.println("Stack is Empty. Cannot remove the element ):");
        }
        else if (current.next == current) {
            result = current.data;
            head = null;
            last=head;
            return result;
        }
        else{
            node lastpointer = last;
        while (lastpointer.next!=last) {
            lastpointer = lastpointer.next;
        }
        result = last.data;
        lastpointer.next = head;
        last=lastpointer;
    }
        return result;
    }

    public void display(){
        if (head==null) {
            System.out.println();
        } else {
            node lastpointer = last;
            while (lastpointer.next!=last) {
            System.out.print(lastpointer.data+"-->");
            lastpointer= lastpointer.next;
        }
        System.out.print(last.data+"-->");
        System.out.println("null");
        System.out.println("Last.Next.data = head.data \nLast.Next.data =="+last.next.data+" And  head.data="+head.data);
        }
    }
    public static void main(String[] args) {
        CircularLinkedList circularls = new CircularLinkedList();
        circularls.add(5);
        circularls.add(6);
        circularls.add(7);
        circularls.add(45);
        circularls.add(34);
        circularls.add(82);
        circularls.display();
        circularls.remove();
        circularls.display();
    }
}
