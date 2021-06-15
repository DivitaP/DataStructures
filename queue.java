import java.util.*;

public class queue {
    static int max = 500;
    int[] a = new int[max];
    int front, rear;

    static void enque(queue q, int x) {
        if(q.rear==max-1)
            System.out.println("Queue overflow");
        else if(q.front==-1 && q.rear==-1) {
            q.rear++;
            q.front++;
            q.a[q.rear] = x;
        }
        else {
            q.rear++;
            q.a[q.rear] = x;
        }
    }

    static void deque(queue q) {
        if(q.rear==-1 && q.front==-1) 
            System.out.println("Queue underflow");
        else if(q.front==q.rear) {
            int x = q.a[q.front];
            System.out.println("Deleted element is: " + x);
            q.front = -1;
            q.rear = -1;
        }
        else {
            int x = q.a[q.front];
            System.out.println("Deleted element is: " + x);
            q.front++;
        }
    }

    static void display(queue q) {
        if(q.rear==-1 && q.front==-1) 
            System.out.println("Queue is empty");
        else {
            
            
            for(int i=q.front; i<=q.rear; i++) {
                System.out.println("--------");
                System.out.println("|  " + q.a[i] + "  |");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue q = new queue();
        q.front = -1;
        q.rear = -1;
        while(true) {
            System.out.println("Please select one:");
            System.out.println("1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit");
            int ch = sc.nextInt();
            switch(ch) {
                case 1:
                    System.out.println("Enter value to be entered:");
                    int val = sc.nextInt();
                    enque(q, val);
                    break;
                case 2:
                    deque(q);
                    break;
                case 3:
                    display(q);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
// Divitas-MacBook-Air:java divita$ javac queue.java
// Divitas-MacBook-Air:java divita$ java queue
// Please select one:
// 1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit
// 1
// Enter value to be entered:
// 10
// Please select one:
// 1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit
// 1
// Enter value to be entered:
// 20
// Please select one:
// 1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit
// 1
// Enter value to be entered:
// 30
// Please select one:
// 1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit
// 1
// Enter value to be entered:
// 40
// Please select one:
// 1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit
// 1
// Enter value to be entered:
// 50
// Please select one:
// 1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit
// 3
// --------
// |  10  |
// --------
// |  20  |
// --------
// |  30  |
// --------
// |  40  |
// --------
// |  50  |
// Please select one:
// 1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit
// 2
// Deleted element is: 10
// Please select one:
// 1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit
// 3
// --------
// |  20  |
// --------
// |  30  |
// --------
// |  40  |
// --------
// |  50  |
// Please select one:
// 1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit
// 1
// Enter value to be entered:
// 60
// Please select one:
// 1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit
// 3
// --------
// |  20  |
// --------
// |  30  |
// --------
// |  40  |
// --------
// |  50  |
// --------
// |  60  |
// Please select one:
// 1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit
// 2
// Deleted element is: 20
// Please select one:
// 1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit
// 1
// Enter value to be entered:
// 10
// Please select one:
// 1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit
// 3
// --------
// |  30  |
// --------
// |  40  |
// --------
// |  50  |
// --------
// |  60  |
// --------
// |  10  |
// Please select one:
// 1.ENQUE 2.DEQUE 3.DISPLAY 4.Exit
// 4
// Divitas-MacBook-Air:java divita$ 