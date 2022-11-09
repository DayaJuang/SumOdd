package org.example;

public class Main {
    public static void main(String[] args) {
        int ans = sumOdd(200,-100);

        System.out.println(ans);
    }

    public static boolean isOdd(int num){
        // Check if the number is valid or not
        if(num <= 0)
            return false;

        return (num % 2 != 0);
    }

    public static int sumOdd(int start, int end){
        // Make sure end is greater than start
        if(start > end || start < 0)
            return -1;

        // Summing the number
        int sum = 0;

        for(int i=start;i<=end;i++){
            if(isOdd(i))
                sum+=i;
        }

        return sum;
    }
}