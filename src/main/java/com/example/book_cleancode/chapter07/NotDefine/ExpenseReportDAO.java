package com.example.book_cleancode.chapter07.NotDefine;

import com.example.book_cleancode.chapter07.MealExpenses;
import com.example.book_cleancode.chapter07.MealExpensesNotFound;

public class ExpenseReportDAO {
    MealExpenses meals;
    public MealExpenses getMeals(Long id)throws MealExpensesNotFound {
        return meals;
    }
}
