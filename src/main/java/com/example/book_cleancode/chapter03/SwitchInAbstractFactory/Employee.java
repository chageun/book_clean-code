package com.example.book_cleancode.chapter03.SwitchInAbstractFactory;

public abstract class Employee {
    public abstract boolean isPayday();

    public abstract Money calculatePay();

    public abstract void deliverPay(Money pay);
}
