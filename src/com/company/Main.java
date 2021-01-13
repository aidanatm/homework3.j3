package com.company;

public class Main {

    public static void main(String[] args)  {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        while (true){
            try {
                System.out.println(bankAccount.getAmount());
                bankAccount.withDraw(6000);

            }
             catch (LimitException ie){
                 System.out.println(ie.getMessage()+ ie.getRemainingAmount());
                 try {
                     if (ie.getRemainingAmount() > 0.0){
                         bankAccount.withDraw((int)ie.getRemainingAmount());
                     }else {
                         break;
                     }

                 } catch (LimitException e) {
                     System.out.println(ie.getMessage()+ ie.getRemainingAmount());
                 }
             }

        }
    }
}
