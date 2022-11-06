package HomeWork6.BankCard;

public class IncreasedCashback extends CardBYN {
    private long cashback = 15;

    public IncreasedCashback(String numberCard, String validity, String holderName) {
        super(numberCard, validity, holderName);
    }
    public long cashback (long withdraw){
        return withdraw * (15 / 100);
    }
    public void withdrawMoney(long withdraw) {
        setAmountMoneyUSD(getAmountMoneyUSD() - withdraw + cashback(withdraw));
    }
}
