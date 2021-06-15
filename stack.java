import java.util.*;

class stack {
    // static int max = 500;
    int[] a = new int[500];
    int top;

    static void push(stack s, int x) {
        if(s.top == 500-1) 
            System.out.println("Stack overflow");
        else {
            s.top++;
            s.a[s.top] = x;
        }
    }

    static void pop(stack s) {
        if(s.top == -1) 
            System.out.println("Stack underflow");
        else {
            System.out.println("Popped value is: " + s.a[s.top--]);
        }
    }
    
    static void display(stack s) {
        if(s.top == -1) 
            System.out.println("Stack is empty");
        else{
            //System.out.println(s.top);
            for(int i=0; i<=s.top-1; i++) {
                System.out.println("|  " + s.a[i] + "  |");
            }
            System.out.println("|  " + s.a[s.top] + "  |<-top");
        }
    }

    static void peek(stack s) {
        if(s.top == -1) 
            System.out.println("Stack underflow");
        else {
            System.out.println("Value of top stack is: " + s.a[s.top]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        s.top = -1;
        while(true) {
            System.out.println("Please select one:");
            System.out.println("1.PUSH 2.POP 3.DISPLAY 4.PEEK 5.Exit");
            int ch = sc.nextInt();
            switch(ch) {
                case 1:
                    System.out.println("Enter value to be pushed:");
                    int val = sc.nextInt();
                    push(s, val);
                    break;
                case 2:
                    pop(s);
                    break;
                case 3:
                    display(s);
                    break;
                case 4:
                    peek(s);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}