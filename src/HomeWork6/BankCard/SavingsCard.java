package HomeWork6.BankCard;

public class SavingsCard extends CardUSD {
    private int saving = 3;

    public SavingsCard(String numberCard, String validity, String holderName) {
        super(numberCard, validity, holderName);
    }
    public void addSavings (){
        long add = ((long) ((float)getAmountMoneyUSD() * (saving / 100)) + getAmountMoneyUSD());
        depositMoney(add);
    }
}
