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

public abstract class Employee
{   
    protected final float rmu = (float) 386.0;
    //salario del employee
    protected float salary;
    //porcentaje de bonus
    protected float bonusPercentage;    
    //variable de tipo employeeType
    protected EmployeeType employeeType;    

    public Employee(float salary, float bonusPercentage, EmployeeType employeeType)    
    {        
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;        
        this.employeeType = employeeType;    
    }    
    //calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
    public abstract float cs();
    
    //calcula el bonus anual
    public abstract float CalculateYearBonus();
}
