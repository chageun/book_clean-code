package com.example.book_cleancode.chapter03.SwitchInAbstractFactory;

public class SalariedEmployee extends Employee {
    public SalariedEmployee(EmployeeRecord r) {
        super();
    }

    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deliverPay(Money pay) {

    }
}
