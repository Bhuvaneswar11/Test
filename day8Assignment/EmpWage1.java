package day8Assignment;

public class EmpWage1 {
    static final int FullTime=1;
    static final int PartTime=2;
    public static void main(String[] args) {

        int empwage = 20;
        int emphours = 0;
        int totalper_month = 0;
        System.out.println(" welcome to employee wage problem");

        double Emp1 = 0;
        for (int day = 0; day <= 20; day++) {
            Emp1 = Math.floor(Math.random() * 10) %3;
            System.out.println("Attendance is" + Emp1);

            switch ((int)Emp1){
                case  FullTime:
                    System.out.println("full time employee");
                    emphours=8;
                    break;
                case  PartTime:
                    System.out.println("part time employee");
                    emphours=4;
                    break;
                default:

            }


            Emp1 = empwage * emphours;
            System.out.println("total per day:" + Emp1);
            totalper_month+=Emp1;



        }
        System.out.println("total emp wage per month"+totalper_month);



    }
}
