package Day6Assignment;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int input= sc.nextInt();

        if(PerfectNumber(input))
        {
            System.out.println(input+" is a perfect number");
        }
        else{
            System.out.println(input+"is not a perfect number");
        }

    }

    private static boolean PerfectNumber(int input) {
        if(input<=0){
            return false;
        }
        int sum=0;

        for(int i=1;i<=input/2 ;i++)
        {
            if(input%i==0)
            {
                sum+=i;
            }
        }
        return sum==input;
    }
}
