package HomeWork10;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork10 {
    public static void main(String[] args) {
        Random random = new Random();
        /* 1. Вывести список файлов и каталогов выбранного каталога на диске. Файлы и
        каталоги должны быть распечатаны отдельно.*/

        System.out.println("Задание 1. Вывести список файлов и каталогов выбранного каталога на диске.");
        File checkSrc = new File("./src");
        List<String> files = new ArrayList<>();
        List<String> catalog = new ArrayList<>();
        listFilesAndCatalog(checkSrc, files, catalog);
        System.out.println("files: " + files.toString());
        System.out.println();
        System.out.println("catalog: " + catalog.toString());
        System.out.println();

        /*2. Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
        препинания и слов. Вывести результат на экран.*/

        System.out.println("Задание 2. Создать файл с текстом, прочитать, подсчитать в тексте количество знаков " +
                "препинания и слов.");
        try {
            BufferedReader readerTask2 = new BufferedReader(new FileReader("./src/HomeWork10/textFileForTask2.txt"));
            String readLineTask2 = readerTask2.readLine();
            System.out.println(readLineTask2);
            String setWordsNotPunctuation = readLineTask2.replaceAll("\\p{Punct}", "");
            System.out.println("Количество знаков препинания: " + (readLineTask2.length()
                    - setWordsNotPunctuation.length()));
            String setWordsNotPunctuationForWords = readLineTask2.replaceAll("\\p{Punct}\\d", " ");
            System.out.println("Количество слов в строке: "
                    + setWordsNotPunctuationForWords.trim().split("\\s+").length);
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
        System.out.println();

        /* 3. Создать файл с текстом, в котором присутствуют числа. Найти все числа, вывести на
        экран, посчитать сумму вывести на экран, убрать все повторяющиеся числа и снова
        вывести на экран.*/

        System.out.println("Задание 3. Числа");
        try {
            BufferedReader readerTask3 = new BufferedReader(new FileReader("./src/HomeWork10/textFileForTask3.txt"));
            String readLineTask3 = readerTask3.readLine();
            System.out.println(readLineTask3);
            Pattern numbers = Pattern.compile("-?\\d+");
            Matcher matcher = numbers.matcher(readLineTask3);
            List<Integer> arraysNumber = new ArrayList<>();
            int numberSum = 0;
            while (matcher.find()) {
                arraysNumber.add(Integer.valueOf(matcher.group()));
                numberSum += Integer.parseInt(matcher.group());
            }
            System.out.println(arraysNumber);
            System.out.println("Сумма чисел: " + numberSum);
            Set<Integer> setNumber = new HashSet<>(arraysNumber);
            System.out.println(setNumber);
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
        System.out.println();

        /* 4. Записать с помощью Java в двоичный файл 20 случайных чисел. Прочитать
        записанный файл, вывести на экран числа и их среднее арифметическое.*/

        System.out.println("Задание 4. Записать с помощью Java в двоичный файл 20 случайных чисел");
        File textFileForTask4 = new File("./src/HomeWork10/textFileForTask4.txt");
        textFileForTask4.delete();
        try {
            textFileForTask4.createNewFile();
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(textFileForTask4, true)))) {
            for (int i = 0; i < 20; i++) {
                dos.writeInt(random.nextInt(30));
            }
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
        List<Integer> arraysNumberForTask4 = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("./src/HomeWork10/textFileForTask4.txt")))) {
            int numberForTask4 = dis.readInt();
            int numberForTask4Sum = 0;
            double average = 0;
            int amountNumber = 0;
            while (true) {
                numberForTask4Sum += numberForTask4;
                amountNumber++;
                arraysNumberForTask4.add(numberForTask4);
                try {
                    numberForTask4 = dis.readInt();
                } catch (EOFException e) {
                    break;
                }
            }
            System.out.println(arraysNumberForTask4);
            average = (double) numberForTask4Sum / amountNumber;
            System.out.println(average);
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
        System.out.println();

        /* 5. Создать цепочку из трех папок. В конечном каталоге создать 5 произвольных
        текстовых файлов. Заполнить их 10 случайными целыми числами. Содержимое
        файлов записать в один файл в том же каталоге. Создать файл, который будет
        содержать список файлов данного каталога.*/

        System.out.println("Задание 5.");
        File directory = new File("./src/HomeWork10/Package1/Package2/Package3");
        directory.mkdirs();

        File[] textFileForTask5 = new File[5];
        for (int i = 0; i < 5; i++) {
            textFileForTask5[i] = new File("./src/HomeWork10/Package1/Package2/Package3/textFileForTask" + i + ".txt");
            textFileForTask5[i].delete();
            try {
                    textFileForTask5[i].createNewFile();
            } catch (IOException e) {
                System.out.println("Ошибка " + e);
            }
        }
        for (File item : textFileForTask5) {
            try (PrintWriter pwTask5 = new PrintWriter(new BufferedWriter
                    (new FileWriter(item, true)))) {
                for (int i = 0; i < 10; i++) {
                    pwTask5.println(random.nextInt(30));
                }
            } catch (IOException e) {
                System.out.println("Ошибка " + e);
            }
        }
        File textFileForTAsk5General = new File("./src/HomeWork10/Package1/Package2/Package3/textFileForTask5General.txt");
        textFileForTAsk5General.delete();
        try {
            textFileForTAsk5General.createNewFile();
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
        try (PrintWriter pwTask5General = new PrintWriter(new BufferedWriter
                (new FileWriter(textFileForTAsk5General, true)))) {
            for (File item : textFileForTask5) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(item))) {
                    String read = "";
                    while (read != null) {
                        read = bufferedReader.readLine();
                        if (read != null) {
                            pwTask5General.print(read + " ");
                        }
                    }
                    pwTask5General.println();
                } catch (IOException e) {
                    System.out.println("Ошибка " + e);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
        File textFileForTAsk5ListFile = new File("./src/HomeWork10/Package1/Package2/Package3/textFileForTAsk5ListFile.txt");
        textFileForTAsk5ListFile.delete();
        try {
            textFileForTAsk5ListFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
        List <String> listFilesTask5 = new ArrayList<>();
        listFilesAndCatalog(directory, listFilesTask5);
        try (PrintWriter pwTask5ListFiles = new PrintWriter(new BufferedWriter
                (new FileWriter(textFileForTAsk5ListFile, true)))) {
            for (String nameTxt : listFilesTask5) {
                pwTask5ListFiles.println(nameTxt);
            }
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
        System.out.println("Папки созданы, файлы записаны");
        System.out.println();

        /* 6. Создать объект Person c полями name, surname, age. Создать два массива (имена и
        фамили). Сгенерировать 10 объектов класса Person со случайным age и случайно
        выбранными именами и фамилиями соответствующего типа. С помощью Java
        создать файл, в который запишется информация о этих людях.*/

        System.out.println("Задание 6.");
        int amountPerson = 10;
        Person[] person = new Person[amountPerson];
        String [] listName = {"Артем", "Андрей", "Александр", "Владимир", "Яна",
                "Катя", "Лена", "Вика", "Вероника"};
        String [] listSurname= {"Канышко", "Синицкий(ая)", "Иванов(а)", "Котиков(а)", "Смирнов(а)",
                "Олололов(а)"};
        for (int i = 0; i < amountPerson; i ++) {
            int rand1 = random.nextInt(listName.length);
            int rand2 = random.nextInt(listSurname.length);
            int age = random.nextInt(30);
            person[i] = new Person(listName[rand1], listSurname[rand2], age);
            System.out.println(person[i].toString());
        }
            File textFilePersonList = new File("./src/HomeWork10/textFilePersonList.txt");
            textFilePersonList.delete();
            try {
                textFilePersonList.createNewFile();
            } catch (IOException e) {
                System.out.println("Ошибка " + e);
            }
            try (PrintWriter pwTextFilePersonList = new PrintWriter(new BufferedWriter
                    (new FileWriter(textFilePersonList, true)))) {
                for (int i = 0; i < amountPerson; i ++) {
                    pwTextFilePersonList.println(person[i].toString());
                }
            } catch (IOException e) {
                System.out.println("Ошибка " + e);
            }
    }
    public static void listFilesAndCatalog (File checkSrc, List files, List catalog) {
        if (checkSrc.isDirectory()) {
            for (File item : checkSrc.listFiles()) {
                if (item.isDirectory()) {
                    catalog.add(item.getName());
                    listFilesAndCatalog(item, files, catalog);
                }
                else {
                    files.add(item.getName());
                }
            }
        }
    }
    public static void listFilesAndCatalog (File checkSrc, List files) {
        if (checkSrc.isDirectory()) {
            for (File item : checkSrc.listFiles()) {
                if (item.isDirectory()) {
                    listFilesAndCatalog(item, files);
                }
                else {
                    files.add(item.getName());
                }
            }
        }
    }
}
