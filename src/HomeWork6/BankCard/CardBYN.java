package HomeWork6.BankCard;

abstract public class CardBYN extends BankCard {
    private long amountMoneyUSD;

    public CardBYN(String numberCard, String validity, String holderName) {
        super(numberCard, validity, holderName);
    }

    public long getAmountMoneyUSD() {
        return amountMoneyUSD;
    }
    protected void setAmountMoneyUSD(long amountMoneyUSD) {
        this.amountMoneyUSD = amountMoneyUSD;
    }
    public void withdrawMoney(long withdraw) {
        amountMoneyUSD = amountMoneyUSD - withdraw;
    }
    public void depositMoney(long deposit) {
        amountMoneyUSD = amountMoneyUSD + deposit;
    }

}
