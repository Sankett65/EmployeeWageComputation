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

    public boolean calculateWage(){

        int totalhours=0;
        int totalWage=0;
        int count =0;
        int count1=0;
        int count2=0;
        int emphr=0;
        int i =1;
        while (totalhours<=hoursPerMonth && i<=days){
            int check = random();
            int wage=0;
            int hour =0;

            switch (check) {
                case 0:
                    System.out.println("Day "+i+" :- Employee is Present");
                    wage = wagePerHour * fullDay;
                    System.out.println("Employee Wage is : " + wage);
                    hour=fullDay;
                    count++;
                    break;
                case 1:
                    System.out.println("Day "+i+" :- Employee is Present for PartTime");
                    wage = wagePerHour * partTime;
                    System.out.println("Employee Wage is : " + wage);
                    hour=partTime;
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
        if (totalhours>100){
            totalhours=100;
            totalWage=100*wagePerHour;
        }
        System.out.println("\nWage of 20 days is: "+totalWage);
        System.out.println("Total time : "+totalhours);

        System.out.println("\nEmployee is present for "+count);
        System.out.println("Employee is Present for Part-Time "+count1);
        System.out.println("Employee is Absent "+count2);
        if (totalhours<100){
            return true;
        }else{
            return false;
        }
    }










//    public static void main(String[] args) {
//        System.out.println("Welcome to the Emplyee Wage Computation");
//        EmployeeWageComputation e = new EmployeeWageComputation();
//        //e.calculateWage();
//
//    }
}
