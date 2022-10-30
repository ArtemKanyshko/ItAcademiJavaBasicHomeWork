package HomeWork6.BankCard;

abstract public class BankCard{
    private String numberCard;
    private String validity;
    private String holderName;

    public BankCard(String numberCard, String validity, String holderName) {
        this.numberCard = numberCard;
        this.validity = validity;
        this.holderName = holderName;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public String getValidity() {
        return validity;
    }

    public String getHolderName() {
        return holderName;
    }
    public void showDateCard () {
        System.out.println();
        System.out.println("Номер карты: " + numberCard);
        System.out.println("Сродк действия: " + validity);
        System.out.println("Имя держателя: " + holderName);
        System.out.println();
    }
}
