package HomeWork4;

import java.util.Scanner;
        /* Создать класс описывающие Банкомат. Набор купюр, находящихся в банкомате,
        должен задаваться тремя свойствами: количеством купюр номиналом 20, 50, 100.
        Сделать методы для добавления денег в банкомат. Сделать метод, снимающий
        деньги. С клавиатуры передается сумма денег. На экран – булевское значение
        (операция удалась или нет). При снятии денег метод должен выводить на экран
        каким количеством купюр и какого номинала выдается сумма. Создать конструктор с
        тремя параметрами – количеством купюр. Прочее – на ваше усмотрение.
        */
public class ATM {
        // задаем свойства объекта
    private int denominationTwenty;
    private int denominationFifty;
    private int denominationHundred;

        // конструктор с тремя параметрами
        // получил липо положительное чило либо 0
    public ATM (int denominationTwenty, int denominationFifty, int denominationHundred) {
        this.denominationTwenty = Math.max(denominationTwenty, 0);
        this.denominationFifty = Math.max(denominationFifty, 0);
        this.denominationHundred = Math.max(denominationHundred, 0);
    }
        // метод добавлчющий банкноты в банкомат, выполнен через скан
        // добавить можно либо 0 банкнот (т.е. недовить ничего), либо больше 0
    public void addDenomination() {
        Scanner addDenomination = new Scanner(System.in);
        System.out.println("Добавьте купюры в банкомат номиналом 20, 50, 100");
        System.out.println("Введите положительное число, или ваше число не будет засчитано!");
        System.out.print("Введите количество купюр номиналом 20: ");
        denominationTwenty += Math.max(addDenomination.nextInt(), 0);
        System.out.print("Введите количество купюр номиналом 50: ");
        denominationFifty += Math.max(addDenomination.nextInt(), 0);
        System.out.print("Введите количество купюр номиналом 100: ");
        denominationHundred += Math.max(addDenomination.nextInt(), 0);
    }
        // метод снимающи деньги с банкомата
        // работает через скан, приинемает на вход число больше 0
        // если меньше, цикл будет повторятся, пока введете 0 и больше
        // если 0 неснимет ничего
    public void withdrawMoney () {
        Scanner withdrawMoney = new Scanner(System.in);
        int money;
        do {
            System.out.print("Введите необходимое количество денег: ");
            money = withdrawMoney.nextInt();
        }
        while (money < 0);
        if (money == 0) {
            System.out.println(false);
            System.out.println("Спасибо, что воспользовались нашим банком");
        }
        else {
            if (money > amountOfMoney()) {
                System.out.println(false);
                System.out.println("В банкомате не достаточно средств.\nСпасибо, что воспользовались нашим банком");
            }
            else if (money % 10 == 0 && money != 10 && money != 30) {
                withdrawMoneyMain(money);
            }
            else {
                System.out.println(false);
                System.out.println("Невозможно выполнить операцию.\nСпасибо, что воспользовались нашим банком");
            }
            }
    }
        // метод для успешного снятия денег
        // если пришло положительное число и оно кратно 10, но не 10 и не 30, запускается метод
    private void withdrawMoneyMain(int money) {
        int denominationTwenty = this.denominationTwenty;
        int denominationFifty = this.denominationFifty;
        int denominationHundred = this.denominationHundred;
            int hundred = money - money % 100; // берет числа кратные 100
        // запускает цикл выдачи купюры по 100, работает до тех пор, пока купюры 100 не закончатся,
        // либо не закончится запрашиваемая сумма для этих купюр
        while (hundred > 0 && denominationHundred > 0) {
                if (hundred == 100 && (money - 10) % 20 == 0 && (money - 20) % 50 != 0 && (money % 50) % 20 != 0) {
                    break;
                }
                denominationHundred--;
                hundred -= 100; // уменьшается запрашиваемая сумма для данных купюр
                money -= 100;  // уменьшается запрашиваемая сумма
            }
        int fifty = 0;
        // для купюр 50 ставим условие, остаток должен быть кратным 20 или разница между запрашиваемой суммой и
        // количеством купюр 50 болжна быть кратна 20
        // если условие выполнено, то устанавливаем число кратное 50, и прогоняем по циклу
            if ((money % 50) % 20 == 0 && denominationFifty >= 1) {
                fifty = money - money % 50;
            }
            else if (((money - 50 - 10) % 20 == 0 || (money - 50) % 20 == 0) && denominationFifty >= 1) {
                fifty = money - (money % 50) - 50;
            }
            while (fifty > 0 && denominationFifty > 0 ) {
                if (denominationFifty == 1 && ((money - denominationFifty) % 20 != 0)) {
                    break;
                }
                denominationFifty--;
                fifty -= 50;
                money -= 50;
            }
            // прогоняем остаток запрашиваемой суммы через купюры по 20
            while (money > 0 && denominationTwenty > 0) {
                denominationTwenty--;
                money -= 20;
            }
            // если купюр хватило печатаем true и выводим на экран какими купюрами выдал банкомат необходимую сумму
        if (money == 0) {
                System.out.println(true);
                if (denominationHundred != this.denominationHundred) {
                    System.out.print("100*" + (this.denominationHundred - denominationHundred) + " ");
                    this.denominationHundred = denominationHundred; // уменьшается кол-во купюр в банкомате
                }
                if (denominationFifty != this.denominationFifty) {
                    System.out.print("50*" + (this.denominationFifty - denominationFifty) + " ");
                    this.denominationFifty = denominationFifty;
                }
                if (denominationTwenty != this.denominationTwenty) {
                    System.out.print("20*" + (this.denominationTwenty - denominationTwenty));
                    this.denominationTwenty = denominationTwenty;
                }
            System.out.println();
            }
        // если купюр не хватило печатам false и "недостаточно купюр"
            else {
                System.out.println(false);
                System.out.println("В банкомате не достаточно купюр.\nСпасибо, что воспользовались нашим банком");
            }
    }
    // метод ечатает информацию о находящихся банкнотах в банкомате и их сумму
    public void printAmountDenominationAmountOfMoney () {
        System.out.print("В банкомате хранится 100*" + denominationHundred + " 50*" + denominationFifty +
                " 20*" + denominationTwenty + " купюр. ");
        System.out.println("На общую сумму: " + amountOfMoney());
    }
    // метод для получения суммы банкнот, находящихся в банкомате
    private int amountOfMoney() {
        return denominationTwenty * 20 + denominationFifty * 50 + denominationHundred * 100;
    }
}
