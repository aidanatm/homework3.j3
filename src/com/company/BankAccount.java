package com.company;

public class BankAccount {
    private double amount;

    public double getAmount(){
        return amount;
    }

    public void deposit(double sum){
         amount += sum;
    }

    public void  withDraw(int sum) throws LimitException{
        if (sum > this.amount)
            throw new LimitException("У вас недостаточно средств: ", amount);

         amount-=sum;
    }
}
