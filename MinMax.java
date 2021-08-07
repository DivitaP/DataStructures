import java.util.*;

public class MinMax {

    private int min, max;

    MinMax() {
        int min, max;
    }
    

    MinMax(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        MinMax result = new MinMax();
        result = calMinMax(a, 0, n-1);
        System.out.println("Min: "+result.min+"\nMax: "+result.max);
    }


    private static MinMax calMinMax(int[] a, int l, int h) {
        MinMax mfinal = new MinMax();
        
        if(l==h) {
            mfinal.min = a[l];
            mfinal.max = a[h];
            return mfinal;
        }
        else if(l+1==h) {
            if(a[l] < a[h]) {
                mfinal.min = a[l];
                mfinal.max = a[h];
            }
            else {
                mfinal.min = a[h];
                mfinal.max = a[l];
            }
            return mfinal;
        }
        else {
            int mid = (l+h)/2;
            MinMax mL = new MinMax();
            MinMax mR = new MinMax();
            mL = calMinMax(a, l, mid);
            mR = calMinMax(a, mid+1, h);
            if(mL.min < mR.min) {
                mfinal.min = mL.min;
            }
            else {
                mfinal.min = mR.min;
            }
            if(mL.max > mR.max) {
                mfinal.max = mL.max;
            }
            else {
                mfinal.max = mR.max;
            }
            return mfinal;
        }
        //return mfinal;
    }
}
/*
Divitas-MacBook-Air:java divita$ javac MinMax.java
Divitas-MacBook-Air:java divita$ java MinMax
Enter the number of elements:
5
1
89
13
168
130
Min: 1
Max: 168
Divitas-MacBook-Air:java divita$ java MinMax
Enter the number of elements:
10
89
134
257
132
6
1
98
245
80000
135
Min: 1
Max: 80000
Divitas-MacBook-Air:java divita$ 
*/