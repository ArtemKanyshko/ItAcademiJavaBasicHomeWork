package HomeWork5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork5 {
    public static void main(String[] args) {
        System.out.println("Задание 1. Узнать количество знаков препинания. Введите текст: ");
        Scanner stringFromKeyboard = new Scanner(System.in);
        String setWords = stringFromKeyboard.nextLine();
        amountPunctuationMark(setWords);
        System.out.println("Задание 2. Подсчитать количество слов в тексте. Введите текст: ");
        setWords = stringFromKeyboard.nextLine();
        wordsInSentence(setWords);
        System.out.println("Задание 3. Вывести на экран текст, составленный из последних букв слов. Введите текст: ");
        setWords = stringFromKeyboard.nextLine();
        lastLetterWord(setWords);
        System.out.println("Задание 4. поиск в строке шестнадцатеричных чисел. Введите текст: ");
        setWords = stringFromKeyboard.nextLine();
        findHexadecimalNumbers(setWords);
        System.out.println("Задание 5. Заменить теги абзацев на простые теги абзацев <p>. Введите текст: ");
        setWords = stringFromKeyboard.nextLine();
        paragraphTagReplacement(setWords);
        // задание 6: сложить 1000000 раз строку "aaabbbccc", у меня вышло 2600сек)
        compareTimeMethod();

    }
    /* 1. Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки
    препинания. Подсчитать общее их количество.
    */
    public static void amountPunctuationMark (String setWords) {
        // создаем новую строку без знаков препинания
        String setWordsNotPunctuation = setWords.replaceAll("\\p{Punct}", "");
        // находим разницу между строками
        System.out.println("Количество знаков препинания: " + (setWords.length() - setWordsNotPunctuation.length()));
    }
    /* 2. Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что слова
    могут разделяться несколькими пробелами, в начале и конце текста также могут
    быть пробелы, но могут и отсутствовать.
    */
    public static void wordsInSentence (String setWords) {
        // меняем знаки препинания на пробелы (если в начале строки есть и пробелы и знаки препинания)
        String setWordsNotPunctuation = setWords.replaceAll("\\p{Punct}\\d", " ");
        //выводим количество слов в строке
        System.out.println("Количество слов в строке: " + setWordsNotPunctuation.trim().split("\\s+").length);
    }
    /* 3. Введите с клавиатуры текст. Выведите на экран текст, составленный из последних
    букв всех слов из исходного текста.
    */
    public static void lastLetterWord (String setWords) {
        String setWordsNotPunctuation = setWords.replaceAll("[\\p{Punct}\\d]", " ");
        String[] words = setWordsNotPunctuation.trim().split("\\s+");
        StringBuilder lastLetterWord = new StringBuilder(); // создаем пустую строку
        for (String newWords : words) {
            // проходим циклом по массиву, забираем последний символ слова и добавляем в строку lastLetterWord
            lastLetterWord.append(newWords.charAt(newWords.length()-1));
        }
        System.out.println(Arrays.toString(words));
        System.out.println(lastLetterWord);
    }
    /* 4. Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
    шестнадцатеричных чисел, записанных по правилам Java, с помощью регулярных
    выражений. Результат работы метода выведите на экран.
    */
    public static void findHexadecimalNumbers (String setWords) {
        // поиск шестнадцатеричных чисел
        Pattern hexadecimalNumbers = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher matcher = hexadecimalNumbers.matcher(setWords);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println();
    }
    /* 5. Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке всех
    тегов абзацев, в том числе тех, у которых есть параметры, например, <p id=”p1”>, и
    замену их на простые теги абзацев <p>. Результат работы метода выведите на
    экран.
    */
    public static void paragraphTagReplacement (String setWords) {
        // ленивый режим квантификатора, проверяем совпадение на "<p" потом в конец проверки ставим ">"
        // и начинаем сверять "." (любой элемент) ноль или больше
        System.out.println(setWords.replaceAll("<p.*?>", "<p>"));
    }
    /* Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”, один
    с помощью оператора сложения и String, а другой с помощью StringBuilder и метода
    append. Сравните скорость их выполнения. Выведите сравнение на экран. System.currentTimeMillis();s
    */
    public static void compareTimeMethod() {
       String methodOne = "aaabbbccc";
       long methodOneTime = System.currentTimeMillis();
        for (int i = 0; i <= 1000000; i++) {
             methodOne += "aaabbbccc";
        }
        methodOneTime = System.currentTimeMillis() - methodOneTime;
        StringBuilder methodTwo = new StringBuilder("aaabbbccc");
        long methodTwoTime = System.currentTimeMillis();
        for (int i = 0; i <= 1000000; i++) {
            methodTwo.append("aaabbbccc");
        }
        methodTwoTime = System.currentTimeMillis() - methodTwoTime;
        String compareMethod = "";
        if (methodOneTime > methodTwoTime) {
            compareMethod = "медленнее";
        }
        else if (methodOneTime < methodTwoTime) {
            compareMethod = "быстрее";
        }
        else {
            compareMethod = "одновременно";
        }
        System.out.println("String: " + ((double) methodOneTime / 1000) + "s " + compareMethod + " StringBuilder: " +
            ((double) methodTwoTime / 1000)+ "s");
    }
}
