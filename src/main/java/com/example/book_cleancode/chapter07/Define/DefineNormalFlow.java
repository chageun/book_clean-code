package com.example.book_cleancode.chapter07.Define;

import com.example.book_cleancode.chapter03.SwitchInAbstractFactory.Employee;
import com.example.book_cleancode.chapter07.MealExpenses;

public class DefineNormalFlow {
    Employee employee;
    int m_total;
    ExpenseReportDAO expenseReportDAO;
    public void 정상흐름정의함(){
        MealExpenses expenses = expenseReportDAO.getMeals(employee.getID());
        m_total += expenses.getTotal();
    }
}
