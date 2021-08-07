import java.util.*;

public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        int n = str.length();
        System.out.println("All possible permutations are:");
        permute(str, 0, n-1);
    }

    private static void permute(String str, int l, int h) {
        if(l==h) {
            System.out.println(str);
        }
        else {
            for(int i=l; i<=h; i++) {
                str = swap(str, l,i);
                permute(str, l+1, h);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String str, int l, int i) {
        char temp;
        char[] a = str.toCharArray();
        temp = a[l];
        a[l] = a[i];
        a[i] = temp;
        return String.valueOf(a);
    }
}
/*
Divitas-MacBook-Air:java divita$ javac permutation.java
Divitas-MacBook-Air:java divita$ java permutation
Enter the string
ABC
All possible permutations are:
ABC
ACB
BAC
BCA
CBA
CAB
Divitas-MacBook-Air:java divita$ java permutation
Enter the string
ABCD
All possible permutations are:
ABCD
ABDC
ACBD
ACDB
ADCB
ADBC
BACD
BADC
BCAD
BCDA
BDCA
BDAC
CBAD
CBDA
CABD
CADB
CDAB
CDBA
DBCA
DBAC
DCBA
DCAB
DACB
DABC
Divitas-MacBook-Air:java divita$ 
*/