package com.example.book_cleancode.chapter07.NotDefine;

import com.example.book_cleancode.chapter03.SwitchInAbstractFactory.Employee;
import com.example.book_cleancode.chapter07.MealExpenses;
import com.example.book_cleancode.chapter07.MealExpensesNotFound;

public class NotDefineNormalFlow {
    Employee employee;
    ExpenseReportDAO expenseReportDAO;
    int m_total;

    public void 정상흐름정의하지않음() {
        try {
            MealExpenses expenses = expenseReportDAO.getMeals(employee.getID());
            m_total += expenses.getTotal();
        } catch (MealExpensesNotFound e) {
            m_total += getMEalPerDiem();
        }
    }

    private int getMEalPerDiem() {
        return 0;
    }
}
