import java.util.*;

public class parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<Character>();
        System.out.println("Enter the expression:");
        String ch = sc.nextLine();
        char[] exp = ch.toCharArray();
        for (int i = 0; i < exp.length; i++) {
            if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
                s.push(exp[i]);
            else if (!s.isEmpty() && ((exp[i] == '}' && s.peek() == '{') || 
                    (exp[i] == ')' && s.peek() == '(') ||
                    (exp[i] == ']' && s.peek() == '['))) 
                s.pop();
            // else
            //     s.push(exp[i]);
        }
        

        if(s.isEmpty())
            System.out.println("The given expression " + ch + " is balanced.");
        else
            System.out.println("The given expression " + ch + " is not balanced.");
       
    }
}

// Divitas-MacBook-Air:java divita$ javac parenthesis.java
// Divitas-MacBook-Air:java divita$ java parenthesis
// Enter the expression:
// {(2+3)*6}
// The given expression {(2+3)*6} is balanced.
// Divitas-MacBook-Air:java divita$ java parenthesis
// Enter the expression:
// ({[}})
// The given expression ({[}}) is not balanced.
// Divitas-MacBook-Air:java divita$ java parenthesis
// Enter the expression:
// ({[]})
// The given expression ({[]}) is balanced.
// Divitas-MacBook-Air:java divita$ 