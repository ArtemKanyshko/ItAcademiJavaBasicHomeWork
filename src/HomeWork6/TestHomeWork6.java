package HomeWork6;


import HomeWork6.Appliances.Dishwashers;
import HomeWork6.Appliances.WaterHeaters;
import HomeWork6.BankCard.SavingsCard;
import HomeWork6.Company.ChiefAccountant;
import HomeWork6.Company.Director;
import HomeWork6.Company.Engineer;
import HomeWork6.Company.Manager;

public class TestHomeWork6 {
    public static void main(String[] args) {
        /* Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую
        технику. Создать несколько объектов описанных классов, часть из них включить в
        розетку. Иерархия должна иметь хотя бы три уровня.
        */
        System.out.println("Задание 1. Бытовая техника.");
        WaterHeaters waterHeatersBosh = new WaterHeaters("Водонагреватель Bosh"); // создали два водонагревателя
        WaterHeaters waterHeatersLG = new WaterHeaters("Водонагреватель LG");
        waterHeatersLG.plugIn(); // включили
        waterHeatersBosh.plugIn();
        waterHeatersBosh.unplug(); // выключили
        waterHeatersLG.setWaterTemperature(20); // установили температуру воды на 20
        waterHeatersLG.incrementTemperature(); // увеличили темтературу воды
        waterHeatersLG.incrementTemperature();
        waterHeatersBosh.setWaterTemperature(30); // пытаемся установить температуру воды на 30, выдаст сообщение что
        Dishwashers dishwashersSamsung = new Dishwashers("Посудамойка Samsung"); // создали мойку посуды
        dishwashersSamsung.plugIn();
        System.out.println();

        /* Создать цепочку наследования (минимум 3 звена) классов, описывающих
        банковские карточки. Иерархия должна иметь хотя бы три уровня.
        */
        System.out.println("Задание 2. Банковские карты.");
        SavingsCard cardUSD = new SavingsCard("1234 1234 1234 1234", "06/24", "Name Name");
        cardUSD.showDateCard();
        cardUSD.depositMoney(3000);
        System.out.println("Остаток: " + cardUSD.getAmountMoneyUSD());
        System.out.println();

        /* Создать цепочку наследования (минимум 3 звена) классов, описывающих
        должностную структуру на заводе. Реализовать методы по начислению зарплаты в
        зависимости от должности (почасовая, процентная, смешанная). Иерархия должна
        иметь хотя бы три уровня.
        */
        System.out.println("Задание 3. Должностная структура и зарплаты.");
        Director dirIvan = new Director("Ivan");
        ChiefAccountant chiefAccountantGala = new ChiefAccountant("Gala");
        Engineer engineerPetr = new Engineer("Petr");
        Manager managerVolodya = new Manager("Volodya");
        chiefAccountantGala.setHoursPerMonth(162); // 162 часа - это норма за месяц
        engineerPetr.setAmountOfCompletedOrders(20); // количество выполненых заказов
        managerVolodya.setAmountOfCompletedOrders(20);
        managerVolodya.setHoursPerMonth(162);
        dirIvan.wages();
        chiefAccountantGala.wages();
        engineerPetr.wages();
        managerVolodya.wages();
    }
}
