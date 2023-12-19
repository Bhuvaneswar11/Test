package day8Assignment;

public class EmpWage {
    public static void main(String[]args)
    {
        int empHours=8;
        int empWage=20;
        int per_day=0;
        int part_time=4;
        int partTime_perday=0;
        System.out.println("Welcome to Employee wage Problem");

        double Emp=Math.floor(Math.random()*10)%2;
        System.out.println("Attendance is"+Emp);
        if(Emp==1)
        {
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
        per_day=empWage*empHours;
        System.out.println("total per day income :"+per_day);
        partTime_perday=empWage*part_time;
        System.out.println("total wage for part time:"+partTime_perday);
    }
}
