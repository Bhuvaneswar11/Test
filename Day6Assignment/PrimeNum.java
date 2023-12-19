package Day6Assignment;

import java.util.Scanner;

public class PrimeNum{

    static int i=2;
    public static boolean isprime(int num){
        if(num==0||num==1){
            return false;
        }
        if(num==i)
            return true;
        if(num%i==0)
        {
            return false;
        }
        i++;
        return isprime(num);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();
        if(isprime(num)){
            System.out.println("true its prime number");
        }
        else{
            System.out.println("false its not prime number");
        }
    }

}