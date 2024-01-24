package com.teachmeskills.lesson7_hw.CreditCard;


public class CreditCard {
    String bankAccountNumber;
    int amountOnAccount;

    public CreditCard(String bankAccountNumber, int amountOnAccount) {
        this.bankAccountNumber = bankAccountNumber;
        this.amountOnAccount = amountOnAccount;
    }

    public void addMoneyToCard(int sum) {
        this.amountOnAccount += sum;
    }

    public void withdrawMoneyFromCard(int sum) {
        if (this.amountOnAccount - sum < 0) {
            System.out.println("Не достаточно средств!");
            checkCardInformation();
            System.out.println("******");
        } else {
            this.amountOnAccount -= sum;
        }
    }

    public void checkCardInformation() {
        System.out.println("Номер счёта " + this.bankAccountNumber + "," + "Остаток: " + this.amountOnAccount);
    }
}


