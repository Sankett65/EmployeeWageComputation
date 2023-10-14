package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {

    static int wagePerHour=20;
    static int fullDay=8;
    static  int partTime=4;
    static final int hoursPerMonth=100;
    static final int days=20;
    public static int random(){
        Random r = new Random();
        int check = r.nextInt(0,3);
        return check;
    }

    public int calculateWage(String CompanyName,int workingHoursperMonth,int workindayspermonth,int fullTimeHours,int partTimeHours,int wagePerHour){
        System.out.println("For Company "+ CompanyName+" wage computation is");
        int totalhours=0;
        int totalWage=0;
        int count =0;
        int count1=0;
        int count2=0;
        int emphr=0;
        int i =1;
        while (totalhours<=workingHoursperMonth && i<=workindayspermonth){
            int check = random();
            int wage=0;
            int hour =0;

            switch (check) {
                case 0:
                    System.out.println("Day "+i+" :- Employee is Present");
                    wage = wagePerHour * fullTimeHours;
                    System.out.println("Employee Wage is : " + wage);
                    hour=fullTimeHours;
                    count++;
                    break;
                case 1:
                    System.out.println("Day "+i+" :- Employee is Present for PartTime");
                    wage = wagePerHour * partTimeHours;
                    System.out.println("Employee Wage is : " + wage);
                    hour=partTimeHours;
                    count1++;
                    break;
                case 2:
                    System.out.println("Day "+i+" :- Employee is Absent");
                    count2++;
                    break;
            }

            i++;
            totalWage = totalWage + wage;
            totalhours= totalhours + hour;
            System.out.println();
        }


        System.out.println("\nWage of "+workindayspermonth+" days is: "+totalWage);
        System.out.println("Total time : "+totalhours);

        if (totalhours > workingHoursperMonth){
            int otHours=totalhours-workingHoursperMonth;
            int finalOtHours=otHours*wagePerHour*10;
            System.out.println("Because Employee is Work for "+otHours+" hours as Over Time so the Wage For Over Time hours is: "+finalOtHours);
            totalWage=totalWage+finalOtHours;
            System.out.println("The Total Wage of employee after Adding Over Time Hours in : "+totalWage);
        }

        System.out.println("\nEmployee is present for "+count);
        System.out.println("Employee is Present for Part-Time "+count1);
        System.out.println("Employee is Absent "+count2);


        return totalWage;
    }

 public  int toComputeWageOfAnEmployee(int fulldays,int part_time,int absent,int wageperhour){
     int totalwage= ((fulldays*fullDay)+(part_time*partTime)+(absent*0))*wageperhour;
     return totalwage;
 }

 public int toComputeHoursOfAnEmployee(int wage){
     return wage/wagePerHour;
 }


//    public static void main(String[] args) {
//        EmployeeWageComputation e = new EmployeeWageComputation();
//        e.calculateWage("Tata",100,19,8,4,20);
//    }

}
