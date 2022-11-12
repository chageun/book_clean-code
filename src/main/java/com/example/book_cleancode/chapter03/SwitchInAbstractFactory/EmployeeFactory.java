package com.example.book_cleancode.chapter03.SwitchInAbstractFactory;

public interface EmployeeFactory {
    Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}
