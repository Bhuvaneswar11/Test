package day8Assignment;

public class EmpWage3 {
    public static void main(String[] args) {
        int totalWorkDays = 20;
        int empOneDayHours = 8;
        int empWagePerHour = 20;
        int maxHours = 160;

        int totalWorkedHours = 0;
        int totalDaysWorked = 0;

        while (totalWorkedHours < maxHours && totalDaysWorked < totalWorkDays) {

            int dailyWorkHours = Math.min(empOneDayHours, maxHours - totalWorkedHours);
            int dailyWages = dailyWorkHours * empWagePerHour;

            totalWorkedHours += dailyWorkHours;
            totalDaysWorked++;

            System.out.println("Day " + totalDaysWorked + ": Worked Hours: " + dailyWorkHours + ", Daily Wages:" + dailyWages);
        }


        System.out.println("Total Hours Worked:" + totalWorkedHours);
        System.out.println("Total Days Worked:" + totalDaysWorked);
        System.out.println("Total Wages:" + (totalWorkedHours * empWagePerHour));
    }
}
