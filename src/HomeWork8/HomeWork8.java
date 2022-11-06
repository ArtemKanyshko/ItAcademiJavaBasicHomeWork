package HomeWork8;

import java.util.*;

public class HomeWork8 {
    static Random random = new Random();
    public static void main(String[] args) {
        /* Создать список оценок учеников с помощью ArrayList, заполнить случайными
        оценками. Удалить неудовлетворительные оценки из списка.
        */
        System.out.println("Задание 1. Удаляем низкие оценки.");
        positiveRating();
        System.out.println();

        /* Создать коллекцию, заполнить ее случайными целыми числами. Удалить
        повторяющиеся числа. Результат - коллекция без повторов.
        */
        System.out.println("Задание 2. Убрать повторяющиеся числа");
        collectionNotRepeat();
        System.out.println();

        /* Создать список оценок учеников с помощью ArrayList, заполнить случайными
        оценками. Найти самую высокую оценку с использованием итератора.
        */
        System.out.println("Задание 3. Найти максимальную оценку");
        maxRating();
        System.out.println();

        /* Ввести текст с клавиатуры. Для текста создать Map, где ключом будет слово, а
        значение – количество повторений этого слова в тексте.
        */
        System.out.println("Задание 4. Создать map со словами и их количеством в тексте");
        System.out.println("Введите текст: ");
        Scanner stringFromKeyboard = new Scanner(System.in);
        String setWords = stringFromKeyboard.nextLine();
        amountWordsInText(setWords);

    }
    /* Создать список оценок учеников с помощью ArrayList, заполнить случайными
    оценками. Удалить неудовлетворительные оценки из списка.
    */
    public static void positiveRating () {
        List <Integer> rating = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            rating.add(random.nextInt(10));
        }
        System.out.println(rating);
        for (int i = 0; i < rating.size(); i++) {
            if (rating.get(i) <= 2) {
                rating.remove(i);
                i--;
            }
        }
        System.out.println(rating);
    }
    /* Создать коллекцию, заполнить ее случайными целыми числами. Удалить
    повторяющиеся числа. Результат - коллекция без повторов.
    */
    public static void collectionNotRepeat () {
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            number.add(random.nextInt(10));
        }
        System.out.println(number);
        Set<Integer> numberNotRepeat = new HashSet<>(number);
        System.out.println(numberNotRepeat);
    }
    /* Создать список оценок учеников с помощью ArrayList, заполнить случайными
    оценками. Найти самую высокую оценку с использованием итератора.
    */
    public static void maxRating () {
        List <Integer> rating = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            rating.add(random.nextInt(10));
        }
        System.out.println(rating);
        Iterator<Integer> ratingForIterator = rating.iterator();
        int maxRating = ratingForIterator.next();
        System.out.print("{ ");
        System.out.print(maxRating + " ");
        while (ratingForIterator.hasNext()) {
            int number = ratingForIterator.next();
            System.out.print(number + " ");
            if (number > maxRating) {
                maxRating = number;
            }
        }
        System.out.println("}");
        System.out.println("Самая высокая оценка: " + maxRating);
    }
    /* Ввести текст с клавиатуры. Для текста создать Map, где ключом будет слово, а
    значение – количество повторений этого слова в тексте.
    */
    public static void amountWordsInText (String setWords) {
        String setWordsNotPunctuation = setWords.replaceAll("[\\p{Punct}\\d–]", " ");
        List<String> words = new ArrayList<>(List.of(setWordsNotPunctuation.trim().toLowerCase().split("\\s+")));
        System.out.println(words);
        Set<String> wordsKey = new HashSet<>(words);
        System.out.println(wordsKey);
        Map<String, Integer> wordKeyAmountRepeat = new HashMap<>();
        Iterator<String> wordKeyIterator = wordsKey.iterator();
        String wordsKeyMap;
        int amountRepeat;
        while (wordKeyIterator.hasNext()) {
            wordsKeyMap = wordKeyIterator.next();
            amountRepeat = 0;
            for (String word : words) {
                if (word.equals(wordsKeyMap)) {
                    amountRepeat++;
                }
            }
            wordKeyAmountRepeat.put(wordsKeyMap, amountRepeat);
        }
        System.out.println(wordKeyAmountRepeat);
    }
}
