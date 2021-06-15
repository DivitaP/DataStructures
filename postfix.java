import java.util.*;

public class postfix {

    static boolean isoperand(char x) {
        if (x >= '0' && x <= '9')
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postfix expression:");
        String ch = sc.nextLine();
        char[] exp = ch.toCharArray();

        for (int i = 0; i<exp.length; i++) {
            if (isoperand(exp[i]))
                s.push(exp[i] - '0');

            else {
                int n2 = s.pop();
                int n1 = s.pop();
                switch (exp[i]) {
                    case '+':
                        s.push(n1 + n2);
                        break;
                    case '-':
                        s.push(n1 - n2);
                        break;
                    case '*':
                        s.push(n1 * n2);
                        break;
                    case '/':
                        s.push(n1 / n2);
                        break;
                    default:
                        System.out.println("Invalid operator");
                }
            }
        }
        System.out.println("The evaluation of postfix expression is: " + s.pop());
    }
}

// Divitas-MacBook-Air:java divita$ javac postfix.java
// Divitas-MacBook-Air:java divita$ java postfix
// Enter the postfix expression:
// 234+-.....infix=2-(3+4)=-5
// The evaluation of postfix expression is: -5
// Divitas-MacBook-Air:java divita$ java postfix
// Enter the postfix expression:
// 123*4/+5- .........infix= 1+2*3/4-5=-3
// The evaluation of postfix expression is: -3
// Divitas-MacBook-Air:java divita$ 