import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();
        System.out.println("Enter the number of elements in the list:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            System.out.println("Enter element " + (i+1) + ":");
            a[i] = sc.nextInt();
        }

        System.out.println("Array of element to be reversed is: ");
        for(int i=0; i<n; i++) {
            System.out.println("|  " + a[i] + "  |");
        }

        for(int i=0; i<n; i++) {
            s.push(a[i]);
        }

        System.out.println("Reversed array list is: ");
        for(int i=0; i<n; i++) {
            a[i] = s.pop();
            System.out.println("|  " + a[i] + "  |");
        }
    }
}

// Divitas-MacBook-Air:java divita$ javac reverse.java
// Divitas-MacBook-Air:java divita$ java reverse
// Enter the number of elements in the list:
// 5
// Enter element 1:
// 1
// Enter element 2:
// 2
// Enter element 3:
// 3
// Enter element 4:
// 4
// Enter element 5:
// 5
// Array of element to be reversed is: 
// |  1  |
// |  2  |
// |  3  |
// |  4  |
// |  5  |
// Reversed array list is: 
// |  5  |
// |  4  |
// |  3  |
// |  2  |
// |  1  |
// Divitas-MacBook-Air:java divita$ 