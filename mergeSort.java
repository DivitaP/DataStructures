import java.util.*;

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        sort(a, 0, n-1);
        System.out.println("Sorted list is:");
        for(int i=0; i<n; i++) {
            System.out.println(a.get(i));
        }
    }

    private static void sort(List<Integer> a, int l, int h) {
        if(l<h) {
            int mid = (l+h)/2;

            sort(a, l, mid);
            sort(a, mid+1, h);
            merge(a, l, mid, h);
        }
    }

    static void merge(List<Integer> a, int l, int mid, int h) {
        int n1 = mid-l+1;
        int n2 = h - mid;
        List<Integer> L = new ArrayList<>(n1);
        List<Integer> R = new ArrayList<>(n2);

        for(int i=0; i<n1; i++) {
            L.add(a.get(l+i));
        }
        for(int j=0; j<n2; j++) {
            R.add(a.get(mid+1+j));
        }
        
        int i=0, j=0;
        int k=l;

        while(i<n1 && j<n2) {
            if(L.get(i) <= R.get(j)) {
                a.set(k, L.get(i));
                i++;
               
            }
            else{
                a.set(k, R.get(j));
                j++;
                
            }
            k++;
        }

        while(i<n1) {
            a.set(k, L.get(i));
            i++;
            k++;
        }
        while(j<n2) {
            a.set(k, R.get(j));
            j++;
            k++;
        }

    }
}
/*
Divitas-MacBook-Air:java divita$ javac mergeSort.java
Divitas-MacBook-Air:java divita$ java mergeSort
Enter the no. of elements:
5
1
9
2
7
5
Sorted list is:
1
2
5
7
9
Divitas-MacBook-Air:java divita$ java mergeSort
Enter the no. of elements:
10
837 
2
568
12
353 
231
536
15
85
2
Sorted list is:
2
2
12
15
85
231
353
536
568
837
Divitas-MacBook-Air:java divita$ 
*/