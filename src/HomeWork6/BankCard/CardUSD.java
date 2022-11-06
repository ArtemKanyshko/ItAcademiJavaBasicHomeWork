package HomeWork6.BankCard;

abstract public class CardUSD extends BankCard {
    private long amountMoneyUSD;

    public CardUSD(String numberCard, String validity, String holderName) {
        super(numberCard, validity, holderName);
    }

    public long getAmountMoneyUSD() {
        return amountMoneyUSD;
    }


    public void withdrawMoney(long withdraw) {
        amountMoneyUSD = amountMoneyUSD - withdraw;
    }
    public void depositMoney(long deposit) {
        amountMoneyUSD = amountMoneyUSD + deposit;
    }
}
