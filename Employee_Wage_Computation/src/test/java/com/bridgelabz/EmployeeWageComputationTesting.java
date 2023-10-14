package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeWageComputationTesting {

    EmployeeWageComputation obj = new EmployeeWageComputation();



//    Absent For 10 days and Present For Full  10 Day
    @Test
    public void toCheckEmployeeIsAbsentFor10daysAndFullTimePresentFor10Days(){
        Assertions.assertEquals(1600,obj.toComputeWageOfAnEmployee(10,0,10,20));
    }

//    Present For Part-Time For 10 days and Present For Full 10  Day
    @Test
    public void toCheckEmployeeIsPartTimeFor10daysAndFullTimePresentFor10Days() {
        Assertions.assertEquals(2400, obj.toComputeWageOfAnEmployee(10, 10, 0, 20));
    }

//    Absent For 10 days and Present For Part-Time  10 Day
    @Test
    public void toCheckEmployeeIsAbsentFor10daysAndPartTimePresentFor10Days() {
        Assertions.assertEquals(800, obj.toComputeWageOfAnEmployee(0, 10, 10, 20));
    }

//    Absent for 6 days Present for fullday f0r 7 days and Present Part-Time for 7 days
    @Test
    public void toCheckEmployeeIsAbsentFor6daysAndPartTimePresentFor7DaysAndFullTimeFor7() {
        Assertions.assertEquals(1680, obj.toComputeWageOfAnEmployee(7, 7, 6, 20));
    }

//    To calculate total working hours

    @Test
    public void toCheckTheTotalWorkinhHour() {
        Assertions.assertEquals(100, obj.toComputeHoursOfAnEmployee(2000));
    }


    @Test
    public void toChectTheTotalWageOfEmployeeForDifferentCompany(){
        int res=obj.calculateWage("Tata",100,20,8,4,20);
        Assertions.assertTrue(res>1500 && res<2000);
    }


    }
