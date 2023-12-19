package day8Assignment;

public  class EmpWage2 {
    private static final int TotalWorkDays=20;
     private static final int empOne_dayHours=8;
    private static final int empWage_perHour=20;
    private static final int max_Hours=160;


    public static void computeEmpWage(){

        int totalWorked_hours=0;
        int totalDays_worked=0;
        while(totalWorked_hours<max_Hours && totalDays_worked<TotalWorkDays){


            int dailyWorkHours = Math.min( empOne_dayHours, max_Hours- totalWorked_hours);
            int dailyWages = dailyWorkHours *  empWage_perHour ;

            totalWorked_hours+= dailyWorkHours;
            totalDays_worked++;
            System.out.println("Day " +totalDays_worked+ ": Worked Hours: " + dailyWorkHours + ", Daily Wages: " + dailyWages);
        }

        System.out.println("Total Hours Worked: " + totalWorked_hours);
        System.out.println("Total Days Worked: " +totalDays_worked);
        System.out.println("Total Wages: " + (totalWorked_hours* empWage_perHour));
    }


    public static void main(String[] args) {

        computeEmpWage();


    }
}
