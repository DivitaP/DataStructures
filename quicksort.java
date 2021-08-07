import java.util.*;

public class quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        sort(a, 0, a.size()-1);
        System.out.println("Sorted list is:");
        for(int i=0; i<n; i++) {
            System.out.println(a.get(i));
        }
    }

    private static void sort(List<Integer> a, int l, int h) {
        if(l<h) {
            int p = partition(a, l, h);
            sort(a, l, p-1);
            sort(a, p+1, h);
        }
    }

    private static int partition(List<Integer> a, int l, int h) {
        int pivot = a.get(h);
        int i=l-1;
        for(int j=l; j<h; j++) {
            if(a.get(j) < pivot) {
                i++;
                Collections.swap(a, i, j);
            }
        }
        Collections.swap(a, i+1, h);
        return (i+1);
    }

    // public static void swap(List<Integer> a, int i, int h) {
    //     int temp=a.get(i);
    //     a.add(i, a.get(h));
    //     a.add(h, temp);
    // }
}
/*
Divitas-MacBook-Air:java divita$ java quicksort
Enter the no. of elements:
5
12
45
123
90
1
Sorted list is:
1
12
45
90
123
Divitas-MacBook-Air:java divita$ java quicksort
Enter the no. of elements:
10
100
23
1
75
21
96
34
65
97
23
Sorted list is:
1
21
23
23
34
65
75
96
97
100
Divitas-MacBook-Air:java divita$ 
*/