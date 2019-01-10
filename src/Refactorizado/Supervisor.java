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
 * @author casa
 */
public class Supervisor extends Employee{

    public Supervisor(float salary, float bonusPercentage, EmployeeType employeeType) {
        super(salary, bonusPercentage, employeeType);
    }

    @Override
    public float cs() {
        Date date = new Date();
        //Obtiene la hora local
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //Obtiene el mes en forma de entero
        float valueS = salary + (bonusPercentage * 0.5F);
        //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
        int month = localDate.getMonthValue();
        return month%2==0?valueS:valueS + rmu/12*2;
    }

    @Override
    public float CalculateYearBonus() {
        return salary + salary * 0.7F;
    }
    
}
