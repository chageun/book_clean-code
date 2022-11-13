package com.example.book_cleancode.chapter07.Define;

import com.example.book_cleancode.chapter07.MealExpenses;

public class ExpenseReportDAO {
    MealExpenses meals;
    public MealExpenses getMeals(Long id){
        return meals;//청구한 식비가 없다면, 일일 기본 식비를 반환하도록 코드를 작성한다.
    }
}
