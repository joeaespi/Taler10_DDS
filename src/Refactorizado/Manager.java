/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refactorizado;

import conmalolor.EmployeeType;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author CltControl
 */
public class Manager extends Employee{
    
    public Manager(float salary, float bonusPercentage, EmployeeType employeeType) {
        super(salary, bonusPercentage, employeeType);
    }

    @Override
    public float cs() {
        Date date = new Date();
        //Obtiene la hora local
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //Obtiene el mes en forma de entero
        int month = localDate.getMonthValue();
        
        float valueM = salary + (bonusPercentage * 0.7F);
        
        return month%2==0?valueM:valueM + rmu/12*2;
    }

    @Override
    public float CalculateYearBonus() {
        return salary + salary * 1.0F;
    }
    
    
}
