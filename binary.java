import java.util.*;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println("Enter element to be searched:");
        int k = sc.nextInt();
        binarySearch(a, k);
        int result = binaryRecursion(a, 0, a.size()-1, k);
        if(result==-1) 
            System.out.println("Key not found");
        else
            System.out.println("Key is found at "+(result+1) + " position");
    }

    private static int binaryRecursion(List<Integer> a, int l, int h, int k) {
        if(l<=h) {
            int mid = l + (h-l) / 2;

            if(k==a.get(mid)) {
                return mid;
            }
            if(k<a.get(mid)) {
                return binaryRecursion(a, l, mid-1, k);
            }
            return binaryRecursion(a, mid+1, h, k);
        }
        return -1;
    }

    private static void binarySearch(List<Integer> a, int k) {
        int l=0;
        int h=a.size();
        int mid = (l+h)/2;
        while(l<h) {
            if(k<=a.get(mid)) {
                h=mid;
                mid=(l+h)/2;
            }
            else if(k>a.get(mid)) {
                l=mid+1;
                mid=(l+h)/2;
            }
            
        }
        if(k==a.get(mid)) {
            System.out.println("Key is found at "+(mid+1) + " position");
            return;
        }
        else{
            System.out.println("Key not found");
            return;
        }
        
    }
}
/*
Divitas-MacBook-Air:java divita$ javac binary.java
Divitas-MacBook-Air:java divita$ java binary
Enter the no. of elements:
5
1
2
3
4
5
Enter element to be searched:
4
Key is found at 4 position
Key is found at 4 position
Divitas-MacBook-Air:java divita$ java binary
Enter the no. of elements:
5
100
200
500
700
1000000
Enter element to be searched:
8000
Key not found
Key not found
Divitas-MacBook-Air:java divita$ java binary
Enter the no. of elements:
10
1
2
3
4
5
6
7
8
9
10
Enter element to be searched:
3
Key is found at 3 position
Key is found at 3 position
Divitas-MacBook-Air:java divita$ 
*/