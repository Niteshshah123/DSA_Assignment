package DSA_Assignment;

public class doublyLinkedList {
    private node head;
    private node tail;
    private int length = 0;

    private static class node{
        int data;
        node next;
        node previous;

        node(int data){
            this.data = data;
            this.next =null;
            this.previous =null;
        }
    }

    private node push(int data){
        node temp = new node(data);
        if (head == null) {
            tail = temp;
            head = temp;
            length=1;
            return head;
        }
        else{
            node current = head;
            while (current.next!=null) {
                current = current.next;
            }
            current.next = temp;
            temp.previous=current;
            tail = temp;
            length++;
        }
        return head;
    }

    private int pop(){
        int rest;
        if (head==null) {
            System.out.println("Empty List. Cannot pop the Element ): ");
        }
        else if(head.next==null){
            rest = head.data;
            head=null;
            length=0;
            return rest;
        }
         else {
            rest = tail.data;
            node prev = tail.previous;
            tail.previous = null;
            prev.next=null;
            tail = prev;
            length--;
            return rest;
        }
        return -1;
    }

    private node insert(int index, int data){
        node temp =new node(data);
        if (index<length) {
            node current = head;
            for (int i = 0; i < index-1; i++) {
                current = current.next;
            }
            node temporary = current.next;
            current.next = temp;
            temp.previous=current;
            temp.next=temporary;
            length++;
        }
        else if(index==length){
            tail.next=temp;
            temp.previous=tail;
            tail = temp;
        }
        else{
            System.out.println("Length of List is Smaller than Index ):");
        }

        return head;
    }

    private int delete(int index){
        int rest=0;
        if (index<length) {
            if (index==0) {
                head= head.next;
                head.previous=null;
                length--;
            }
            else if(index==length-1){
                rest = tail.data;
                node temp= tail;
                tail = tail.previous;
                temp.previous=null;
                tail.next=null;
                length --;
                return rest;
            } 
            else {
                node current = head;
                for (int i = 0; i < index; i++) {
                    current= current.next;
                }
                rest = current.data;
                current.previous.next=current.next;
                current.next.previous=current.previous;
                current.next=null;
                current.previous=null;
                length--;
            }
        } else {
            System.out.println("Index is Greater than Length of List ):");
        }
        return rest;
    }

    private void display(){
        node current = head;
        while (current!=null) {
            System.out.print(current.data+"--> ");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        doublyLinkedList dl = new doublyLinkedList();
        dl.push(10);
        dl.push(20);
        dl.push(30);
        dl.push(40);
        dl.push(50);
        dl.push(60);
        dl.push(80);
        dl.push(90);
        dl.push(110);
        dl.pop();
        dl.insert(6, 70);
        dl.insert(4, 100);
        dl.delete(6);
        dl.delete(3);
        dl.display();
    }
}
