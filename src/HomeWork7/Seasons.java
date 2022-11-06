package HomeWork7;

public enum Seasons {
//    в Северном полушарии осень продолжается приблизительно 89,8 суток, зима — 89, весна — 92,8, лето — 93,6.
    WINTER(89, "cold, snow, my happy birthday"),
    SPRING(93, "warming, bloom, Pancake week"),
    SUMMER(94, "heat, fishing, holiday"),
    AUTUMN(90, "dirt, rains, september first, ");
    private final int countOfDays;
    private final String description;

    Seasons(int countOfDays, String description) {
        this.countOfDays = countOfDays;
        this.description = description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public String getDescription() {
        return description;
    }
}
