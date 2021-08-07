import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(a.get(j)>a.get(j+1)) {
                    Collections.swap(a, j, j+1);
                }
            }
        }
        System.out.println("Sorted list is:");
        for(int i=0; i<n; i++) {
            System.out.println(a.get(i));
        }
    }
}
/*
Divitas-MacBook-Air:java divita$ javac bubbleSort.java
Divitas-MacBook-Air:java divita$ java bubbleSort
Enter the no. of elements:
5
100
24
12
643
89
Sorted list is:
12
24
89
100
643
Divitas-MacBook-Air:java divita$ java bubbleSort
Enter the no. of elements:
10
678
123
742
12
1
589
24
48
211
975
Sorted list is:
1
12
24
48
123
211
589
678
742
975
Divitas-MacBook-Air:java divita$ 
*/