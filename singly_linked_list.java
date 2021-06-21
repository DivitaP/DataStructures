import java.util.*;
import java.lang.*;

public class HelloWorld{
    Node head;
    
    class Node {
        int data;
        Node next;
        Node (int d) {
            data = d;
            next = null;
        }
    }
    
    public void insertStart (int data) {
        Node newnode = new Node (data);
        newnode.next = head;
        head = newnode;
    }
    
    public void insertEnd (int data) {
        Node newnode = new Node (data);
        Node p = head;
        while (p.next != null)
            p = p.next;
        p.next = newnode;
    }
    
    public void insertAfter (int data, int aft) {
        Node newnode = new Node (data);
        Node p = head;
        while (p.data != aft && p!=null) {
            p = p.next;
        }
        newnode.next = p.next;
        p.next = newnode;   
    }
    
    public void insertBefore (int data, int bef) {
        Node newnode = new Node (data);
        Node p = head;
        Node prev = null;
        while (p.data != bef && p!=null) {
            prev = p;
            p = p.next;
        }
        newnode.next = prev.next;
        prev.next = newnode;   
    }
    
    public void display() {
        Node p = head;
        for (Node i=p; p!=null; p=p.next) {
            System.out.println(p.data+" ");
        }
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        HelloWorld lis = new HelloWorld();
        int ch;
        int val;
        while (true) {
            if (sc.hasNext()) {
                ch = sc.nextInt();
            inner : switch(ch) {
                case 1 :    val = sc.nextInt();
                            lis.insertStart(val);
                            break inner;
                case 2 :    val = sc.nextInt();
                            lis.insertEnd(val);
                            break inner;
                case 3 :    int aft = sc.nextInt();
                            val = sc.nextInt();
                            lis.insertAfter(val, aft);
                            break inner;
                case 4 :    int bef = sc.nextInt();
                            val = sc.nextInt();
                            lis.insertBefore(val, bef);
                            break inner;
                case 5 :    lis.display();
                            break inner;
            }
            }
        }
    }
}